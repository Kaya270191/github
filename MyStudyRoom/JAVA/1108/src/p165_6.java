//p. 165
// �迭�� �ݺ��� �̿��� ���α׷� �����
// ������ �� ���� �׼� �Է¹޾� ������, ����, õ��, �����, ���, ���ʿ�, �ʿ�, �Ͽ�¥�� ������ �� �� ���� ��ȯ�Ǵ��� ����ϱ�

import java.util.Scanner;
public class p165_6 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int unit [] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ���� 
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int money = S.nextInt();
		
		for(int i =0 ; i < unit.length; i++) {
			int a = money / unit[i]; //���� �迭 unit[i]��°�� ���� �� -> ȯ���� �� ���� 
			int b = money % unit[i]; //���� �迭 unit[i]��°�� ���� ������ -> ���� ��
			money = b; 
			if(a ==0) { //���� ���� 0 �̵Ǹ� ���� �ö󰡼� for �� ������ 
				continue;
			}
			System.out.println(unit[i]+ "�� ¥�� : " + a +"��");		
		}
		S.close();
	}
}