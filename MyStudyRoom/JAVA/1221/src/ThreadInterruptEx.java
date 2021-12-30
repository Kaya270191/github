//p.711 ���� 13-5 
//Ÿ�̸� ������ ���� ���� 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable1 implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable1(JLabel timerLabel) { //������ 
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

//JFrame�� ��ӹ��� ThreadInterruptExŬ���� 
public class ThreadInterruptEx extends JFrame {
	private Thread th; //������ 
	public ThreadInterruptEx() { //������ 
		setTitle("ThreadInterruptEx ����"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //��������
		c.setLayout(new FlowLayout());//����
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel(); //JLabel ��ü ���� 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//��Ʈ����
		
		//Ÿ�̸� ������� ����� Runnable ��ü ���� 
		//Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ� �����Ѵ� 
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);//TimerRunnable1��ü����
		th = new Thread(runnable);//������ ���� 
		c.add(timerLabel);
		
		//��ư�� �����ϰ� Action�����ʿ� ��� 
		JButton btn = new JButton("kill Timer"); //��ư����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//Ÿ�̸� ������ ���� ���� 
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //��ư ��Ȱ��ȭ 
			}
		});
	
	c.add(btn);
	
	setSize(300,170);
	setVisible(true);
	
	th.start(); //������ ���۽�Ŵ 
	}
	
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}
