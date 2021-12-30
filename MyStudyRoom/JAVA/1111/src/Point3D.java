//7. 
class Point2{						//Point Ŭ���� 
	private int x,y;				//��� ���� 
	public Point2(int x, int y) {	//�Ű������� 2���� ������ �Լ� 
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


public class Point3D extends Point2{
	private int z; 
	public Point3D(int x, int y, int z) { //�Ű������� 3���� ������ 
		super(x,y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public String toString1() {
		return "(" + getX() + "," + getY() + "," + getZ() +")�� ��";	
	}
	
	public int moveUp() {
		return z = z+1;
	}
	
	public int moveDown() {
		return z = z-1;
	}
	
	void move (int x, int y , int z){
		super.move(x, y);
		this.z = z ;
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D (1,2,3);
		System.out.println(p.toString1() + "�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString1() + "�Դϴ�.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString1()+ "�Դϴ�.");
		
		p.move(100,200,300);
		System.out.println(p.toString1()+"�Դϴ�.");
	}
}
