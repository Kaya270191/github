
public class practice5 { //Ŭ���� 
	int radius; //���� �ʵ��� radius
	String name; //���� �ʵ��� name
	
	public practice5() { //������ - �ʱ�ȭ
		radius = 1; 
		name = "";	
	}
	public practice5(int r, String n) { //�Ű������� ������ ���ڸ� �޴� ������ - �ʱ�ȭ
		radius =r ; 
		name = n;
	}
	public double getArea() { //�Ǽ����� �����ϴ� getArea()�Լ� 
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		practice5 pizza = new practice5(10,"java pizza"); //���۷��� ���� �� ��ü ����
		double area = pizza.getArea(); //��ü�� getArea()�Լ� �����ؼ� ���Ϲ��� ���� area�� ����
		
		practice5 donut =  new practice5(); //���۷���  ���� ��  ��ü  ����
		donut.name="donut pizza"; //�������� ���� �ʵ忡 ����
		area = donut.getArea();//��ü��getArea()�Լ� �����ؼ� ���Ϲ��� ���� area������ 
		System.out.println(donut.name + "�� ������" + area);

	}

}
