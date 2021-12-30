//p.715 ���� 13-6 flag�� �̿��� ������ ���� ���� 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Thread�� ��ӹ��� RandomThread Ŭ���� 
class RandomThread extends Thread{
	private Container contentPane; 
	private boolean flag=false; // �������� ���� ����� ǥ���ϴ� �÷���, true:��������
	
	public RandomThread(Container contentPane) { //������ 
		this.contentPane = contentPane;
	}
	public void finish() {//������ ���� ����� flag�� ǥ�� 
		flag = true; 
	}
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java"); //�� ���̺� ����
			label.setSize(80,30); //���̺� ũ��
			label.setLocation(x,y); // ���̺��� �������� ���� ������ ��ġ�� ����
			contentPane.add(label); // ���̺��� �������ҿ� �߰�
			contentPane.repaint();//���������� �ٽ� �׷� �߰��� ���̺��� ���̰� �� 
			try {
				Thread.sleep(300);//0.3�� ���� ���� �ܴ� 
				if(flag==true) {//�����尡 �����ϵ��� ���ù��� ��� 
					contentPane.removeAll(); // ������ �� ���� ��� �� �����
					label = new JLabel("finish");
					label.setSize(80,30);//finish���̺� ũ��
					label.setLocation(100,100);//��ġ
					
					label.setForeground(Color.RED);//��
					contentPane.add(label);//������ �ҿ� finish���̺� ���̱�
					contentPane.repaint();//���������� �ٽ� �׷� �߰��� ���̺��� ���̰� �� 
					return;//������ ���� 
				}
			}
			catch(InterruptedException e) {
				return;		
			}
		}
	}
}

//JFrame Ŭ������ ��ӹ��� ThreadFinishFlagEx Ŭ���� 
public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;//������ ���۷��� 
	
	public ThreadFinishFlagEx() { //������ 
		setTitle("ThreadFinishFlagEx ����"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //������ �� ���
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {//���콺 ������ ��� 
			@Override
			public void mousePressed(MouseEvent e) {//���콺 ������ 
				th.finish();//RandomThread ������ ���� ���
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);//������ ����, �����忡 �������� ���� 
		th.start();//������ ���� 		
	}


	public static void main(String[] args) {
		new ThreadFinishFlagEx();

	}
}
