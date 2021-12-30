//예제5-1
// (x,y) 의 한 점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는 ColorPoint 클래스를 만들고 활용해보자.

class Point { //부모 클래스 
	private int x,y; 			//private 속성이기 때문에 다른 클래스에서 접근 불가 
	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	public void showPoint() { //showPoint함수
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{ //자식 클래스  . 상속 선언 
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //showColorPoint 함수 
		System.out.println(color);
		showPoint(); // 부모클래스 showPoint함수 호출
	}
}

public class ColorPointEx{
	public static void main(String [] args) {
		Point p = new Point(); 	//Point 객체  p 생성
		p.set(1,2); 			//Point 클래스의 set함수 호출 
		p.showPoint(); 			//Point 클래스의 showPoint함수 호출 
		
		ColorPoint cp = new ColorPoint(); 	//ColorPoint 객체 cp 생성 ->  부모클래스 Point와 자식클래스 ColorPoint 의 멤버를 모두 갖고 탄생!
		cp.set(3,4); 						//Point 클래스의 set함수 호출 
		cp.setColor("red"); 				//Point 클래스의 setColor 함수 호출 
		cp.showColorPoint(); 				//ColorPoint 클래스의 showColorPoint 함수 
	}
}
