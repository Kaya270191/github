//p.702 
//���� 13-3 �����̴� ���ڿ��� ���� ���̺� ����� 

import java.awt.*;
import javax.swing.*;

//�������̽� Runnable�� �����ϰ�, JLabel Ŭ������ ��ӹ޴� FlickeringLabel Ŭ���� 
class FlickeringLabel extends JLabel implements Runnable{
	private long delay; //������ �ٲ�� ���� �ð�, �и��� ���� 
	
	//�Ű������� �� �� �޴� FlickeringLabel ������ 
	public FlickeringLabel(String text, long delay) {
		super(text); //JLabel ������ ȣ�� 
		this.delay =delay;
		setOpaque(true); //���� ������ �����ϵ��� ���� 
		
		Thread th = new Thread(this); //������ ����
		th.start(); //run()ȣ��
	}
	//500 ms ���� �ݺ������� ������� �ʷϻ��� ������ �������� �����Ѵ� 
	public void run() {
		int n =0;
		while(true) {
			if(n==0) 
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			try {
				Thread.sleep(delay); // delay �и��� ���� ���� �ܴ� 
			}
			catch(InterruptedException e) {
				return;
			}							
		}
	}
}

//JFrame�� FlickeringLabelExŬ���� 
public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() { //������ 
		setTitle("FlickeringLabelEx ����"); //Ÿ��Ʋ 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); //�������� ����
		c.setLayout(new FlowLayout()); // ����
		
		//�����̴� ���̺� ���� , 500�и��� �ֱ�� ���� ���� 
		FlickeringLabel fLabel = new FlickeringLabel("����", 500);
		
		//�������� �ʴ� ���̺� ���� 
		JLabel label = new JLabel("�ȱ���");
		
		//�����̴� ���̺� ����  , 300�и��� �ֱ�� ���� ���� 
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(fLabel); //�������ҿ�  fLabel ���̱� 
		c.add(label);//�������ҿ�  label ���̱� 
		c.add(fLabel2);//�������ҿ�  fLabel2 ���̱� 
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
