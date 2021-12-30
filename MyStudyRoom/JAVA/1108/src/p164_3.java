//p.164
//3. Scanner를 이용해 정수 입력받고 *를 출력하는 프로그램 작성하기(2중 중첩문)

import java.util.Scanner;
public class p164_3 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
		int num = S.nextInt();
		
		for(int i = 0 ; i < num ; i++ ) { //입력한 숫자 num 만큼 for문 반복하기
			for( int j =0 ; j < num - i ; j++) { //첫번 째 반복하면 반복해야 하는 숫자에서 i를 빼기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
