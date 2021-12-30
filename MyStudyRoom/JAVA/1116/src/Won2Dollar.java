//p.316
//3. Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성 

import java.util.Scanner;

abstract class Converter{ //추상 클래스 Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString(); //추상 메서드
	abstract protected String getDestString(); //추상 메서드 
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
		scanner.close();
	}
}

public class Won2Dollar extends Converter{ //추상 클래스 Converter를 상속받은 Won2Dollar 클래스 
	private double ratio;
		
	public Won2Dollar(double ratio) { //매개변수가 1개인 생성자 	
		this.ratio = ratio; 
	}
	
	protected double convert (double src) {
		return src / ratio;
	}
	
	protected String getSrcString() {
		return "won";
		
	}
	protected String getDestString() {
		return "dollar";
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}

}
