//5-4 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램

package PracticeArray;

public class pdf5_4 {

	public static void main(String[] args) {
		int[][] arr= { 	//2차원 배열 arr
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}};
		int total = 0;
		float average = 0; 		
		
		for(int i=0; i< arr.length; i++) { //첫번쨰 for문: 배열의 행의 길이만큼 반복: 4
			for(int k=0; k< arr[i].length; k++) { //두번째 for문: 배열의 열의 길이만큼 반복 5 
				total += arr[i][k]; //모든 원소를 더하기 				
			}
		}
		float n = arr.length; //배열의 행의 길이
		float m = arr[0].length; // 배열의 열의 길이 
		
		System.out.println(n);
		System.out.println(m);
		
		average = total / (n*m); //총합 / 배열의 행과 열을 곱한 20을 나누면 평균이 됨
				
		System.out.println("total = " + total);
		System.out.println("average =" + average);	
	}
}
