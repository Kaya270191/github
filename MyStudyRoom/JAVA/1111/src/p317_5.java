//5. point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라
//결과 : RED색의(10,20)의 점 입니다.

class Point{						//Point 클래스 
	private int x,y;				//멤버 변수 
	public Point(int x, int y) {	//매개변수가 2개인 생성자 함수 
		this.x = x; 
		this.y = y;
	}
	public int getX() { 			//getX함수
		return x;
	}
	public int getY() {				//getY함수
		return y; 
	}
	protected void move(int x, int y) {		//move 함수 
		this.x = x; 
		this.y =y;
	}
}


class ColorPoint extends Point{			//Point 클래스를 상속받은 ColorPoint 클래스 
	private String color;				//멤버 변수 
	public ColorPoint(int x, int y, String color) {		//매개변수가 3개인 생성자 함수 
		super(x,y);						//x.y 값은 super()함수로 생성자가 2개인 부모 함수 호출
		this.color = color;				
	}
	
	public void setXY(int x , int y) {	//setXY함수 
		move(x,y); 						//move 함수 호출 
	}
	
	public void setColor(String color) {	//setColor 함수 
		this.color = color; 
	}	
	
	public String toString() {			//toString 함수 
		String tmp = color + "색의" + "(" + getX() + "," + getY() + ")의 점 ";
		return tmp;
	}		
}

public class p317_5 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
