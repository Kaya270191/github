
import java.util.Scanner;
public class practice4 { //클래스
	 
	int radius; //정수형 레퍼런스 radius
	String name;  //문자 레퍼런스 name
	public double getArea() { //리턴값 실수를 반환하는 함수 getArea()
		return 3.14*radius*radius; //리턴값 
	}

	public static void main(String[] args) {
		practice4  pizza; //클래스의 레퍼런스 pizza 선언
		pizza = new practice4(); //인스턴스 생성
		pizza.radius=10;//객체 pizza의 radius 멤버 접근
		pizza.name="java pizza"; //객체 pizza의 name 에 접근 
		double area = pizza.getArea(); //객체로 getArea()함수 호출해서 리턴받은 값을 area에 저장
		System.out.println(pizza.name + "의 면적은" + area);//프린트 
		
		practice4 donut = new practice4(); //클래스의 레퍼런스 선언 및 객체 생성
		donut.radius = 5;//객체의 radius 멤버 접근
		donut.name ="java donut"; //객체의 name멤버 접근
		area = donut.getArea();//객체로 getArea()함수 접근해서 리턴받은 값을 area에 저장 
		System.out.println(donut.name + "의 면적은" + area);
		
		

	}

}
