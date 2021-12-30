//반지름과 이름을 가진 Circle 클래스 작성 

public class p_183Circle {
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드 
	
	public p_183Circle() {}  //생성자 
	
	public double getArea() { //원의 면적 계산 메소드 
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		p_183Circle pizza; //레퍼런스 변수 pizza 선언
		pizza = new p_183Circle(); //circle 객체 생성
		pizza.radius = 10; //피자 반지름
		pizza.name = "자바피자"; //피자 이름
		double area = pizza.getArea(); //피자 면적 
		System.out.println(pizza.name + "의 면적은 " + area);
		
		p_183Circle donut = new p_183Circle(); //circle 객체 도넛 생성 
		donut.radius =2; //도넛 반지름 2 로 설정
		donut.name = "자바도넛"; //도넛 이름
		area = donut.getArea(); //도넛 면적
		System.out.println(donut.name + "의 면적은 " +area);
		

	}

}
