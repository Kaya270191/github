import java.util.Scanner;

public class p110_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오>>");
		
		int a = s.nextInt();
		
		int a5= a / 50000 ; //5만원으로 나눈 몫 
		int b= a % 50000 / 10000 ; //만원
		int c= a % 10000 / 1000 ; //천원
		int d= a % 1000 / 100 ; //백원
		int dd= a % 100 / 50 ;
		
		int e= a % 50 / 10 ; //십원
		int f= a % 10 / 1; //일원
		
		System.out.println("오만원권: " + a5 + "매");
		System.out.println("만원권: " + b + "매" );
		System.out.println("천원권: " + c + "매" );
		System.out.println("백원: " + d + "개" );
		System.out.println("오십원: " + dd + "개" );
		System.out.println("십원: " + e + "개" );
		System.out.println("일원: " + f + "개" );
		
	}

}
