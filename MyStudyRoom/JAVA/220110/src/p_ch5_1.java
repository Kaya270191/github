//5-1
//Ŭ���� ��Ӹ���� 

class Point{ //Point Ŭ����
	private int x,y; //Point Ŭ�������� ���� ������ �������
	public void set(int x, int y) { //�Լ�
		this.x = x;
		this.y = y;
	}
	public void showPoint() { //x,y ��ǥ�� ����ϴ� �Լ� 
		System.out.println("("+ x + "," +y+")");
	}
}


class ColorPoint extends Point{ //Point Ŭ������ ��ӹ��� ColorPoint Ŭ����
	private String color; //ColorPoint Ŭ�������� ���� ������ String Ÿ���� ��� ����
	public void setColor(String color) { //������ �����ϴ� �Լ� 
		this.color = color;
	}
	
	public void showColorPoint() { //������ ����ϴ� �Լ� 
		System.out.println(color);
		showPoint(); //�θ�Ŭ������ Point�Լ� ȣ�� 
	}

public class p_ch5_1 {
	public void main(String [] args) {
		Point p = new Point(); //PointŬ������ ���۷��� ���� �� ��ü ���� 
		p.set(1, 2);// p��ü�� set()�Լ� ȣ��
		p.showPoint(); //p��ü�� showPoint() �Լ� ȣ�� 
		
		ColorPoint cp = new ColorPoint(); //PointŬ������ ��ӹ��� ColorPointŬ������ ���۷��� ���� �� ��ü ����
		cp.set(3, 4); //�ڽ�Ŭ���� ���۷���cp�� �θ�Ŭ���� set()�Լ� ȣ�� 
		cp.setColor("red"); //���۷��� cp�� ���� Ŭ���� setColor()ȣ�� 
		cp.showColorPoint(); //���۷��� cp�� ���� Ŭ���� setColorPoint()ȣ�� 
		}
	}
}
