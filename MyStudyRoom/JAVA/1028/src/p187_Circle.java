//2개의 생성자를 가진 Circle 클래스 

public class p187_Circle {
	int radius; // 필드
	String name; //필드 
	
	public p187_Circle() { //생성자는 클래스 이름과 동일, 매개 변수 없는 생성자 
		radius =1; name = ""; }// 필드 초기화
		 
	
	public p187_Circle(int r, String n) {
		radius = r; name =n; //매개변수로 필드 초기화 
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
		
	

	public static void main(String[] args) {
		p187_Circle pizza = new p187_Circle(10,"자바피자"); //객체 생성, 반지름 10, 이름 자바피차
		
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은 "+ area);
		
		p187_Circle donut = new p187_Circle(); //객체 생성, 반지름1, 이름""로 초기화
		donut.name ="도넛피자"; //이름 변경
		area= donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
	

	}

}
