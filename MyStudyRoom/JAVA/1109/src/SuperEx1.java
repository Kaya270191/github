// 예제 5-3
// super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하는 예를 보인다.

class Point2{ 					// Point2 클래스-부모클래스 
	private int x, y; 			//private 접근 지정 
	public Point2() { 			//기본 생성자 함수 
		this.x = this.y = 0;
	}
	public Point2(int x, int y) { //매개변수가 두 개인 생성자 함수 
		this.x = x; this.y = y;
	}
	public void showPoint2() { 	//showPoint2() 함수 
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint2 extends Point2{ 		// Point2 클래스를 상속받은 ColorPoint2 클래스 -자식 클래스 
	private String color; 				//private 접근 지정 
	public ColorPoint2(int x, int y, String color) {	 //매개변수가 세 개인 생성자 함수 
		super(x,y); 									//Point2 생성자 Point(x,y) 호출 
		this.color = color;
	}
	public void showColorPoint2() {						//showColorPoint2 함수
		System.out.print(color);
		showPoint2(); 									//Point1 클래스의 showPoint2 함수 호출 
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5,6, "blue"); //ColorPoint2 의 객체 cp 생성 (매개변수 3개를 가짐) 
		cp.showColorPoint2();
	}
}
