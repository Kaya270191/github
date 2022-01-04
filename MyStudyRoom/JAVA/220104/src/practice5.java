
public class practice5 { //클래스 
	int radius; //정수 필드멤버 radius
	String name; //문자 필드멤버 name
	
	public practice5() { //생성자 - 초기화
		radius = 1; 
		name = "";	
	}
	public practice5(int r, String n) { //매개변수를 정수와 문자를 받는 생성자 - 초기화
		radius =r ; 
		name = n;
	}
	public double getArea() { //실수값을 리턴하는 getArea()함수 
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		practice5 pizza = new practice5(10,"java pizza"); //레퍼런스 선언 및 객체 생성
		double area = pizza.getArea(); //객체로 getArea()함수 접근해서 리턴받은 값을 area에 저장
		
		practice5 donut =  new practice5(); //레퍼런스  선언 및  객체  생성
		donut.name="donut pizza"; //도넛피자 값을 필드에 저장
		area = donut.getArea();//객체로getArea()함수 접근해서 리턴받은 값을 area에저장 
		System.out.println(donut.name + "의 면적은" + area);

	}

}
