//p.700 예제 13-2  Runnable 인터페이스를 이용하여 1초 단위로 출력하는 타이머 스레드 만들기

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{//인터페이스 Runnable을 구현한 클래스 TimerRunnable
	private JLabel timerLabel; //타이머 값이 출력된 레이블 
	
	//매개변수(JLabel의 객체 timerLabel)로 갖는  생성자 
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;//초 카운트를 출력할 레이블 
	}
	
	//스레드코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n=0; //타이머 카운트 값
		while(true) { //무한루프
			timerLabel.setText(Integer.toString(n)); //레이블에 카운트 값 출력 
			n++;
			try {
				Thread.sleep(1000); //1초동안 잠을 잔다
			}
			catch(InterruptedException e) { //예외발생시 스레드 종료 
				return;
			}
		}
	}	
}


public class RunnableTimerEx extends JFrame {//JFrame을 상속받은 RunnableTimerEx클래스
	public RunnableTimerEx() {//기본생성자 
		setTitle("Runnable 을 구현한 타이머 스레드 예제"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료 누르면 프로그램 종료
		Container c = getContentPane(); //콘텐츠팬 얻기
		c.setLayout(new FlowLayout()); //정렬
		
		//타이머 값을 출력할 레이블 생성 
		JLabel timerLabel = new JLabel();//JLabel 객체 생성 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//폰트지정
		c.add(timerLabel);//레이블을 콘텐츠팬에 붙이기 
		
		//타이머 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달 
		//timerLabel을 매개변수로 가지는 TimerRunnable클래스의 객체생성
		TimerRunnable runnable = new TimerRunnable(timerLabel);  
		Thread th = new Thread(runnable); //스레드 객체 생성 
		
		setSize(250, 150);
		setVisible(true);
		
		th.start(); //타이머 스레드가 실행을 시작하게 함 
	}

	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
