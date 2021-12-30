//p.727 ���� 13-7  wait(), notify()�� �̿��� �� ä��� 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//JLabel�� ��ӹ��� MyLabel Ŭ���� 
class MyLabel extends JLabel{
	private int barSize = 0; //���� �׷������� ���� ũ��
	private int maxBarSize; //���� �ִ� ũ�� 
	
	public MyLabel(int maxBarSize) {//������ 
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0) return;//ũ�Ⱑ 0�̴� �ٸ� �׸� �ʿ� ���� 
		g.fillRect(0,0, width, this.getHeight());
	}
	
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();//�ٰ� �ִ��̸� consumerThread�� ���� �ٰ� �پ�� ������ ��� 
			}catch(InterruptedException e) {
				return;
			}
		}
		barSize++;
		repaint();//���� ũ�Ⱑ �������� �ٽ� �׸���
		notify();//��ٸ��� consumerThread�����
	}
	synchronized public void consume() {
		if(barSize==0) {
			try {
				wait(); //���� ũ�Ⱑ 0�̸� ���� ũ�Ⱑ 0���� Ŀ�� ������ ��� 
			}catch(InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();//���� ũ�Ⱑ �������� �ٽ� �׸���
		notify();//��ٸ��� �̺�Ʈ ������ ����� 
	}
}

//Thread�� ��ӹ��� ConsumerThread Ŭ���� 
class ConsumerThread extends Thread{
	private MyLabel bar; 
	public ConsumerThread(MyLabel bar) {//������ 
		this.bar = bar;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();//0.2�ʸ��� �ٸ� 1�� ���δ� 
			}catch (InterruptedException e) { 
				return;
			}
		}
	}
}


//JFrame�� ��ӹ��� TabAndThreadEx
public class TabAndThreadEx extends JFrame{
	private MyLabel bar = new MyLabel(100); //���� �ִ� ũ�⸦ 100���� ���� 
	
	public TabAndThreadEx(String title) { //������ 
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //�������� ���
		c.setLayout(null);
		bar.setBackground(Color.ORANGE); //����
		bar.setOpaque(true);
		bar.setLocation(20,50);//�� ��ġ
		bar.setSize(300,20);//�� ������
		c.add(bar);//�������� �� ���̱� 
		
		//�������ҿ� Ű �̺�Ʈ �ڵ鷯 ��� 
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill(); //Ű�� ���� ������ �ٰ� 1�� ����
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();// ������ �ҿ� Ű ó���� �ο� 
		ConsumerThread th = new ConsumerThread(bar);//������ ���� 
		th.start();//������ ���� 
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx("�ƹ�Ű�� ���� ���� �� ä���");
	}
}
