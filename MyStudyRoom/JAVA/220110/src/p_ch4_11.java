//4-11
//static ����� ���� Calc Ŭ���� �ۼ� 
class Calc{ //static �� ��ü ���� ���� ȣ�� ���� 
	public static int abs(int a) { 
		return a>0? a: -a; // a�� 0���� ũ��? ���̸� a : �����̸� -a ���� 
	}
	public static int max(int a, int b) {
		return (a>b)? a: b; //a�� b���� ũ��? ���̸� a : �����̸� b
	}
	public static int min(int a, int b) {
		return (a>b)? b:a; //a�� b���� ũ��? ���̸� b : �����̸� a 
	}
}

public class p_ch4_11 {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3,  -8));

	}

}
