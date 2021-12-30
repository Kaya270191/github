//pdf7_22
//Shape Ŭ������ �����ϴ� Circle Ŭ������ Rectangle Ŭ������ �ۼ��϶�
//�����ڵ� ������ �߰��ؾ���. 

//pdf7_23
//7_22���� ������ Ŭ�������� ������ ���ϴ� �޼��带 �ۼ��ϰ� �׽�Ʈ�ϱ�

abstract class Shape{ //Shape Ŭ���� 
	Point p;
	
	Shape(){ //�⺻ ������ 
		this(new Point(0,0));
	}
	
	Shape(Point p){ //�Ű������� �ϳ��� ������ 
		this.p = p;
	}
	
	abstract double calcArea(); //������ ������ ����ؼ� ��ȯ�ϴ� �߻� �޼���
	
	Point getPosition() { //getPosition()
		return p;
	}
	
	void setPosition(Point p) { //getPosition(�Ű�����1) 
		this.p = p;
	}
}

class Circle extends Shape{ //Shape�� ��ӹ��� CircleŬ����
	double r; //������
	
	Circle(double r){ // ������ 
		this.r=r;
	}
	
	double calcArea() { //��ӹ��� �ż��� - ���� ���� ���ϱ� 
		return r*r*(Math.PI);	
	}
}

class Rectangle extends Shape{ //Shape�� ��ӹ��� RectangleŬ����
	double width; //��
	double height; //����
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
		
	double calcArea() { //��ӹ��� �ż��� - �簢���� ���� ���ϱ� 
		return width * height;
	}
	
	boolean isSquare() {
		return (width == height) && width!=0 && height!=0;
	}
}


class Point{ //Point Ŭ���� 
	int x;
	int y;
	
	Point(){ //�⺻ ������ 
		this(0,0);
	}
	
	Point(int x, int y){ //�Ű������� 2���� ������ 
		this.x = x;
		this.y = y; 
	}
	
	public String toString() { // ���� ��ġ�� �����ϴ� �Լ� 
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
		System.out.println("������ ��:" + sumArea(arr));
	}
}

