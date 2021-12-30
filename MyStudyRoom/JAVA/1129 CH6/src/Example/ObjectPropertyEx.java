package Example;

class Point{ //Point 클래스 
	private int x, y;
	public Point(int x, int y) { //int x,y 매개변수 2개 받는 생성자 
		this.x= x;
		this.y= y;
	}
	public String toString() { //Object 함수의 toString()를 오버라이딩 
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {  //equals() 오버라이딩
		Point p = (Point)obj; //객체 obj를 Point 타입으로 다운캐스팅 
		if(x == p.x && y == p.y)
			return true;
		else 
			return false;
	}
}

public class ObjectPropertyEx { //ObjectPropertyEx클래스 
	
	public static void print(Object obj) { //print 함수 (Object 타입의 obj객체를 변수로 받음)
		System.out.println(obj.getClass().getName()); //클래스 이름 
		System.out.println(obj.hashCode()); //obj해시코드 값 
		System.out.println(obj.toString()); //obj객체를 문자열로 만들어 출력 
		System.out.println(obj);//obj 객체 출력 
	}

	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p+ "입니다");
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a==b) //false
			System.out.println("a==b"); 
		if(a.equals(b)) //true a와 b의 내용이 동일함 
			System.out.println("a is equal to b");
		if(a.equals(c)) //false
			System.out.println("a is equal to c");
	}
}
