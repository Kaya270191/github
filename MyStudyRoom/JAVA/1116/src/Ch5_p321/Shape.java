package Ch5_p321;

public abstract class Shape { //�߻� Ŭ����shape 
	private Shape next; //Ŭ���� ��� 
	
	public Shape() { //������ �Լ� -�ʱⰪ ���� 
		next=null;
	}
	public void setNext(Shape obj) { //setNext�Լ�(������ Shape�� ��ü) 
		next =obj;
	}
	public Shape getNext() { //getNext�Լ�() 
		return next;
	}
	public abstract void draw(); // draw�Լ�
}
