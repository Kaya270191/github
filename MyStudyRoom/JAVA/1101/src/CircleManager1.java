//p.243 Circle 클래스와 CircleManager 클래스 완성하기 
//3개의 Circle 객체 배열을 만들고 x,y, radius 값을 읽어 3개의 Circle 객체를 만들고 show()를 이용하여 모두 출력

import java.util.Scanner;

class Circle2{ //클래스
	private double x, y;
	private int radius;
	
	public Circle2(double x, double y, int radius) {//생성자 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() { //show 함수 
		System.out.println("("+ x +" "+ y +")"+ " "+ radius);		
	}
	
	public int getRadius() { 
		return radius; //int인 반지름 값 리턴-> 반지름이 가장 큰 것이 큰 원임  		 
	}
}

public class CircleManager1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle2 C [] = new Circle2[3]; //3개의 Circle1 배열 선언 
		for(int i=0; i< C.length ;i++) {
			System.out.println("x,y,radius>>");
			double x = scanner.nextDouble(); //x 값 읽기
			double y = scanner.nextDouble(); //y 값 읽기
			int radius = scanner.nextInt(); //r 값 읽기
			C[i] = new Circle2(x,y,radius); //Circle 객체 생성
	}
		int max =0; //최대값 구하기 
		for(int i=0; i<C.length; i++) 
			if (max < C[i].getRadius()) {
				max = C[i].getRadius();
			}
		for(int i=0; i<C.length; i++) 
			if(max==C[i].getRadius()) {
				System.out.println("가장 큰 면적의 원은");
				C[i].show();
			}
		}	
	}
