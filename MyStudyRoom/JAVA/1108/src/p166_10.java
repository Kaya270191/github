import java.util.Arrays;

//p.166
//4x4�� �迭�� ����� 1~10���� ������ ������ 10���� �����ϰ� �����Ͽ� ������ ��ġ�� �����϶�.
//������ 6���� ������ ��� 0�̴�.


public class p166_10 {

	public static void main(String[] args) {
		int array [][] = new int[4][4]; // ũ�Ⱑ 4x4 �� �迭 array ����
		
		for(int i = 0; i < array.length; i++) {
			for(int j =0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10+1); //������ ���ڸ� �迭�� ����
			}
		}
		System.out.println(Arrays.deepToString(array));

	}

}
