//p. 696 예제13-1 Thread를 상속받아 1초 단위로 출력하는 타이머 스레드 만들기

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	private JLabel timerLabel; //타이머 값이 출력되는 레이블  
	
	//JLabel의 객체를 매개변수로 받는 TimerThread생성자 
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //타이머 카운트를 출력할 레이블 
	}
	
	@Override
	public void run() {
		int n=0; //타이머 카운트 값
		while(true) { //무한루프
			timerLabel.setText(Integer.toString(n));//레이블에  카운트 값 출력 
			n++; //카운트 증가 
			try {
				Thread.sleep(1000); //1초동안 잠을 잔다
			}
			catch(InterruptedException e) { //예외 발생시 스레드 종료 
				return;
			}
		}			
	}	
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() { //생성자 
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); //레이블 객체 생성 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//폰트 지정
		c.add(timerLabel); //레이블을 컨텐트팬에 부착 
		
		//timerLabel 를 매개변수로 하는 TimerThread클래스의 객체 생성 
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start(); //타이머 스레드 실행 시작-> TimerThread의 run()메소드 실행 
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
