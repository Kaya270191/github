//2번 

import java.util.Scanner;
public class Grade { //grade 클래스 
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) { //생성자
		this.math= math;
		this.science= science;
		this.english= english;
	}
	
	public int average() { //average 함수 
		return (math+ science+ english)/3;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = S.nextInt();
		int science = S.nextInt();
		int english = S.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은"+ me.average()); 
		
		S.close();
	}

}
