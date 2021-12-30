//p.243 Circle 클래스와 CircleManager 클래스 완성하기 
//3개의 Circle 객체 배열을 만들고 x,y, radius 값을 읽어 3개의 Circle 객체를 만들고 show()를 이용하여 모두 출력

import java.util.Scanner;

class Circle1{ //클래스
	private double x, y;
	private int radius;
	
	public Circle1(double x, double y, int radius) {//생성자 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() { //show 함수 
		System.out.println("("+ x +" "+ y +")"+ " "+ radius);		
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle1 C [] = new Circle1[3]; //3개의 Circle1 배열 선언 
		for(int i=0; i< C.length ;i++) {
			System.out.println("x,y,radius>>");
			double x = scanner.nextDouble(); //x 값 읽기
			double y = scanner.nextDouble(); //y 값 읽기
			int radius = scanner.nextInt(); //r 값 읽기
			C[i] = new Circle1(x,y,radius); //Circle 객체 생성
	}
	
		for(int i =0; i<C.length; i++) {
			C[i].show();			
		}; //모든 Circle 객체 출력	
	}
}
