//p.165
//양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램 작성

import java.util.Scanner;
public class p165_5 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int array [] = new int[10]; // 크기가 10인 배열 array 생성 
		
		System.out.println("양의 정수 10개를 입력하세요>>");
		for (int i = 0 ; i < array.length; i++) {
			array [i] = S.nextInt(); //입력받은 수를 array배열 [] 에 하나씩 저장 
		}
		
		System.out.println("3의 배수는?");
		for (int i = 0 ; i < array.length; i++) {
			if (array[i]%3==0) { //array[]에 들어간 정수를 나눈 나머지가 0이 되면 3의 배수다.
				System.out.println(array[i]);
			}
		}
	} 
}
