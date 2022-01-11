//5-5
//메소드 오버라이딩으로 다형성 실현

class Shape{ //Shape 클래스 - 수퍼클래스
	public Shape next; //Shape타입의 next 변수 
	public Shape() { //기본 생성자 함수 
		next= null; //next값 초기화
	}
	public void draw() { //draw() 
		System.out.println("Shape");
	}
}

class Line extends Shape{ //Shpae클래스를 상속받은 Line클래스
	public void draw() { //메소드 오버라이딩 
		System.out.println("Line");
	}
}

class Rect extends Shape{//Shape 함수를 상속받은 Rect클래스
	public void draw() { //메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle2 extends Shape{//Shape 함수를 상속받은 Circle 클래스
	public void draw() {//메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class p_ch5_5 {
	static void paint(Shape p) { //static 메소드(Shape 타입의 매개변수를 받음)
		p.draw();//p가 가리키는 객체 내에 오버라이딩된 draw()호출. 동적바인딩
	}
	
	public static void main(String[] args) {
		Line line = new Line(); //Line클래스의 레퍼런스 선언 및 객체 생성
		
		paint(line); //Line에 오버라이딩한 draw() 실행
		paint(new Shape());//Shape p = new Shape() -Shape클래스의 draw()호출 : 오버라이딩
		paint(new Line());//Shape p = new Line()- Line클래스의 draw()호출 : 오버라이딩
		paint(new Rect());//Shape p = new Rect() - Rect클래스의 draw()호출: 오버라이딩
		paint(new Circle2());//Shape p = new Circle() -Circle클래스의 draw()호출 : 오버라이딩
		
		//Linked list
		Shape start, last, obj; //Shape 타입의 변수 start, last, obj 변수 
		start = new Line(); //Shape start = new Line(); 업캐스팅 
		last = start; //시작과 끝이 같은 지점을 가리킴
		obj = new Rect();//  Shape obj = new Rect();  업캐스팅
		last.next = obj;// line.next 가 rec를 가리킴
		last = obj; // last는  rect를 가리킴
		obj = new Line(); //Shape obj = new Line() 업캐스팅 
		last.next = obj;//rect를 가리키던 건 Line을 가리킴
		last = obj; //last는 Line을 가리킴
		obj = new Circle2(); //Shape obj = new Circle  업캐스팅
		last.next = obj; //last 는 Circle를 가리킴
		
		Shape p = start; //p는 start는 가리킴
		while(p!=null) { //null값이 아닐 때 까지 반복
			p.draw();//
			p=p.next;
		}
	}
}
