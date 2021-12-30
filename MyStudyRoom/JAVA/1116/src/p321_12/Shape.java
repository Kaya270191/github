package p321_12;

public abstract class Shape { //�߻�Ŭ���� 
	private Shape next;
	public Shape() {
		next=null; //next���� �ʱⰪ ����
	}
	public void setNext(Shape obj) {
		next = obj; //obj�� next���� �ѱ��
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}