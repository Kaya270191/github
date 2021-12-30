//p. 696 ����13-1 Thread�� ��ӹ޾� 1�� ������ ����ϴ� Ÿ�̸� ������ �����

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺�  
	
	//JLabel�� ��ü�� �Ű������� �޴� TimerThread������ 
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //Ÿ�̸� ī��Ʈ�� ����� ���̺� 
	}
	
	@Override
	public void run() {
		int n=0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���ѷ���
			timerLabel.setText(Integer.toString(n));//���̺�  ī��Ʈ �� ��� 
			n++; //ī��Ʈ ���� 
			try {
				Thread.sleep(1000); //1�ʵ��� ���� �ܴ�
			}
			catch(InterruptedException e) { //���� �߻��� ������ ���� 
				return;
			}
		}			
	}	
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() { //������ 
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); //���̺� ��ü ���� 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//��Ʈ ����
		c.add(timerLabel); //���̺��� ����Ʈ�ҿ� ���� 
		
		//timerLabel �� �Ű������� �ϴ� TimerThreadŬ������ ��ü ���� 
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start(); //Ÿ�̸� ������ ���� ����-> TimerThread�� run()�޼ҵ� ���� 
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
