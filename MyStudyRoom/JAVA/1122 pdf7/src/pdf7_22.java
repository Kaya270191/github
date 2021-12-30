//pdf7_22
//Shape 클래스를 조상하는 Circle 클래스와 Rectangle 클래스를 작성하라
//생성자도 적절히 추가해야함. 

//pdf7_23
//7_22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트하기

abstract class Shape{ //Shape 클래스 
	Point p;
	
	Shape(){ //기본 생성자 
		this(new Point(0,0));
	}
	
	Shape(Point p){ //매개변수가 하나인 생성자 
		this.p = p;
	}
	
	abstract double calcArea(); //도형의 면적을 계산해서 반환하는 추상 메서드
	
	Point getPosition() { //getPosition()
		return p;
	}
	
	void setPosition(Point p) { //getPosition(매개변수1) 
		this.p = p;
	}
}

class Circle extends Shape{ //Shape를 상속받은 Circle클래스
	double r; //반지름
	
	Circle(double r){ // 생성자 
		this.r=r;
	}
	
	double calcArea() { //상속받은 매서드 - 원의 넓이 구하기 
		return r*r*(Math.PI);	
	}
}

class Rectangle extends Shape{ //Shape를 상속받은 Rectangle클래스
	double width; //폭
	double height; //높이
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
		
	double calcArea() { //상속받은 매서드 - 사각형의 넓이 구하기 
		return width * height;
	}
	
	boolean isSquare() {
		return (width == height) && width!=0 && height!=0;
	}
}


class Point{ //Point 클래스 
	int x;
	int y;
	
	Point(){ //기본 생성자 
		this(0,0);
	}
	
	Point(int x, int y){ //매개변수가 2개인 생성자 
		this.x = x;
		this.y = y; 
	}
	
	public String toString() { // 점의 위치를 리턴하는 함수 
		return "["+x+", "+y+"]";
	}
}


public class pdf7_22 {
	
	static double sumArea(Shape[]arr){
		double sum =0;
		for(int i =0; i< arr.length; i++) {	
			sum += arr[i].calcArea();
		}
		return sum;		
	}
	
	public static void main(String[] args) {
		Shape [] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:" + sumArea(arr));
	}
}

