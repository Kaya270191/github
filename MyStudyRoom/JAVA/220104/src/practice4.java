
import java.util.Scanner;
public class practice4 { //Ŭ����
	 
	int radius; //������ ���۷��� radius
	String name;  //���� ���۷��� name
	public double getArea() { //���ϰ� �Ǽ��� ��ȯ�ϴ� �Լ� getArea()
		return 3.14*radius*radius; //���ϰ� 
	}

	public static void main(String[] args) {
		practice4  pizza; //Ŭ������ ���۷��� pizza ����
		pizza = new practice4(); //�ν��Ͻ� ����
		pizza.radius=10;//��ü pizza�� radius ��� ����
		pizza.name="java pizza"; //��ü pizza�� name �� ���� 
		double area = pizza.getArea(); //��ü�� getArea()�Լ� ȣ���ؼ� ���Ϲ��� ���� area�� ����
		System.out.println(pizza.name + "�� ������" + area);//����Ʈ 
		
		practice4 donut = new practice4(); //Ŭ������ ���۷��� ���� �� ��ü ����
		donut.radius = 5;//��ü�� radius ��� ����
		donut.name ="java donut"; //��ü�� name��� ����
		area = donut.getArea();//��ü�� getArea()�Լ� �����ؼ� ���Ϲ��� ���� area�� ���� 
		System.out.println(donut.name + "�� ������" + area);
		
		

	}

}
