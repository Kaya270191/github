//�������� �̸��� ���� Circle Ŭ���� �ۼ� 

public class p_183Circle {
	int radius; //���� ������ �ʵ�
	String name; //���� �̸� �ʵ� 
	
	public p_183Circle() {}  //������ 
	
	public double getArea() { //���� ���� ��� �޼ҵ� 
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		p_183Circle pizza; //���۷��� ���� pizza ����
		pizza = new p_183Circle(); //circle ��ü ����
		pizza.radius = 10; //���� ������
		pizza.name = "�ڹ�����"; //���� �̸�
		double area = pizza.getArea(); //���� ���� 
		System.out.println(pizza.name + "�� ������ " + area);
		
		p_183Circle donut = new p_183Circle(); //circle ��ü ���� ���� 
		donut.radius =2; //���� ������ 2 �� ����
		donut.name = "�ڹٵ���"; //���� �̸�
		area = donut.getArea(); //���� ����
		System.out.println(donut.name + "�� ������ " +area);
		

	}

}
