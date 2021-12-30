//6-4. Rect클래스와 equals() 만들기 연습 
//int 타입의 width 와 height 필드를 가지고 있는 Rect 클래스를 작성하고,
//면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals() 작성하기. 

package EX;

class Rect { //Rect 클래스 
	private int width; //멤버 변수 
	private int height; 
	public Rect(int width, int heigjt) { //생성자 
		this.width=width;
		this.height=height;	
	}
	public boolean equals(Object obj) { //불린 equals1() Object클래스의 객체를 변수로 받음
		Rect p = (Rect)obj; //obj를 Rect로 다운캐스팅
		if(width*height == p.width*p.height)
				return true;
		else
			return false;
	}
}

public class ex_4 {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,12);
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}
