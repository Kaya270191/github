//p.516 
//9-4 BorderLayout ��ġ�����ڸ� ����ϴ� ��

import javax.swing.*;
import java.awt.*; 

public class E9_4 extends JFrame{ //JFrame�� ��ӹ��� E9_4
	public E9_4() { //������ 
		setTitle("BorderLayout Sample"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ���α׷� ���� 
		Container c = getContentPane(); //�������� ��� 
		
		//�������ҿ� BorderLayout������ ���� 
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new E9_4();
	}
}
