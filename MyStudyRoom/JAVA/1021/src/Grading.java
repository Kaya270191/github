import java.util.Scanner;


public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요(0~100)");
		int score = Scanner.nextInt(); //점수 읽기
		
		if(score >= 90)
			grade = 'A';
		
		else if(score >= 80)
			grade = 'B';
		
		else if(score >= 80)
			grade ='C';
		
		else if(score >=60)
			grade = 'D';
		else
			grade= 'F';
		
		System.out.println("학점은 " +  grade + "입니다.");

	}

}
