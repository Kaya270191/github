//5-3
//super()�� Ȱ���� ColorPoint �ۼ�

class Point1{ //Point Ŭ����
	private int x,y; //Point Ŭ���������� ���� ������ ������ ��� ����
	public Point1(int x, int y) {//���� 2���� �޴� ������ �Լ�
		this.x= x;
		this.y =y; 
	}
	public void showPoint() { //���ϰ��� ���� showPoint()�Լ� - x,y���� ����� 
		System.out.println("("+ x + "," + y + ")");
	}
}

class ColorPoint1 extends Point1{//PointŬ������ ��ӹ��� ColorPoint Ŭ����
	private String color; //��Ʈ�� Ÿ���� �������
	public ColorPoint1(int x, int y, String color) { //���� 3���� �޴� ������ �Լ� 
		super(x,y);// �θ�Ŭ������ �Ű������� �ΰ��޴� ������ ȣ�� public Point1(int x, int y) 
		this.color = color; //���� �ʱ�ȭ
	}
	public void showColorPoint() { //������ ����Ʈ
		System.out.print(color);
		showPoint();// �θ�Ŭ������ showPoint()�Լ� ȣ���ؼ� ��ǥ ��� 
	}
}


public class p_ch5_3 {
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5,6,"blue"); //�ڽ�Ŭ������ ���۷��� ����� ��ü ���� - ������ ȣ��
		cp.showColorPoint(); //�ڽ� ��ü cp�� showColorPoint() ȣ�� 
	}
}
