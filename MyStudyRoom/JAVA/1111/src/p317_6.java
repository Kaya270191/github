//p.317 6. Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.

class Point1{						//Point Ŭ���� 
	private int x,y;				//��� ���� 
	public Point1(int x, int y) {	//�Ű������� 2���� ������ �Լ� 
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
}

public class p317_6 extends Point1{

private String color; 
	
	public p317_6() { //������  (0,0) ��ġ�� BLACK �� �� 
		super(0,0);  //�θ� Ŭ���� ������ Point1(int x, int y) �Լ��� ȣ��. ����
		this.color = "BLACK";	
	}
	
	public p317_6(int x, int  y) { 			//�Ű����� 2�� ������ 
		super(x,y);
	}
	
	public String toString() { 				//toString �Լ� 	
		return color +"���� (" + getX() +","+ getY() + ")�� ���Դϴ�.";		
	}

	public void setXY(int x, int y) { //setXY �Լ� 
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color; 
	}	

	public static void main(String[] args) {
		p317_6 zeroPoint = new p317_6(); //(0,0) ��ġ�� BLACK �� �� 
		System.out.println(zeroPoint.toString());	
		
		p317_6 cp = new p317_6(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
	}
}