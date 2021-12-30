//7. 
class Point2{						//Point 클래스 
	private int x,y;				//멤버 변수 
	public Point2(int x, int y) {	//매개변수가 2개인 생성자 함수 
		this.x = x; 
		this.y = y;
	}
	public int getX() { 				//getX함수
		return x;
	}
	public int getY() {					//getY함수
		return y; 
	}
	protected void move(int x, int y) {		//move 함수 
		this.x = x; 
		this.y = y;
	}
}


public class Point3D extends Point2{
	private int z; 
	public Point3D(int x, int y, int z) { //매개변수가 3개인 생성자 
		super(x,y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public String toString1() {
		return "(" + getX() + "," + getY() + "," + getZ() +")의 점";	
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
		System.out.println(p.toString1() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString1() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString1()+ "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString1()+"입니다.");
	}
}
