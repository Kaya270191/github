//p.243 Circle Ŭ������ CircleManager Ŭ���� �ϼ��ϱ� 
//3���� Circle ��ü �迭�� ����� x,y, radius ���� �о� 3���� Circle ��ü�� ����� show()�� �̿��Ͽ� ��� ���

import java.util.Scanner;

class Circle2{ //Ŭ����
	private double x, y;
	private int radius;
	
	public Circle2(double x, double y, int radius) {//������ 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() { //show �Լ� 
		System.out.println("("+ x +" "+ y +")"+ " "+ radius);		
	}
	
	public int getRadius() { 
		return radius; //int�� ������ �� ����-> �������� ���� ū ���� ū ����  		 
	}
}

public class CircleManager1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle2 C [] = new Circle2[3]; //3���� Circle1 �迭 ���� 
		for(int i=0; i< C.length ;i++) {
			System.out.println("x,y,radius>>");
			double x = scanner.nextDouble(); //x �� �б�
			double y = scanner.nextDouble(); //y �� �б�
			int radius = scanner.nextInt(); //r �� �б�
			C[i] = new Circle2(x,y,radius); //Circle ��ü ����
	}
		int max =0; //�ִ밪 ���ϱ� 
		for(int i=0; i<C.length; i++) 
			if (max < C[i].getRadius()) {
				max = C[i].getRadius();
			}
		for(int i=0; i<C.length; i++) 
			if(max==C[i].getRadius()) {
				System.out.println("���� ū ������ ����");
				C[i].show();
			}
		}	
	}
