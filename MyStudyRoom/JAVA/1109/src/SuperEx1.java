// ���� 5-3
// super()�� �̿��Ͽ� ColorPoint Ŭ������ �����ڿ��� ���� Ŭ���� Point�� �����ڸ� ȣ���ϴ� ���� ���δ�.

class Point2{ 					// Point2 Ŭ����-�θ�Ŭ���� 
	private int x, y; 			//private ���� ���� 
	public Point2() { 			//�⺻ ������ �Լ� 
		this.x = this.y = 0;
	}
	public Point2(int x, int y) { //�Ű������� �� ���� ������ �Լ� 
		this.x = x; this.y = y;
	}
	public void showPoint2() { 	//showPoint2() �Լ� 
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint2 extends Point2{ 		// Point2 Ŭ������ ��ӹ��� ColorPoint2 Ŭ���� -�ڽ� Ŭ���� 
	private String color; 				//private ���� ���� 
	public ColorPoint2(int x, int y, String color) {	 //�Ű������� �� ���� ������ �Լ� 
		super(x,y); 									//Point2 ������ Point(x,y) ȣ�� 
		this.color = color;
	}
	public void showColorPoint2() {						//showColorPoint2 �Լ�
		System.out.print(color);
		showPoint2(); 									//Point1 Ŭ������ showPoint2 �Լ� ȣ�� 
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5,6, "blue"); //ColorPoint2 �� ��ü cp ���� (�Ű����� 3���� ����) 
		cp.showColorPoint2();
	}
}
