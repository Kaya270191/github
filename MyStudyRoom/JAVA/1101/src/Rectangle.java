//p.242 4. ���簢���� ǥ���ϴ� Rectangle Ŭ���� �ۼ� 
public class Rectangle { //Ŭ����
	int x; //�ʵ�
	int y;
	int width;
	int height;
	
	public Rectangle (int x, int y, int width, int height) { //�Ű����� 4���� �޴� ������ 
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height= height;		
	}
	
	public int squre() { //�簢�� ���� �Լ� 
		return this.width*this.height;
	}
	
	public void show() { //�簢���� ��ǥ�� ���̸� ȭ�鿡 ����ϴ� �Լ� 
		System.out.println("(" + x +"," + y +")"+ "���� ũ�Ⱑ" + width+"x"+height +"�� �簢��");
	}
	
	boolean contains (Rectangle r) { //�Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
		if (this.x < r.x && this.y < r.y) //r�� �����Ϸ��� r�� x,y�� ���� Ŀ�� �� 
			if ( (this.x+this.width) > (r.x+r.width) && (this.y+this.height) > (r.y+r.height)) //r�� ����, ���� ���̺��� ������ 
				return true;
		return false;		
	}
		
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������" + s.squre());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�");
	}
}
