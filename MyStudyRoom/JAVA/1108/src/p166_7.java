// p.166
// ������ 10�� �����ϴ� �迭�� ����� 1~10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����ض�
// �׸��� �迭�� �� ���ڵ�� ����� ����ϱ�

import java.util.Arrays;
import java.util.Scanner;
public class p166_7 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int array [] = new int [10]; // ũ�Ⱑ 10���� array �迭 ���� 
		
		int sum =0;
		
		for (int i = 0; i < array.length; i++) { //������ ���ڸ� �迭�� �߰��ϱ� 
			int num = (int)(Math.random()*10 +1);
			array[i] = num ;		
		}
		
		for (int i =0; i < array.length; i++) { //�迭 ũ�⸸ŭ �ݺ� �� �迭 array��� 
			System.out.print(array[i] + " ");
		}
		
		System.out.println(Arrays.toString(array)); // array��� 
		
		for(int j =0 ; j< array.length; j++) { //������ ������ ��� ���ϱ� 
			sum += array[j]; 
		}
		System.out.println("�����" + sum/10 );
		}
	}


