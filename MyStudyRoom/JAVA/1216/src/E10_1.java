//p.548 
//���� 10-1. ����Ŭ������ Action �̺�Ʈ�� ������ �ۼ�

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10_1 extends JFrame { //JFrame�� ��ӹ��� E10_1
	public E10_1() {//������ 
		setTitle("Action �̺�Ʈ ������ ����"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ���α׷� ���� 
		Container c = getContentPane(); //�������� ��� 
		c.setLayout(new FlowLayout()); //�÷η��̾ƿ� ����
		JButton btn = new JButton("Action"); //Action �̶�� ��ư ���� 
		btn.addActionListener(new MyActionListener()); //��ư�� �̺�Ʈ������ �ޱ� 
		c.add(btn);//�������ҿ� ��ư �߰��ϱ�
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E10_1();
	}
}

//������ Ŭ������ �̺�Ʈ ������ �ۼ�

class MyActionListener implements ActionListener{ //ActionsListener�� ������ MyActionListener Ŭ���� 
	public void actionPerformed(ActionEvent e) {// �߻� �޼ҵ� ����, �������̵�  
		JButton b = (JButton)e.getSource();//�̺�Ʈ �ҽ� ��ư �˾Ƴ��� , �ٿ�ĳ����
		if(b.getText().equals("Action")) //��ư�� ���ڿ��� Action ����
			b.setText("�׼�"); // ��ư ���ڿ��� �׼����� ���� 
		else
			b.setText("Action");// ��ư ���ڿ��� Action���� ���� 
	}
}
