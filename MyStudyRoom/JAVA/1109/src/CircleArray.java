//4-6
//��������  0-4�� Circle ��ü 5���� ������ �迭�� �����ϰ�, �迭�� �ִ� ��� Circle ��ü�� ������ ����϶� 

class Circle{ 						//Circle Ŭ���� 
	int radius;						 //Ŭ������ ��� ���� 
	
	public Circle(int radius) {		//�Ű������� �ϳ��� ������ 
		this.radius = radius; 
	}
	public double getArea() {		//getArea() �Լ� - ������ ���� 
		return 3.14*radius*radius;
	}
}

public class CircleArray {			//CircleArray Ŭ���� 
	public static void main(String[] args) {
		Circle c []; 				//Circle Ŭ������ ���۷��� �Լ� c ����  
		c = new Circle [5];			//���۷��� c �迭�� ũ��� 5 
		
		for(int i =0; i < c.length; i++)	//�迭�� ������ŭ
			c[i] = new Circle(i);			//c[i] �����ϰ� Circle Ŭ���� �����ڿ��� radius�� ���� ����  c[i]�� ���� 
		
		for(int i =0; i<c.length; i++)		//�迭�� ������ŭ 
			System.out.println((int)c[i].getArea()); //getArea()�Լ� ȣ���ؼ� ���� ���ϱ� 
	}
}
