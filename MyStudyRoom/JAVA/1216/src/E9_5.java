//p521
//9-5  GridLayout 으로 입력폼 만들기 

import javax.swing.*;
import java.awt.*;

public class E9_5 extends JFrame{ //JFrame을 상속받은 클래스 E9_5
	public E9_5() { //생성자 
		setTitle("GridLayout Sample"); //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫으면 프로그램 종료 
		
		GridLayout grid = new GridLayout(4,2);//4X2 격자의 GridLayout 배치관리자 설정 
		grid.setVgap(5);//격자 사이의 수직 간격을 5 픽셀
		
		Container c = getContentPane(); //컨텐츠팬 설정
		c.setLayout(grid);//grid를 컨텐츠팬의 관리자로 지정 
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
