//p.385
//6.����ð��� ���ߴ� ������ �ۼ��϶�
//enterŰ�� �Է��ϸ� ���� �� �ð��� �����ְ� ���⼭ 10�ʿ� �� �����ϵ��� ���� enterŰ�� �Է��� ����� �̱�� ����
import java.util.Calendar;
import java.util.Scanner;

public class Ex6 {
	public static int printCalendar(Calendar cal) {	
		//int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		//int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("����ð��� "+ second +"��");	
		return second;
	}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);	
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ����<Enter>Ű");
		System.out.print("���� �� �ð�>>" );
		Calendar time2 = Calendar.getInstance(); //Calendar ��ü ���� 
		printCalendar(time2); //���� �ð� t2
		int t2 = printCalendar(time2);
					
		System.out.print("10�� ���� �� <Enter>Ű");
		String tenSeconds = S.nextLine(); 
		System.out.print("���� �� �ð�>>" );
		Calendar time3 = Calendar.getInstance(); //Calendar ��ü ���� 
		printCalendar(time3); //���� �ð� t3
		int t3 = printCalendar(time3);
		
		System.out.print("���繮 ����<Enter>");
		String tenSecondss = S.nextLine();
		System.out.print("���� �� �ð�>>" );
		Calendar time4 = Calendar.getInstance(); //Calendar ��ü ����
		printCalendar(time4);
		int t4 = printCalendar(time4);
		
		int tKitae = Math.abs(t2-t3);//������-������ �� ���밪
		int tLee = Math.abs(t3-t4);//������-������ �� ���밪
			
		if ( (Math.abs(10-tKitae)) < (Math.abs(10-tLee))) {
			System.out.println("Ȳ������ ���:" + (Math.abs(t2-t3)) 
					+", ���繮�� ���: " + (Math.abs(t2-t4)) + 
					"���ڴ� Ȳ����");
		}
		else if(10-(Math.abs(t2-t3)) > 10-(Math.abs(t2-t4)))
		System.out.println("Ȳ������ ���:" + (Math.abs(t2-t3)) 
				+", ���繮�� ���: " + (Math.abs(t2-t4)) + 
				" ���ڴ� ���繮");
		S.close();
		}
}