//p.715 예제 13-6 flag를 이용한 스레드 강제 종료 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Thread를 상속받은 RandomThread 클래스 
class RandomThread extends Thread{
	private Container contentPane; 
	private boolean flag=false; // 스레드의 종료 명령을 표시하는 플래그, true:종료지시
	
	public RandomThread(Container contentPane) { //생성자 
		this.contentPane = contentPane;
	}
	public void finish() {//스레드 종료 명령을 flag에 표시 
		flag = true; 
	}
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java"); //새 레이블 생성
			label.setSize(80,30); //레이블 크기
			label.setLocation(x,y); // 레이블을 컨텐츠팬 내의 임의의 위치로 설정
			contentPane.add(label); // 레이블을 컨텐츠팬에 추가
			contentPane.repaint();//컨텐츠팬을 다시 그려 추가된 레이블이 보이게 함 
			try {
				Thread.sleep(300);//0.3초 동안 잠을 잔다 
				if(flag==true) {//스레드가 종료하도록 지시받은 경우 
					contentPane.removeAll(); // 컨텐츠 팬 안의 모든 것 지우기
					label = new JLabel("finish");
					label.setSize(80,30);//finish레이블 크기
					label.setLocation(100,100);//위치
					
					label.setForeground(Color.RED);//색
					contentPane.add(label);//컨텐츠 팬에 finish레이블 붙이기
					contentPane.repaint();//컨텐츠팬을 다시 그려 추가된 레이블이 보이게 함 
					return;//스레드 종료 
				}
			}
			catch(InterruptedException e) {
				return;		
			}
		}
	}
}

//JFrame 클래스를 상속받은 ThreadFinishFlagEx 클래스 
public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;//스레드 레퍼런스 
	
	public ThreadFinishFlagEx() { //생성자 
		setTitle("ThreadFinishFlagEx 예제"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //컨텐츠 팬 얻기
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {//마우스 리스너 등록 
			@Override
			public void mousePressed(MouseEvent e) {//마우스 누르면 
				th.finish();//RandomThread 스레드 종료 명령
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);//스레드 생성, 스레드에 컨텐츠팬 전달 
		th.start();//스레드 시작 		
	}


	public static void main(String[] args) {
		new ThreadFinishFlagEx();

	}
}
