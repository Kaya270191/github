//p.316
//3. Converter Ŭ������ ��ӹ޾� ��ȭ�� �޷��� ��ȯ�ϴ� Won2Dollar Ŭ������ �ۼ� 

import java.util.Scanner;

abstract class Converter{ //�߻� Ŭ���� Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString(); //�߻� �޼���
	abstract protected String getDestString(); //�߻� �޼��� 
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}

public class Won2Dollar extends Converter{ //�߻� Ŭ���� Converter�� ��ӹ��� Won2Dollar Ŭ���� 
	private double ratio;
		
	public Won2Dollar(double ratio) { //�Ű������� 1���� ������ 	
		this.ratio = ratio; 
	}
	
	protected double convert (double src) {
		return src / ratio;
	}
	
	protected String getSrcString() {
		return "won";
		
	}
	protected String getDestString() {
		return "dollar";
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}

}
