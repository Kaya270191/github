
import java.util.Scanner;
class MonthSchedule{ //필드
	Scanner S = new Scanner(System.in);
	Day day [] = new Day[31]; //day 객체 배열. 클래스 변수 
	boolean a = true;
		
	public MonthSchedule(){//생성자
		for(int i =0; i< day.length;i++) {
			day[i] = new Day();
		}
	}
	
	public void input() { //input 함수 
		System.out.println("날짜(1~31)?");
		int date = S.nextInt();
		
		System.out.println("할일(빈칸없이 입력)");
		String work = S.next();

		day[date-1].set(work);		
	}
	
	public void view() { //view 함수 
		System.out.println("날짜(1~31)?");
		int date = S.nextInt();
		
		System.out.println(date+"의 할 일은"+day[date-1].get()+"입니다.");		
	}
	
	
	public void finish() { //finish 함수 
		System.out.println("프로그램을 종료합니다");
		a= false;	
	}
	
	public void run() { //run 함수 
		
		while(a) {
		System.out.println("할일(입력:1, 보기:2, 끝내기:3 >>");
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
	private String work; //필드
	
	//생성자가 없으니 컴파일러가 기본 생성자를 만들고 일을 한다.
	
	public void set(String work) { //함수
		this.work=work;
		}	
	public String get() { //함수 
		return work;
		}
	public void show() { //함수 
		if(work==null) System.out.println("없습니다");
		else System.out.println(work+"입니다");
	}
	
	public static void main(String[] args) {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		MonthSchedule month = new MonthSchedule();
		month.run();
	}

}
