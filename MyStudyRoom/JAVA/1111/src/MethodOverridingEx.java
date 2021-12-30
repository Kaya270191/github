//p280 5-5

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

public class MethodOverridingEx { //MethodOverridingEx Ŭ���� 
	static void paint(Shape p) { //paint() �Լ� Shape Ŭ���� ���۷��� p�� �Ű������� ������
		p.draw(); //p�� ����Ű�� ��ü ���� �������̵� �� draw() ȣ��. ���� ���ε�  --
	}
	public static void main(String[] args) {
		Line line = new Line(); //LineŬ������ ��ü line����
		
		paint(line); //paint �Լ��� Line Ŭ���� ��ü line�� ������ �������̵� �� LineŬ������ draw �Լ� ȣ��  -Print Line
		paint(new Shape()); // paint �Լ��� Shape Ÿ���� ��ü ����  -Print Shape
		paint(new Line()); //paint �Լ��� Line Ÿ���� ��ü ���� . ȣ��  - Print Line 
		paint(new Rect());
		paint(new Circle());
	}
}
