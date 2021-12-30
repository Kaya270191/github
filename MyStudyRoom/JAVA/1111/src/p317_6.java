//p.317 6. Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.

class Point1{						//Point 클래스 
	private int x,y;				//멤버 변수 
	public Point1(int x, int y) {	//매개변수가 2개인 생성자 함수 
		this.x = x; 
		this.y = y;
	}
	public int getX() { 				//getX함수
		return x;
	}
	public int getY() {					//getY함수
		return y; 
	}
	protected void move(int x, int y) {		//move 함수 
		this.x = x; 
		this.y = y;
	}
}

public class p317_6 extends Point1{

private String color; 
	
	public p317_6() { //생성자  (0,0) 위치의 BLACK 색 점 
		super(0,0);  //부모 클래스 생성자 Point1(int x, int y) 함수를 호출. 실행
		this.color = "BLACK";	
	}
	
	public p317_6(int x, int  y) { 			//매개변수 2개 생성자 
		super(x,y);
	}
	
	public String toString() { 				//toString 함수 	
		return color +"색의 (" + getX() +","+ getY() + ")의 점입니다.";		
	}

	public void setXY(int x, int y) { //setXY 함수 
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color; 
	}	

	public static void main(String[] args) {
		p317_6 zeroPoint = new p317_6(); //(0,0) 위치의 BLACK 색 점 
		System.out.println(zeroPoint.toString());	
		
		p317_6 cp = new p317_6(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
	}
}