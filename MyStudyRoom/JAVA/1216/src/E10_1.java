//p.548 
//예제 10-1. 독립클래스로 Action 이벤트의 리스너 작성

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10_1 extends JFrame { //JFrame을 상속받은 E10_1
	public E10_1() {//생성자 
		setTitle("Action 이벤트 리스너 예제"); //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 누르면 프로그램 종료 
		Container c = getContentPane(); //컨텐츠팬 얻기 
		c.setLayout(new FlowLayout()); //플로레이아웃 적용
		JButton btn = new JButton("Action"); //Action 이라는 버튼 생성 
		btn.addActionListener(new MyActionListener()); //버튼에 이벤트리스너 달기 
		c.add(btn);//컨텐츠팬에 버튼 추가하기
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E10_1();
	}
}

//독립된 클래스로 이벤트 리스너 작성

class MyActionListener implements ActionListener{ //ActionsListener를 구현한 MyActionListener 클래스 
	public void actionPerformed(ActionEvent e) {// 추상 메소드 구현, 오버라이딩  
		JButton b = (JButton)e.getSource();//이벤트 소스 버튼 알아내기 , 다운캐스팅
		if(b.getText().equals("Action")) //버튼의 문자열이 Action 인지
			b.setText("액션"); // 버튼 문자열을 액션으로 변경 
		else
			b.setText("Action");// 버튼 문자열을 Action으로 변경 
	}
}
