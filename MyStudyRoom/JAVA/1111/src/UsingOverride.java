//5-22
class Shape{ //����Ŭ����  Shape
	public Shape next; //Shape Ÿ���� ���۷��� next
	public Shape() {next = null;} //Shape Ŭ������ �⺻������ . Shape�� ��ü�� �����ϸ� next�� �ƹ��͵� ����Ű�� �ʴ´�.
	
	public void draw() { //Shape Ŭ������ draw �Լ� 
		System.out.println("Shape");
	}
}

class Line extends Shape{ // Line Ŭ���� 
	public void draw() { //Line Ŭ������ draw �Լ� - �������̵� 
		System.out.println("Line");
	}
}

class Rect extends Shape{ //Rect Ŭ���� 
	public void draw() { //Rect Ŭ������ draw �Լ� - �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape{ //Circle Ŭ���� 
	public void draw() { //Circle Ŭ������ draw �Լ� -�������̵� 
		System.out.println("Circle");
	}
}


public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj; //Shape Ŭ������ ���۷��� start, last, obj ���� 
		
		start = new Line(); //Shape start = new Line();  ��ĳ����  . 
		last = start; // ���۷��� last �� start ����Ű�� ���� �Ȱ��� ����Ŵ -> Line 
		obj = new Rect(); // Shape obj = new Rect();  ��ĳ����.  
		last.next = obj; 
		last = obj;
		obj = new Line(); // Shape obj = new Line(); 
		last.next = obj;
		obj = new Circle(); //Shape obj = new Circle(); 
		last.next = obj;
		
		Shape p = start;
		while(p != null ) {
			p.draw();
			p = p.next;
		}
	}
}
