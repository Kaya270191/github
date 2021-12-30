//6-4. RectŬ������ equals() ����� ���� 
//int Ÿ���� width �� height �ʵ带 ������ �ִ� Rect Ŭ������ �ۼ��ϰ�,
//������ ������ �� Rect ��ü�� ���� ������ �Ǻ��ϴ� equals() �ۼ��ϱ�. 

package EX;

class Rect { //Rect Ŭ���� 
	private int width; //��� ���� 
	private int height; 
	public Rect(int width, int heigjt) { //������ 
		this.width=width;
		this.height=height;	
	}
	public boolean equals(Object obj) { //�Ҹ� equals1() ObjectŬ������ ��ü�� ������ ����
		Rect p = (Rect)obj; //obj�� Rect�� �ٿ�ĳ����
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
