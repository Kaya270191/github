//5-22
class Shape{ //슈퍼클래스  Shape
	public Shape next; //Shape 타입의 레퍼런스 next
	public Shape() {next = null;} //Shape 클래스의 기본생성자 . Shape의 객체를 생성하면 next는 아무것도 가리키지 않는다.
	
	public void draw() { //Shape 클래스의 draw 함수 
		System.out.println("Shape");
	}
}

class Line extends Shape{ // Line 클래스 
	public void draw() { //Line 클래스의 draw 함수 - 오버라이딩 
		System.out.println("Line");
	}
}

class Rect extends Shape{ //Rect 클래스 
	public void draw() { //Rect 클래스의 draw 함수 - 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape{ //Circle 클래스 
	public void draw() { //Circle 클래스의 draw 함수 -오버라이딩 
		System.out.println("Circle");
	}
}


public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj; //Shape 클래스의 레퍼런스 start, last, obj 선언 
		
		start = new Line(); //Shape start = new Line();  업캐스팅  . 
		last = start; // 레퍼런스 last 는 start 가리키는 것을 똑같이 가리킴 -> Line 
		obj = new Rect(); // Shape obj = new Rect();  업캐스팅.  
		last.next = obj; 
		last = obj;
		obj = new Line(); // Shape obj = new Line(); 
		last.next = obj;
		obj = new Circle(); //Shape obj = new Circle(); 
		last.next = obj;
		
		Shape p = start;
		while(p != null ) {
			p.draw();
			p = p.next;
		}
	}
}
