//5. point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�
//��� : RED����(10,20)�� �� �Դϴ�.

class Point{						//Point Ŭ���� 
	private int x,y;				//��� ���� 
	public Point(int x, int y) {	//�Ű������� 2���� ������ �Լ� 
		this.x = x; 
		this.y = y;
	}
	public int getX() { 			//getX�Լ�
		return x;
	}
	public int getY() {				//getY�Լ�
		return y; 
	}
	protected void move(int x, int y) {		//move �Լ� 
		this.x = x; 
		this.y =y;
	}
}


class ColorPoint extends Point{			//Point Ŭ������ ��ӹ��� ColorPoint Ŭ���� 
	private String color;				//��� ���� 
	public ColorPoint(int x, int y, String color) {		//�Ű������� 3���� ������ �Լ� 
		super(x,y);						//x.y ���� super()�Լ��� �����ڰ� 2���� �θ� �Լ� ȣ��
		this.color = color;				
	}
	
	public void setXY(int x , int y) {	//setXY�Լ� 
		move(x,y); 						//move �Լ� ȣ�� 
	}
	
	public void setColor(String color) {	//setColor �Լ� 
		this.color = color; 
	}	
	
	public String toString() {			//toString �Լ� 
		String tmp = color + "����" + "(" + getX() + "," + getY() + ")�� �� ";
		return tmp;
	}		
}

public class p317_5 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}
}
