//두 점 (x,y) (x1,y1) 사이의 거리 계산 

public class pdf6_6 {
	
	
	static double getDistance(int x, int y, int x1, int y1) {
				
		double dX = x -x1;
		double dY = y -y1;
		return Math.sqrt((dX*dX)+(dY*dY));		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
