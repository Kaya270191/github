//p.9-3 
//FlowLayout ��ġ ������ Ȱ��


import javax.swing.*;
import java.awt.*;

public class E9_3 extends JFrame { //JFrame �� ��ӹ��� E9_3
	public E9_3() {//������ 
		setTitle("FlowLayout Sample"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ���α׷� ���� 
		Container c = getContentPane(); //����Ʈ �� ��� 
		
		//����Ʈ �ҿ� FlowLayout ��ġ������ ���� 
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new E9_3();
	}
}
