//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램 


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
		float dd =0; // 나누는 수 dd 초기값 

		
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 5 ; j++) {
				total += arr[i][j];
				dd++; //내부 for 문을 수행한 수만큼 나눠야하니 나누는 숫자를 증가한다
			
			}
		
		}
		
		average = total / dd ;
		
		
		System.out.println("total="+total);
		System.out.println("average=" + average);
		
		

	}

}
