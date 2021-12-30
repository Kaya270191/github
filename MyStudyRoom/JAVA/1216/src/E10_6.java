//p.561
//예제 10-6 다양한 키이벤트와 키리스너 활용

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class E10_6 extends JFrame{ //JFrame을 상속받은 E10_6 클래스 
	private JLabel[] keyMessage; //3배열을 메시지를 출력할 레이블 컴포넌트 배열 
	
	public E10_6() { //생성자 
		setTitle("title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener()); //컨텐츠팬에 키리스너 추가 
		
		keyMessage = new JLabel [3]; //레이블 배열
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyCode() ");
		keyMessage[2] = new JLabel(" getKeyCode() ");
		
		for(int i =0; i<keyMessage.length; i++) {//컨텐츠팬에 레이블 컴포넌트 더하기 
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
			
		}
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();	
	}

	class MyKeyListener extends KeyAdapter{ //키리스너 구현 
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toBinaryString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");
		}
		public void keyRelease(KeyEvent e) {
			System.out.println("KeyReleased");	
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	
	public static void main(String[] args) {
		new E10_6();
	}
}
