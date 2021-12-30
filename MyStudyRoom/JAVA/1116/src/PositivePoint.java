//p.318
//Point�� ��ӹ޾� ����� ���������� ���� ��Ÿ���� PositivePoint Ŭ�������ۼ��϶�

class Point3{						//Point Ŭ���� 
	private int x,y;				//��� ���� 
	public Point3(int x, int y) {	//�Ű������� 2���� ������ �Լ� 
		this.x = x; 
		this.y = y;
	}
	public int getX() { 				//getX�Լ�
		return x;
	}
	public int getY() {					//getY�Լ�
		return y; 
	}
	protected void move(int x, int y) {		//move �Լ� 
		this.x = x; 
		this.y = y;
	}
	
	public String toString(){				//getX �� getY�� ���� �����ϴ� toString �Լ� 
		return ("(" + getX() + "," + getY() + ") �� ��"  );		
	}
}


public class PositivePoint extends Point3 { //Point3 Ŭ������ ��ӹ��� PositivePoint  �Լ� 
	
	public PositivePoint() { 			// PositivePoint ������ 
		super(0,0);						////super �� ���� Ŭ���� ������ ���� 
	}
	
	public PositivePoint(int x, int y) {	//�ʱ� ������ 0���� ���� ��� ���� �������� �ʴ´�.
		super(x,y);
		if (x<0 || y<0) {
			super.move(0,0);				//super �� ���� Ŭ���� �޼ҵ� move() ���� 
		}
	}
	
	protected void move(int x, int y) {		//move �Լ� - �������̵�. ���� x.y ��ǥ���� 0���� Ŭ ��� �����δ�.  
		if (x>0 && y>0) {
			super.move(x, y);			//super �� ���� Ŭ���� �޼ҵ� move() ���� 
		}		
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}
