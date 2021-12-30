//p.524
//예제 9-6 배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 절대 크기로 지정 

import javax.swing.*;
import java.awt.*;

public class E9_6 extends JFrame{ //JFrame을 상속받은E9_6
	public E9_6() { //생성자 
		setTitle("Null container sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//컨텐츠팬 얻기
		c.setLayout(null); //컨텐츠팬의 배치관리자 제거 
		
		//JLabel 컴포넌트 생성하고 위치, 크기 직접 지정 
		JLabel la = new JLabel("hello, press buttons");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);//라벨을 컨테이너에 붙이기 
		
		for(int i =1; i<=9; i++) { //버튼 생성 
			JButton b = new JButton(Integer.toString(i));//문자로 만든 i 버튼만들기 
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b); //컨테이너에 버튼 붙이기 
		}
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E9_6();
	}
}
