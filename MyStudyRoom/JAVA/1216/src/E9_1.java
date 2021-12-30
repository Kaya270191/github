//p.504  
//9-1 300X300 크리의 스윙 프레임 만들기

import javax.swing.*;

public class E9_1 extends JFrame{
	
	public E9_1() { //생성자
		setTitle("300x300 스윙 프레임 만들기 "); //제목
		setSize(300,300); //크기
		setVisible(true); //프레임 출력
	}

	public static void main(String[] args) {
		E9_1 frame = new E9_1();
	}
}
