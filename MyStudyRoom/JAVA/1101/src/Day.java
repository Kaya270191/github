
import java.util.Scanner;
class MonthSchedule{ //�ʵ�
	Scanner S = new Scanner(System.in);
	Day day [] = new Day[31]; //day ��ü �迭. Ŭ���� ���� 
	boolean a = true;
		
	public MonthSchedule(){//������
		for(int i =0; i< day.length;i++) {
			day[i] = new Day();
		}
	}
	
	public void input() { //input �Լ� 
		System.out.println("��¥(1~31)?");
		int date = S.nextInt();
		
		System.out.println("����(��ĭ���� �Է�)");
		String work = S.next();

		day[date-1].set(work);		
	}
	
	public void view() { //view �Լ� 
		System.out.println("��¥(1~31)?");
		int date = S.nextInt();
		
		System.out.println(date+"�� �� ����"+day[date-1].get()+"�Դϴ�.");		
	}
	
	
	public void finish() { //finish �Լ� 
		System.out.println("���α׷��� �����մϴ�");
		a= false;	
	}
	
	public void run() { //run �Լ� 
		
		while(a) {
		System.out.println("����(�Է�:1, ����:2, ������:3 >>");
		int num = S.nextInt();
		if (num==1) {
			input();
		}
		else if (num==2) {
			view();
		}
		else if (num==3) {
			finish();
		}
		}
	}
	
}

class Day {
	private String work; //�ʵ�
	
	//�����ڰ� ������ �����Ϸ��� �⺻ �����ڸ� ����� ���� �Ѵ�.
	
	public void set(String work) { //�Լ�
		this.work=work;
		}	
	public String get() { //�Լ� 
		return work;
		}
	public void show() { //�Լ� 
		if(work==null) System.out.println("�����ϴ�");
		else System.out.println(work+"�Դϴ�");
	}
	
	public static void main(String[] args) {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		MonthSchedule month = new MonthSchedule();
		month.run();
	}

}
