//5-2
//��� ���迡 �ִ� Ŭ���� �� ��� ���� 

class Person{ //Person Ŭ���� 
	private int weight; //Person Ŭ���� �ȿ����� ���ٰ����� ��� ����
	int age; //default ������� - ���� ����Ű�� Ŭ���� �� ���� ��Ű�� ���� Ŭ���� 
	protected int height; //protected ������� - ���� ��Ű���� Ŭ���� �� �ٸ� ��Ű�� ����Ŭ���� 
	public String name;//public �������- ��𼭳� ���� ����
	
	public void setWeight(int weight) { //������ �����ϴ� �Լ� 
		this.weight = weight;
	}
	public int getWeight() { //������ �����ϴ� �Լ� 
		return weight;
	}
}

class Student extends Person{ //Person Ŭ������ ��ӹ��� StudentŬ���� 
	public void set() {
		age = 30; 
		name = "ȫ�浿";
		height = 175;
		setWeight(99); //�θ�Ŭ������ setWeight�Լ� ȣ�� 
	}
}

public class p_ch5_2 {

	public static void main(String[] args) {
		Student s = new Student(); //StudentŬ������ ���۷��� ���� �� ��ü ���� 
		s.set(); //StudentŬ���� ���۷��� s�� set()�Լ� ȣ�� 
	}
}
