//5-7
//�߻�Ŭ������ ���� ����

abstract class Calculator{ //�߻� Ŭ���� Calculator
	public abstract int add(int a, int b); //�߻�޼��� ������ ����
	public abstract int subtract(int a, int b);//�߻�޼��� ������ ����
	public abstract double average(int[] a);//�߻�޼��� �����ǹ迭�� ����
}


public class p_ch5_7 extends Calculator{ //�߻�Ŭ���� Calculator�� ��ӹ��� Ŭ����
	public int add(int a, int b) {//�߻�Ŭ���� ����
		return a+b; //�� �Ű������� ���ؼ� ���������� ����
	}
	public int subtract(int a, int b) { //�߻�Ŭ���� ����
		return a-b;// �� �Ű� ������ ���� ���������� ���� 
	}
	public double average(int[]a) { //�߻�Ŭ���� ���� - ������ �迭�� �Ű������� ����
		double sum = 0;// �ʱⰪ ����
		for(int i =0; i<a.length; i++) //�Ű������� ���� �迭�� �� ��ŭ �ݺ�
			sum+=a[i];//��� �� ���ϱ�
		return sum/a.length;//�迭�� ���̸�ŭ ��� ���Ѱ� ������ ����� ���� 
	}

	public static void main(String[] args) {
		p_ch5_7 c = new p_ch5_7(); //���۷��� ���� �� ��ü ����
		System.out.println(c.add(2, 3));//add()�Լ� ȣ��
		System.out.println(c.subtract(2, 3));//subtract()�Լ� ȣ��
		System.out.println(c.average(new int[]{2,3,4}));//average()�Լ� ȣ�� 
	}
}
