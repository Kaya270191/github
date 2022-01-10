//4-12 
//static을 이용한 환욜 계산기 
//static 메소드는 static 멤버만 사용가능 , this 사용 불가 

import java.util.Scanner;

class CurrencyConverter{
	private static double rate; //static 멤버 
	public static double toDollar(double won) { //static 함수 - static 멤버인 rate 사용 
		return won/rate;
	}
	public static double toKWR(double dollar) { //static 함수 - static 멤버인 rate 사용 
		return dollar * rate;
	}
	public static void setRate(double r) { //static 함수 - static 멤버인 rate 사용
		rate = r;
	}
}


public class p_ch4_12 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("환율 1달러>>>");
		double rate = S.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은" + CurrencyConverter.toDollar(1000000)+"입니다"); //클래스명.메소드명()
		System.out.println("$100은" + CurrencyConverter.toKWR(100) +"입니다");//클래스명.메소드명()

	}

}
