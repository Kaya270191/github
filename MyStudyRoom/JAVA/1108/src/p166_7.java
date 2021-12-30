// p.166
// 정수를 10개 저장하는 배열을 만들고 1~10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장해라
// 그리고 배열에 든 숫자들과 평균을 출력하기

import java.util.Arrays;
import java.util.Scanner;
public class p166_7 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int array [] = new int [10]; // 크기가 10개인 array 배열 생성 
		
		int sum =0;
		
		for (int i = 0; i < array.length; i++) { //랜덤한 숫자를 배열에 추가하기 
			int num = (int)(Math.random()*10 +1);
			array[i] = num ;		
		}
		
		for (int i =0; i < array.length; i++) { //배열 크기만큼 반복 해 배열 array출력 
			System.out.print(array[i] + " ");
		}
		
		System.out.println(Arrays.toString(array)); // array출력 
		
		for(int j =0 ; j< array.length; j++) { //랜덤한 숫자의 평균 구하기 
			sum += array[j]; 
		}
		System.out.println("평균은" + sum/10 );
		}
	}


