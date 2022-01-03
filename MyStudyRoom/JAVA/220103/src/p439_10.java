import java.util.Scanner;
import java.util.Vector;

abstract class Shape{ //추상 클래스
	private Shape next;
	public Shape() {//생성자 
		next =null;
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw(); //추상메서드 
}

class Line extends Shape{ //추상 클래스 상속받은 Line 클래스
	public void draw() {
		System.out.println("Line");
	}
}

class Rect  extends Shape{ //추상 클래스 상속받은 Rect 클래스
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{ //추상클래스 상속받은 Circle 클래스 
	public void draw() {
		System.out.println("Circle");
	}
}

public class p439_10 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>(); //벡터생성
		Shape shape= null; //Shape 레퍼런스 초기화
		
		System.out.println("그래픽 에디터 beauty 을 실행합니다.");
		while(true) {
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int num = S.nextInt(); //입력받은 숫자 
			
			switch(num){
			case 1 : 
				System.out.println("Line(1), Rect(2), Circle(3)>>");
				int num2 = S.nextInt(); //추가할 도형 번호 입력
				switch(num2) {	
					case 1:
						shape = new Line(); //업캐스팅  Shape shape = new Line();
						break;
					case 2:
						shape = new Rect(); //업캐스팅
						break;
					case 3:
						shape = new Circle(); //업캐스팅 
						break;
				}
				v.add(shape); //벡터에 생성한 Shape클래스의 객체를 추가 
				break;
			case 2 : //삭제 
				System.out.println("삭제할 도형의 위치");
				int position = S.nextInt();//삭제하고자 하는 위치
				if(v.size() == 0 || v.size() <= position) { //벡터의 크기가 0이거나 입력값보다 작으면
					System.out.println("삭제할 수 없습니다."); //삭제 불가 
				}
				else {
					v.remove(position);	//입력받은 위치의 벡터값 삭제 
					break;
				}
			case 3 : //모두 보기
				for(int i=0; i<v.size(); i++) //벡터 사이즈만큼 반복
					v.get(i).draw(); //draw함수 호출
					break;
			case 4 :
				System.out.println("beauty을 종료합니다.");
				S.close();
				return;
			}
		}
	}
}