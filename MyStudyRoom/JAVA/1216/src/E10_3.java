//p.551
//���� 10-3 �͸� Ŭ������ Action �̺�Ʈ ������ ����� 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10_3 extends JFrame{
	public E10_3() {
		setTitle("Action �̺�Ʈ ������ ����"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ���α׷� ���� 
		Container c = getContentPane(); //�������� ��� 
		c.setLayout(new FlowLayout()); //�÷η��̾ƿ� ����
		JButton btn = new JButton("Action"); //Action �̶�� ��ư ���� 
		btn.addActionListener(new MyActionListener()); //��ư�� �̺�Ʈ������ �ޱ� 
		c.add(btn);//�������ҿ� ��ư �߰��ϱ�
		
		//�͸�Ŭ������ Action������ �ۼ� 
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// �߻� �޼ҵ� ����, �������̵�  
				JButton b = (JButton)e.getSource();//�̺�Ʈ �ҽ� ��ư �˾Ƴ��� , �ٿ�ĳ����
				if(b.getText().equals("Action")) //��ư�� ���ڿ��� Action ����
					b.setText("�׼�"); // ��ư ���ڿ��� �׼����� ���� 
				else
					b.setText("Action");// ��ư ���ڿ��� Action���� ���� 
				
				setTitle(b.getText());
			}
	});
		setSize(350, 150);
		setVisible(true);
	}
			
	public static void main(String[] args) {
		new E10_3();
	}
}
