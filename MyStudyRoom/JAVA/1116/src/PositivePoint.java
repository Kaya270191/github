//p.318
//Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를작성하라

class Point3{						//Point 클래스 
	private int x,y;				//멤버 변수 
	public Point3(int x, int y) {	//매개변수가 2개인 생성자 함수 
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
	
	public String toString(){				//getX 와 getY의 값을 리턴하는 toString 함수 
		return ("(" + getX() + "," + getY() + ") 의 점"  );		
	}
}


public class PositivePoint extends Point3 { //Point3 클래스를 상속받은 PositivePoint  함수 
	
	public PositivePoint() { 			// PositivePoint 생성자 
		super(0,0);						////super 로 슈퍼 클래스 생성자 접근 
	}
	
	public PositivePoint(int x, int y) {	//초기 변수가 0보다 작은 경우 점을 움직이지 않는다.
		super(x,y);
		if (x<0 || y<0) {
			super.move(0,0);				//super 로 슈퍼 클래스 메소드 move() 접근 
		}
	}
	
	protected void move(int x, int y) {		//move 함수 - 오버라이딩. 만약 x.y 좌표값이 0보다 클 경우 움직인다.  
		if (x>0 && y>0) {
			super.move(x, y);			//super 로 슈퍼 클래스 메소드 move() 접근 
		}		
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
