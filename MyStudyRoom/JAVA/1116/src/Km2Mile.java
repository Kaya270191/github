//p316.4
//Converter Ŭ������ ��ӹ޾� Km�� mile(����)�� ��ȯ�ϴ� Km2Mile Ŭ������ �ۼ��϶�


import java.util.Scanner;

abstract class Converter1{ //�߻� Ŭ���� Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString(); //�߻� �޼���
	abstract protected String getDestString(); //�߻� �޼��� 
	protected double mile;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�."); //km��  mile�� �ٲߴϴ�.
		System.out.println(getSrcString() + "�� �Է��ϼ���>>"); 							//km�� �Է��ϼ��� 
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}


public class Km2Mile {
	double mile;
	
	public Km2Mile(double mile) { //�Ű������� 1���� ������ 
		this.mile = mile;
	}
	
	protected double convert(double src) {
		return src/ mile;
		
	}
	protected String getSrcString() {
		return "Km";
		
	}
	protected String getDestString() {
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);  //1������  1.6Km
		toMile.run();
	}

	
}


