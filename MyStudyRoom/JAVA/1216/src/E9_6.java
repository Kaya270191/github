//p.524
//���� 9-6 ��ġ������ ���� �����̳ʿ� ������Ʈ�� ���� ��ġ�� ���� ũ��� ���� 

import javax.swing.*;
import java.awt.*;

public class E9_6 extends JFrame{ //JFrame�� ��ӹ���E9_6
	public E9_6() { //������ 
		setTitle("Null container sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//�������� ���
		c.setLayout(null); //���������� ��ġ������ ���� 
		
		//JLabel ������Ʈ �����ϰ� ��ġ, ũ�� ���� ���� 
		JLabel la = new JLabel("hello, press buttons");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);//���� �����̳ʿ� ���̱� 
		
		for(int i =1; i<=9; i++) { //��ư ���� 
			JButton b = new JButton(Integer.toString(i));//���ڷ� ���� i ��ư����� 
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b); //�����̳ʿ� ��ư ���̱� 
		}
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E9_6();
	}
}
