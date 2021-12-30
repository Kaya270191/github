//p.508 9-2
//3개의 버튼 컴포넌트를 가진 스윙 프레임 만들기 

import javax.swing.*;
import java.awt.*;

public class E9_2 extends JFrame{ //JFrame을 상속받은 E9_2
	public E9_2() { // E9_2 생성자 
		setTitle("ContentPane & JFrame"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 닫으면 프로그램 종료
		
		Container contentPane = getContentPane(); //컨테이너 팬 가져오기
		contentPane.setBackground(Color.orange); //컨텐츠팬의 색 오렌지로
		contentPane.setLayout(new FlowLayout()); //컨텐츠팬의 레이아웃을 FlowLayout
		
		contentPane.add(new JButton("OK")); //컨텐츠팬에 버튼 생성
		contentPane.add(new JButton("Cancel")); //컨텐츠팬에 버튼 생성
		contentPane.add(new JButton("Ignore")); //컨텐츠팬에 버튼 생성
		
		setSize(300,150); //프레임 사이즈
		setVisible(true); //프레임 출력 
	}

	public static void main(String[] args) {
		new E9_2();
	}
}
