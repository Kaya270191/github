//p.166 9��
//4x4 �� 2���� �迭�� ����� �̰��� 1���� 10������ ������ ������ �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ�
//2���� �迭�� ȭ�鿡 ����϶� 

import java.util.Arrays;
import java.util.Scanner;
public class p166_9 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int array [][]= new int [4][4]; //�迭ũ�Ⱑ 4x4 �� array �迭 ���� 
		
		for (int i = 0; i < array.length; i++) {		
			for(int j =0; j < array[i].length; j++) {
				array [i][j] = (int)(Math.random()*10+1); //�����ϰ� ������ ������ array[i][j]�� ���� 
			}
		}
		System.out.println(Arrays.deepToString(array));
			}
		}
	


