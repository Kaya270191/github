//p.9-3 
//FlowLayout 배치 관리자 활용


import javax.swing.*;
import java.awt.*;

public class E9_3 extends JFrame { //JFrame 을 상속받은 E9_3
	public E9_3() {//생성자 
		setTitle("FlowLayout Sample"); //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 누르면 프로그램 종료 
		Container c = getContentPane(); //컨텐트 팬 얻기 
		
		//컨탠트 팬에 FlowLayout 배치관리자 설정 
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
