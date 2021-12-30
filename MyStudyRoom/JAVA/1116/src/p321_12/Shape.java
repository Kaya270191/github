package p321_12;

public abstract class Shape { //추상클래스 
	private Shape next;
	public Shape() {
		next=null; //next에게 초기값 지정
	}
	public void setNext(Shape obj) {
		next = obj; //obj를 next에게 넘기기
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}