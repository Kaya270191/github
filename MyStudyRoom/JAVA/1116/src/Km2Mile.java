//p316.4
//Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하라


import java.util.Scanner;

abstract class Converter1{ //추상 클래스 Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString(); //추상 메서드
	abstract protected String getDestString(); //추상 메서드 
	protected double mile;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다."); //km를  mile로 바꿉니다.
		System.out.println(getSrcString() + "을 입력하세요>>"); 							//km를 입력하세요 
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
		scanner.close();
	}
}


public class Km2Mile {
	double mile;
	
	public Km2Mile(double mile) { //매개변수가 1개인 생성자 
		this.mile = mile;
	}
	
	protected double convert(double src) {
		return src/ mile;
		
	}
	protected String getSrcString() {
		return "Km";
		
	}
	protected String getDestString() {
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);  //1마일은  1.6Km
		toMile.run();
	}

	
}


