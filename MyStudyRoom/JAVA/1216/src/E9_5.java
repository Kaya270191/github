//p521
//9-5  GridLayout ���� �Է��� ����� 

import javax.swing.*;
import java.awt.*;

public class E9_5 extends JFrame{ //JFrame�� ��ӹ��� Ŭ���� E9_5
	public E9_5() { //������ 
		setTitle("GridLayout Sample"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���α׷� ���� 
		
		GridLayout grid = new GridLayout(4,2);//4X2 ������ GridLayout ��ġ������ ���� 
		grid.setVgap(5);//���� ������ ���� ������ 5 �ȼ�
		
		Container c = getContentPane(); //�������� ����
		c.setLayout(grid);//grid�� ���������� �����ڷ� ���� 
		c.add(new JLabel("name"));
		c.add(new JTextField(""));
		c.add(new JLabel("id"));
		c.add(new JTextField(""));
		c.add(new JLabel("department"));
		c.add(new JTextField(""));
		c.add(new JLabel("subject"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new E9_5();
	}
}
