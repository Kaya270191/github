//p.549 
//���� 10-2 ����Ŭ������ Action �̺�Ʈ ������ ����� 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10_2 extends JFrame{ 
	public E10_2() {
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
		
	private class MyActionListener implements ActionListener{ //ActionsListener�� ������ MyActionListener ����Ŭ���� 
		public void actionPerformed(ActionEvent e) {// �߻� �޼ҵ� ����, �������̵�  
			JButton b = (JButton)e.getSource();//�̺�Ʈ �ҽ� ��ư �˾Ƴ��� , �ٿ�ĳ����
			if(b.getText().equals("Action")) //��ư�� ���ڿ��� Action ����
				b.setText("�׼�"); // ��ư ���ڿ��� �׼����� ���� 
			else
				b.setText("Action");// ��ư ���ڿ��� Action���� ���� 
						
			//E10_2�� ����� JFrame�� ����� ȣ���� �� �ִ�. 
			//����Ŭ����.����Ŭ����MyActionListener.Ÿ��Ʋ 
			E10_2.this.setTitle(b.getText()); //�������� Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�. 
		}
	}

	public static void main(String[] args) {
		new E10_2();
	}
}
