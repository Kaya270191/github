//p.385
//6.경과시간을 맞추는 게임을 작성하라
//enter키를 입력하면 현재 초 시간을 보여주고 여기서 10초에 더 근접하도록 다음 enter키를 입력한 사람이 이기는 게임
import java.util.Calendar;
import java.util.Scanner;

public class Ex6 {
	public static int printCalendar(Calendar cal) {	
		//int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		//int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재시간은 "+ second +"초");	
		return second;
	}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);	
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작<Enter>키");
		System.out.print("현재 초 시간>>" );
		Calendar time2 = Calendar.getInstance(); //Calendar 객체 생성 
		printCalendar(time2); //현재 시간 t2
		int t2 = printCalendar(time2);
					
		System.out.print("10초 예상 후 <Enter>키");
		String tenSeconds = S.nextLine(); 
		System.out.print("현재 초 시간>>" );
		Calendar time3 = Calendar.getInstance(); //Calendar 객체 생성 
		printCalendar(time3); //기태 시간 t3
		int t3 = printCalendar(time3);
		
		System.out.print("이재문 시작<Enter>");
		String tenSecondss = S.nextLine();
		System.out.print("현재 초 시간>>" );
		Calendar time4 = Calendar.getInstance(); //Calendar 객체 생성
		printCalendar(time4);
		int t4 = printCalendar(time4);
		
		int tKitae = Math.abs(t2-t3);//현재초-누른초 의 절대값
		int tLee = Math.abs(t3-t4);//현재초-누른초 의 절대값
			
		if ( (Math.abs(10-tKitae)) < (Math.abs(10-tLee))) {
			System.out.println("황기태의 결과:" + (Math.abs(t2-t3)) 
					+", 이재문의 결과: " + (Math.abs(t2-t4)) + 
					"승자는 황기태");
		}
		else if(10-(Math.abs(t2-t3)) > 10-(Math.abs(t2-t4)))
		System.out.println("황기태의 결과:" + (Math.abs(t2-t3)) 
				+", 이재문의 결과: " + (Math.abs(t2-t4)) + 
				" 승자는 이재문");
		S.close();
		}
}