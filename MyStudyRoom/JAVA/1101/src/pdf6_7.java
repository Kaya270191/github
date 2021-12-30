// 6-6 클래스메서드 getDistance()를 MyPoint 클래스의 인스턴스메서드로 정의 


class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public double getDistance(int x, int y ) {
		
		double dX = x -this.x;
		double dY = y -this.y;
		return Math.sqrt((dX*dX)+(dY*dY));		
	}
	
		
}

public class pdf6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));		
	}

}
