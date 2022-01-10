//p.243
//5. 

import java.util.Scanner;

class Circle{
	private double x,y; //private��� ���� 
	private int radius; //private��� ����
	public Circle(double x, double y, int radius) { //������ �Լ�- �ʱ�ȭ 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() { //x,y,radius ���� ����Ʈ�ϴ� �Լ� 
		System.out.println("("+x +","+ y +")"+ radius);		
	}
}


public class p243_ch4_5 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Circle c [] = new Circle[3]; // ũ�Ⱑ 3�� Circle Ŭ������ ��ü �迭 ���� 
		for(int i=0; i<c.length; i++) {
			System.out.println("x,y,radius>>"); //�Է��� ������ ��ü ���� 
			double x = S.nextDouble();
			double y = S.nextDouble();
			int radius = S.nextInt();
			
			c[i] = new Circle(x,y,radius); //������ �Լ� ȣ���ؼ� ��ü ���� 
		}
		for(int i=0; i<c.length; i++) { //�迭�� ��ҷ� ���� show()�Լ��� ȣ��
			c[i].show();
		}
	}
}
