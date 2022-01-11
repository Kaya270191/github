//5-5
//�޼ҵ� �������̵����� ������ ����

class Shape{ //Shape Ŭ���� - ����Ŭ����
	public Shape next; //ShapeŸ���� next ���� 
	public Shape() { //�⺻ ������ �Լ� 
		next= null; //next�� �ʱ�ȭ
	}
	public void draw() { //draw() 
		System.out.println("Shape");
	}
}

class Line extends Shape{ //ShpaeŬ������ ��ӹ��� LineŬ����
	public void draw() { //�޼ҵ� �������̵� 
		System.out.println("Line");
	}
}

class Rect extends Shape{//Shape �Լ��� ��ӹ��� RectŬ����
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle2 extends Shape{//Shape �Լ��� ��ӹ��� Circle Ŭ����
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class p_ch5_5 {
	static void paint(Shape p) { //static �޼ҵ�(Shape Ÿ���� �Ű������� ����)
		p.draw();//p�� ����Ű�� ��ü ���� �������̵��� draw()ȣ��. �������ε�
	}
	
	public static void main(String[] args) {
		Line line = new Line(); //LineŬ������ ���۷��� ���� �� ��ü ����
		
		paint(line); //Line�� �������̵��� draw() ����
		paint(new Shape());//Shape p = new Shape() -ShapeŬ������ draw()ȣ�� : �������̵�
		paint(new Line());//Shape p = new Line()- LineŬ������ draw()ȣ�� : �������̵�
		paint(new Rect());//Shape p = new Rect() - RectŬ������ draw()ȣ��: �������̵�
		paint(new Circle2());//Shape p = new Circle() -CircleŬ������ draw()ȣ�� : �������̵�
		
		//Linked list
		Shape start, last, obj; //Shape Ÿ���� ���� start, last, obj ���� 
		start = new Line(); //Shape start = new Line(); ��ĳ���� 
		last = start; //���۰� ���� ���� ������ ����Ŵ
		obj = new Rect();//  Shape obj = new Rect();  ��ĳ����
		last.next = obj;// line.next �� rec�� ����Ŵ
		last = obj; // last��  rect�� ����Ŵ
		obj = new Line(); //Shape obj = new Line() ��ĳ���� 
		last.next = obj;//rect�� ����Ű�� �� Line�� ����Ŵ
		last = obj; //last�� Line�� ����Ŵ
		obj = new Circle2(); //Shape obj = new Circle  ��ĳ����
		last.next = obj; //last �� Circle�� ����Ŵ
		
		Shape p = start; //p�� start�� ����Ŵ
		while(p!=null) { //null���� �ƴ� �� ���� �ݺ�
			p.draw();//
			p=p.next;
		}
	}
}
