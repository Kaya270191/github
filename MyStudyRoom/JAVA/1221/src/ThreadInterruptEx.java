//p.711 예제 13-5 
//타이머 스레드 강제 종료 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable1 implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable1(JLabel timerLabel) { //생성자 
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

//JFrame을 상속받은 ThreadInterruptEx클래스 
public class ThreadInterruptEx extends JFrame {
	private Thread th; //스레드 
	public ThreadInterruptEx() { //생성자 
		setTitle("ThreadInterruptEx 예제"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //컨텐츠팬
		c.setLayout(new FlowLayout());//정렬
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel(); //JLabel 객체 생성 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));//폰트지정
		
		//타이머 스레드로 사용할 Runnable 객체 생성 
		//타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달한다 
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);//TimerRunnable1객체생성
		th = new Thread(runnable);//스레드 생성 
		c.add(timerLabel);
		
		//버튼을 생성하고 Action리스너에 등록 
		JButton btn = new JButton("kill Timer"); //버튼생성
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//타이머 스레드 강제 종료 
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //버튼 비활성화 
			}
		});
	
	c.add(btn);
	
	setSize(300,170);
	setVisible(true);
	
	th.start(); //스레드 동작시킴 
	}
	
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}
