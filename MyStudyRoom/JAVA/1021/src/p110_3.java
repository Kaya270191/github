import java.util.Scanner;

public class p110_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		
		int a = s.nextInt();
		
		int a5= a / 50000 ; //5�������� ���� �� 
		int b= a % 50000 / 10000 ; //����
		int c= a % 10000 / 1000 ; //õ��
		int d= a % 1000 / 100 ; //���
		int dd= a % 100 / 50 ;
		
		int e= a % 50 / 10 ; //�ʿ�
		int f= a % 10 / 1; //�Ͽ�
		
		System.out.println("��������: " + a5 + "��");
		System.out.println("������: " + b + "��" );
		System.out.println("õ����: " + c + "��" );
		System.out.println("���: " + d + "��" );
		System.out.println("���ʿ�: " + dd + "��" );
		System.out.println("�ʿ�: " + e + "��" );
		System.out.println("�Ͽ�: " + f + "��" );
		
	}

}
