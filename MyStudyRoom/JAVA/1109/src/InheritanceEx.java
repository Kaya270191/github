//p.260 ���� 5-2

class Person{  // Person :�θ� Ŭ����  
	private int weight; 		//private  ���� ���� - ���� Ŭ���� �� 
	int age; 					//����Ʈ  ��������-���� ��Ű�� �� 
	protected int height; 		// protected ���� ����- ���� ��Ű�� �� or ��ӹ��� ���� Ŭ���� 
	public String name; 		//public ���� ���� - ���� ��Ű��, �ٸ� ��Ű�� ��� ���� 
	
	public void setWeight(int weight) { //private ����� weight �� �����ϱ� ���� get/set �޼ҵ�
		this.weight = weight;
	}
	public int getWeight() { //private ����� weight �� �����ϱ� ���� get/set �޼ҵ�
		return weight; 		//weight ���� ���� 
	}
}

class Student extends Person{ // Person �θ� Ŭ������ ��ӹ���  Student Ŭ���� 
	public void set() {		// set() �Լ� 
		age = 30; 			// Person Ŭ������ ����Ʈ ��� ���� ���� 
		name = "ȫ�浿"; 		// Person Ŭ������ �ۺ� ��� ���� ���� 
		height = 175; 		// Person Ŭ������ ������Ƽ�� ��� ���� ���� 
		setWeight(99); 		//private ���  weight�� setWeight()�� ���� ���� 
	}
}

public class InheritanceEx { //InheritanceEx Ŭ���� 
	public static void main(String[] args) {
		Student s = new Student(); 		//Student Ŭ������ ��ü s ���� 
		s.set(); 						// ��ü s�� �Լ� set ȣ�� 
		s.getWeight(); 					// setWeight()�Լ��� ����� 99�� getWeight �Լ����� ���ϵ� 
		System.out.println(s.getWeight()); 
	}
}
