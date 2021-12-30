//p280 5-5

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

public class MethodOverridingEx { //MethodOverridingEx 클래스 
	static void paint(Shape p) { //paint() 함수 Shape 클래스 레퍼런스 p를 매개변수로 가지는
		p.draw(); //p가 가리키는 객체 내에 오버라이딩 된 draw() 호출. 동적 바인딩  --
	}
	public static void main(String[] args) {
		Line line = new Line(); //Line클래스의 객체 line생성
		
		paint(line); //paint 함수에 Line 클래스 객체 line을 넣으면 오버라이딩 된 Line클래스의 draw 함수 호출  -Print Line
		paint(new Shape()); // paint 함수에 Shape 타입의 객체 생성  -Print Shape
		paint(new Line()); //paint 함수에 Line 타입의 객체 생성 . 호출  - Print Line 
		paint(new Rect());
		paint(new Circle());
	}
}
