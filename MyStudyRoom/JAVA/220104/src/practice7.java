
public class practice7 { //Ŭ����
	int radius; //������ ����ʵ�
	public practice7(int radius) {//������ �Լ� (�Ű������� ���� 1�� ����)
		this.radius= radius;//��ü �ڽ���  radius�� ����
	}
	public double getArea() { //�Ǽ��� �����ϴ� getArea()�޼ҵ�
		return 3.14*radius*radius;
	}
	

	public static void main(String[] args) {
		practice7 [] c  ; //practice7 �迭�� ���� ���۷��� c ����
		c = new practice7[5]; //5���� ���۷��� �迭 ����
		
		for(int i=0; i<c.length; i++) //�迭�� ���̸�ŭ �ݺ�
			c[i] = new practice7(i);//i ��° ���� ���� 
		
		for(int i=0; i<c.length; i++)// �迭�� ���̸�ŭ �ݺ�
			System.out.println((int)(c[i].getArea())+" ");// �� �迭�� ��ü�� getArea()�޼ҵ� ȣ���ؼ� ���ϰ� �޾ƿͼ� ���� ����Ʈ

	}

}
