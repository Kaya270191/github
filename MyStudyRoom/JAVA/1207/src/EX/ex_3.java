//6-3. Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals() 작성하기 

package EX;

class Point{ 
	private int x, y;
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else 
			return false; 
	}
}

public class ex_3 {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a == b) //레퍼런스 a,b가 같은 것을 가리키는지? 
			System.out.println(" a==b");
		if(a.equals(b)) //레퍼런스 a,b의 내용이 같은지?
			System.out.println(" a is equal to b");
		if(a.equals(c)) //레퍼런스 a,c의 내용이 같은지? 
			System.out.println(" a is equal to c");
	}
}
