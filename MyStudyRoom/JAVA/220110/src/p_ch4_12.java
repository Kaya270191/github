//4-12 
//static�� �̿��� ȯ�� ���� 
//static �޼ҵ�� static ����� ��밡�� , this ��� �Ұ� 

import java.util.Scanner;

class CurrencyConverter{
	private static double rate; //static ��� 
	public static double toDollar(double won) { //static �Լ� - static ����� rate ��� 
		return won/rate;
	}
	public static double toKWR(double dollar) { //static �Լ� - static ����� rate ��� 
		return dollar * rate;
	}
	public static void setRate(double r) { //static �Լ� - static ����� rate ���
		rate = r;
	}
}


public class p_ch4_12 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("ȯ�� 1�޷�>>>");
		double rate = S.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸����" + CurrencyConverter.toDollar(1000000)+"�Դϴ�"); //Ŭ������.�޼ҵ��()
		System.out.println("$100��" + CurrencyConverter.toKWR(100) +"�Դϴ�");//Ŭ������.�޼ҵ��()

	}

}
