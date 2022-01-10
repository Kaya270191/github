//p.243
//5. 

import java.util.Scanner;

class Circle{
	private double x,y; //private멤버 변수 
	private int radius; //private멤버 변수
	public Circle(double x, double y, int radius) { //생성자 함수- 초기화 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() { //x,y,radius 값을 프린트하는 함수 
		System.out.println("("+x +","+ y +")"+ radius);		
	}
}


public class p243_ch4_5 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Circle c [] = new Circle[3]; // 크기가 3인 Circle 클래스의 객체 배열 생성 
		for(int i=0; i<c.length; i++) {
			System.out.println("x,y,radius>>"); //입력한 값으로 객체 생성 
			double x = S.nextDouble();
			double y = S.nextDouble();
			int radius = S.nextInt();
			
			c[i] = new Circle(x,y,radius); //생성자 함수 호출해서 객체 생성 
		}
		for(int i=0; i<c.length; i++) { //배열의 요소로 각각 show()함수를 호출
			c[i].show();
		}
	}
}
