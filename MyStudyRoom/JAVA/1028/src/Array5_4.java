//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷� 


public class Array5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total =0;
		float average =0;
		float dd =0; // ������ �� dd �ʱⰪ 

		
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 5 ; j++) {
				total += arr[i][j];
				dd++; //���� for ���� ������ ����ŭ �������ϴ� ������ ���ڸ� �����Ѵ�
			
			}
		
		}
		
		average = total / dd ;
		
		
		System.out.println("total="+total);
		System.out.println("average=" + average);
		
		

	}

}
