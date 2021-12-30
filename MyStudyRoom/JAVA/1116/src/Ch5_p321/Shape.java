package Ch5_p321;

public abstract class Shape { //추상 클래스shape 
	private Shape next; //클래스 멤버 
	
	public Shape() { //생성자 함수 -초기값 설정 
		next=null;
	}
	public void setNext(Shape obj) { //setNext함수(변수가 Shape의 객체) 
		next =obj;
	}
	public Shape getNext() { //getNext함수() 
		return next;
	}
	public abstract void draw(); // draw함수
}
