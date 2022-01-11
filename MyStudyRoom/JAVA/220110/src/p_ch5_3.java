//5-3
//super()를 활용한 ColorPoint 작성

class Point1{ //Point 클래스
	private int x,y; //Point 클래스에서만 접근 가능한 정수형 멤버 변수
	public Point1(int x, int y) {//변수 2개를 받는 생성자 함수
		this.x= x;
		this.y =y; 
	}
	public void showPoint() { //리턴값이 없는 showPoint()함수 - x,y값을 출력함 
		System.out.println("("+ x + "," + y + ")");
	}
}

class ColorPoint1 extends Point1{//Point클래스를 상속받은 ColorPoint 클래스
	private String color; //스트링 타입의 멤버변수
	public ColorPoint1(int x, int y, String color) { //변수 3개를 받는 생성자 함수 
		super(x,y);// 부모클래스의 매개변수를 두개받는 생성자 호출 public Point1(int x, int y) 
		this.color = color; //색상값 초기화
	}
	public void showColorPoint() { //색상을 프린트
		System.out.print(color);
		showPoint();// 부모클래스의 showPoint()함수 호출해서 좌표 출력 
	}
}


public class p_ch5_3 {
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5,6,"blue"); //자식클래스의 레퍼런스 선언과 객체 생성 - 생성자 호출
		cp.showColorPoint(); //자식 객체 cp로 showColorPoint() 호출 
	}
}
