//p.166
//������ �� �� �������� Ű����κ��� ������ �Է¹޾� (100�������� ����) ���� �迭�� �����ϰ�
//�̰��� 1~100���� ������ ������ �����ϰ� �����϶�
//�迭���� ���� ���� ������ �ϰ� �迭�� ����ϱ�

import java.util. Arrays;
import java.util.Scanner;
public class p166_8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("���� �� ��?>>");
		int num = S.nextInt();
		
		int array [] = new int[num]; //�Է¹��� ���� ũ�� ��ŭ�� �迭 array ����
		int chk=0;
		
		for (int i =0; i < num; i++) { //�Է��� ���ڸ�ŭ �迭 ���� ������ �������� ����� 
			int tmp = (int)(Math.random()*100+1); //������ ���ڸ� tmp �� ���� 
			for(int j =0; j < num; j++) {
				if(tmp == array[i]) { //������ ���� tmp �� array[i] �� ���ٸ� 
					chk=1; //chk =1�� �ٲٰ� �Ʒ� if ���� �Ѿ�� 
					break;
				}
			}
			if(chk ==1) { // chk �� 1�̸�
				i--; //i-1�� �ϰ� ���� 
				continue;
			}
			array[i]=tmp;
		}
		System.out.println(Arrays.toString(array)); //������ �迭�� �� ��� 
		}

}
