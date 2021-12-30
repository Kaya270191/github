//p.549 
//예제 10-2 내부클래스로 Action 이벤트 리스너 만들기 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10_2 extends JFrame{ 
	public E10_2() {
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
		
	private class MyActionListener implements ActionListener{ //ActionsListener를 구현한 MyActionListener 내부클래스 
		public void actionPerformed(ActionEvent e) {// 추상 메소드 구현, 오버라이딩  
			JButton b = (JButton)e.getSource();//이벤트 소스 버튼 알아내기 , 다운캐스팅
			if(b.getText().equals("Action")) //버튼의 문자열이 Action 인지
				b.setText("액션"); // 버튼 문자열을 액션으로 변경 
			else
				b.setText("Action");// 버튼 문자열을 Action으로 변경 
						
			//E10_2의 멤버나 JFrame의 멤버를 호출할 수 있다. 
			//상위클래스.하위클래스MyActionListener.타이틀 
			E10_2.this.setTitle(b.getText()); //프레임의 타이틀에 버튼 문자열을 출력한다. 
		}
	}

	public static void main(String[] args) {
		new E10_2();
	}
}
