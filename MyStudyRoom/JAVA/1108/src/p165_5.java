//p.165
//���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
public class p165_5 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int array [] = new int[10]; // ũ�Ⱑ 10�� �迭 array ���� 
		
		System.out.println("���� ���� 10���� �Է��ϼ���>>");
		for (int i = 0 ; i < array.length; i++) {
			array [i] = S.nextInt(); //�Է¹��� ���� array�迭 [] �� �ϳ��� ���� 
		}
		
		System.out.println("3�� �����?");
		for (int i = 0 ; i < array.length; i++) {
			if (array[i]%3==0) { //array[]�� �� ������ ���� �������� 0�� �Ǹ� 3�� �����.
				System.out.println(array[i]);
			}
		}
	} 
}
