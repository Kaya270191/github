//p.508 9-2
//3���� ��ư ������Ʈ�� ���� ���� ������ ����� 

import javax.swing.*;
import java.awt.*;

public class E9_2 extends JFrame{ //JFrame�� ��ӹ��� E9_2
	public E9_2() { // E9_2 ������ 
		setTitle("ContentPane & JFrame"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ������ ���α׷� ����
		
		Container contentPane = getContentPane(); //�����̳� �� ��������
		contentPane.setBackground(Color.orange); //���������� �� ��������
		contentPane.setLayout(new FlowLayout()); //���������� ���̾ƿ��� FlowLayout
		
		contentPane.add(new JButton("OK")); //�������ҿ� ��ư ����
		contentPane.add(new JButton("Cancel")); //�������ҿ� ��ư ����
		contentPane.add(new JButton("Ignore")); //�������ҿ� ��ư ����
		
		setSize(300,150); //������ ������
		setVisible(true); //������ ��� 
	}

	public static void main(String[] args) {
		new E9_2();
	}
}
