//4-6 0~4�� circle ��ü 5���� ������ �迭 ����, �迭�� �ִ� ��� circle ��ü�� ���� ���ϱ� 
class ccircle {
	int radius;
	public ccircle(int radius) {
		this.radius =radius;
	}

	public double getArea() {
		return 3.14*radius;
	}
}
	

public class CircleArray {
	public static void main(String[] args) {
		ccircle [] c ; //circle �迭�� ���� ���۷��� c ����
		c = new ccircle[5]; //5���� ���۷��� �迭 ����
		
		for(int i=0; i<c.length; i++) //�迭�� ���� ��ŭ
			c[i] = new ccircle(i); //i��° ���� ��ü ���� 
		
		for(int i =0; i<c.length; i++) //�迭�� ��� circle��ü�� ���� ��� 
			System.out.println((int)(c[i].getArea()) +" ");
		

	}
}


