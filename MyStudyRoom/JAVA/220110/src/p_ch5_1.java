//5-1
//클래스 상속만들기 

class Point{ //Point 클래스
	private int x,y; //Point 클래스에만 접근 가능한 멤버변수
	public void set(int x, int y) { //함수
		this.x = x;
		this.y = y;
	}
	public void showPoint() { //x,y 좌표를 출력하는 함수 
		System.out.println("("+ x + "," +y+")");
	}
}


class ColorPoint extends Point{ //Point 클래스를 상속받은 ColorPoint 클래스
	private String color; //ColorPoint 클래스에만 접근 가능한 String 타입의 멤버 변수
	public void setColor(String color) { //색상을 저장하는 함수 
		this.color = color;
	}
	
	public void showColorPoint() { //색상을 출력하는 함수 
		System.out.println(color);
		showPoint(); //부모클래스인 Point함수 호출 
	}

public class p_ch5_1 {
	public void main(String [] args) {
		Point p = new Point(); //Point클래스의 레퍼런스 선언 및 객체 생성 
		p.set(1, 2);// p객체로 set()함수 호출
		p.showPoint(); //p객체로 showPoint() 함수 호출 
		
		ColorPoint cp = new ColorPoint(); //Point클래스를 상속받은 ColorPoint클래스의 레퍼런스 선언 및 객체 생성
		cp.set(3, 4); //자식클래스 레퍼런스cp가 부모클래스 set()함수 호출 
		cp.setColor("red"); //레퍼런스 cp가 본인 클래스 setColor()호출 
		cp.showColorPoint(); //레퍼런스 cp가 본인 클래스 setColorPoint()호출 
		}
	}
}
