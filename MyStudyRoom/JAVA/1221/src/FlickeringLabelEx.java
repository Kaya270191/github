//p.702 
//예제 13-3 깜빡이는 문자열을 가진 레이블 만들기 

import java.awt.*;
import javax.swing.*;

//인터페이스 Runnable를 구현하고, JLabel 클래스를 상속받는 FlickeringLabel 클래스 
class FlickeringLabel extends JLabel implements Runnable{
	private long delay; //배경색이 바뀌는 지연 시간, 밀리초 단위 
	
	//매개변수를 두 개 받는 FlickeringLabel 생성자 
	public FlickeringLabel(String text, long delay) {
		super(text); //JLabel 생성자 호출 
		this.delay =delay;
		setOpaque(true); //배경색 변경이 가능하도록 설정 
		
		Thread th = new Thread(this); //스레드 생성
		th.start(); //run()호출
	}
	//500 ms 마다 반복적으로 노란색과 초록색을 번갈아 배경색으로 변경한다 
	public void run() {
		int n =0;
		while(true) {
			if(n==0) 
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			try {
				Thread.sleep(delay); // delay 밀리초 동안 잠을 잔다 
			}
			catch(InterruptedException e) {
				return;
			}							
		}
	}
}

//JFrame를 FlickeringLabelEx클래스 
public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() { //생성자 
		setTitle("FlickeringLabelEx 예제"); //타이틀 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); //컨텐츠팬 지정
		c.setLayout(new FlowLayout()); // 정렬
		
		//깜박이는 레이블 생성 , 500밀리초 주기로 배경색 변경 
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
		
		//깜박이지 않는 레이블 생성 
		JLabel label = new JLabel("안깜빡");
		
		//깜박이는 레이블 생성  , 300밀리초 주기로 배경색 변경 
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(fLabel); //컨텐츠팬에  fLabel 붙이기 
		c.add(label);//컨텐츠팬에  label 붙이기 
		c.add(fLabel2);//컨텐츠팬에  fLabel2 붙이기 
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
