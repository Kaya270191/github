//p.164
//3. Scanner�� �̿��� ���� �Է¹ް� *�� ����ϴ� ���α׷� �ۼ��ϱ�(2�� ��ø��)

import java.util.Scanner;
public class p164_3 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�>>");
		int num = S.nextInt();
		
		for(int i = 0 ; i < num ; i++ ) { //�Է��� ���� num ��ŭ for�� �ݺ��ϱ�
			for( int j =0 ; j < num - i ; j++) { //ù�� ° �ݺ��ϸ� �ݺ��ؾ� �ϴ� ���ڿ��� i�� ����
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
