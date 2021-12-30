//p.700 ���� 13-2  Runnable �������̽��� �̿��Ͽ� 1�� ������ ����ϴ� Ÿ�̸� ������ �����

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{//�������̽� Runnable�� ������ Ŭ���� TimerRunnable
	private JLabel timerLabel; //Ÿ�̸� ���� ��µ� ���̺� 
	
	//�Ű�����(JLabel�� ��ü timerLabel)�� ����  ������ 
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;//�� ī��Ʈ�� ����� ���̺� 
	}
	
	//�������ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���ѷ���
			timerLabel.setText(Integer.toString(n)); //���̺� ī��Ʈ �� ��� 
			n++;
			try {
				Thread.sleep(1000); //1�ʵ��� ���� �ܴ�
			}
			catch(InterruptedException e) { //���ܹ߻��� ������ ���� 
				return;
			}
		}
	}	
}


public class RunnableTimerEx extends JFrame {//JFrame�� ��ӹ��� RunnableTimerExŬ����
	public RunnableTimerEx() {//�⺻������ 
		setTitle("Runnable �� ������ Ÿ�̸� ������ ����"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� ������ ���α׷� ����
		Container c = getContentPane(); //�������� ���
		c.setLayout(new FlowLayout()); //����
		
		//Ÿ�̸� ���� ����� ���̺� ���� 
		JLabel timerLabel = new JLabel();//JLabel ��ü ���� 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//��Ʈ����
		c.add(timerLabel);//���̺��� �������ҿ� ���̱� 
		
		//Ÿ�̸� ������� ����� Runnable ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ���� 
		//timerLabel�� �Ű������� ������ TimerRunnableŬ������ ��ü����
		TimerRunnable runnable = new TimerRunnable(timerLabel);  
		Thread th = new Thread(runnable); //������ ��ü ���� 
		
		setSize(250, 150);
		setVisible(true);
		
		th.start(); //Ÿ�̸� �����尡 ������ �����ϰ� �� 
	}

	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
