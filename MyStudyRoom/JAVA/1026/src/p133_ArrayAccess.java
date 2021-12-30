//배열에 입력받은 수 중 제일 큰 수 찾기 

import java.util.Scanner;
public class p133_ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // 배열 생성
		int max = 0;
		System.out.println("양수 5개를 입력하세요");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); //입력받은 정수를 배열에 저장 
			if(intArray[i] > max) //만약 intArray[i]번째 입력한 수가 >0 보다 크면
				max= intArray[i]; //그 수를 max 값에 넣고 반복 
		}
		System.out.print("가장 큰 수는 "+ max +"입니다");
		
		scanner.close();
		

	}

}
