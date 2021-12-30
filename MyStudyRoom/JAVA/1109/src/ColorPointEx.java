//����5-1
// (x,y) �� �� ���� ǥ���ϴ� Point Ŭ������ �̸� ��ӹ޾� ���� ���� ���� ǥ���ϴ� ColorPoint Ŭ������ ����� Ȱ���غ���.

class Point { //�θ� Ŭ���� 
	private int x,y; 			//private �Ӽ��̱� ������ �ٸ� Ŭ�������� ���� �Ұ� 
	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	public void showPoint() { //showPoint�Լ�
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{ //�ڽ� Ŭ����  . ��� ���� 
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //showColorPoint �Լ� 
		System.out.println(color);
		showPoint(); // �θ�Ŭ���� showPoint�Լ� ȣ��
	}
}

public class ColorPointEx{
	public static void main(String [] args) {
		Point p = new Point(); 	//Point ��ü  p ����
		p.set(1,2); 			//Point Ŭ������ set�Լ� ȣ�� 
		p.showPoint(); 			//Point Ŭ������ showPoint�Լ� ȣ�� 
		
		ColorPoint cp = new ColorPoint(); 	//ColorPoint ��ü cp ���� ->  �θ�Ŭ���� Point�� �ڽ�Ŭ���� ColorPoint �� ����� ��� ���� ź��!
		cp.set(3,4); 						//Point Ŭ������ set�Լ� ȣ�� 
		cp.setColor("red"); 				//Point Ŭ������ setColor �Լ� ȣ�� 
		cp.showColorPoint(); 				//ColorPoint Ŭ������ showColorPoint �Լ� 
	}
}
