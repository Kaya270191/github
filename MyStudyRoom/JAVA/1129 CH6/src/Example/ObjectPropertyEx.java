package Example;

class Point{ //Point Ŭ���� 
	private int x, y;
	public Point(int x, int y) { //int x,y �Ű����� 2�� �޴� ������ 
		this.x= x;
		this.y= y;
	}
	public String toString() { //Object �Լ��� toString()�� �������̵� 
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {  //equals() �������̵�
		Point p = (Point)obj; //��ü obj�� Point Ÿ������ �ٿ�ĳ���� 
		if(x == p.x && y == p.y)
			return true;
		else 
			return false;
	}
}

public class ObjectPropertyEx { //ObjectPropertyExŬ���� 
	
	public static void print(Object obj) { //print �Լ� (Object Ÿ���� obj��ü�� ������ ����)
		System.out.println(obj.getClass().getName()); //Ŭ���� �̸� 
		System.out.println(obj.hashCode()); //obj�ؽ��ڵ� �� 
		System.out.println(obj.toString()); //obj��ü�� ���ڿ��� ����� ��� 
		System.out.println(obj);//obj ��ü ��� 
	}

	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p+ "�Դϴ�");
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a==b) //false
			System.out.println("a==b"); 
		if(a.equals(b)) //true a�� b�� ������ ������ 
			System.out.println("a is equal to b");
		if(a.equals(c)) //false
			System.out.println("a is equal to c");
	}
}
