//p.242 4. 직사각형을 표현하는 Rectangle 클래스 작성 
public class Rectangle { //클래스
	int x; //필드
	int y;
	int width;
	int height;
	
	public Rectangle (int x, int y, int width, int height) { //매개변수 4개를 받는 생성자 
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height= height;		
	}
	
	public int squre() { //사각형 넓이 함수 
		return this.width*this.height;
	}
	
	public void show() { //사각형의 좌표와 넓이를 화면에 출력하는 함수 
		System.out.println("(" + x +"," + y +")"+ "에서 크기가" + width+"x"+height +"인 사각형");
	}
	
	boolean contains (Rectangle r) { //매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
		if (this.x < r.x && this.y < r.y) //r을 포함하려면 r의 x,y값 보다 커야 함 
			if ( (this.x+this.width) > (r.x+r.width) && (this.y+this.height) > (r.y+r.height)) //r의 가로, 세로 길이보다 길어야함 
				return true;
		return false;		
	}
		
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은" + s.squre());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다");
	}
}
