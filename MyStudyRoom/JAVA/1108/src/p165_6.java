//p. 165
// 배열과 반복문 이용해 프로그램 만들기
// 정수로 된 돈의 액수 입력받아 오만원, 만원, 천원, 오백원, 백원, 오십원, 십원, 일원짜리 동전이 각 몇 개로 변환되는지 출력하기

import java.util.Scanner;
public class p165_6 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int unit [] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류 
		System.out.println("금액을 입력하시오>>");
		int money = S.nextInt();
		
		for(int i =0 ; i < unit.length; i++) {
			int a = money / unit[i]; //돈을 배열 unit[i]번째로 나눈 몫 -> 환산할 돈 개수 
			int b = money % unit[i]; //돈을 배열 unit[i]번째로 나눈 나머지 -> 다음 돈
			money = b; 
			if(a ==0) { //만약 몫이 0 이되면 위로 올라가서 for 문 돌리기 
				continue;
			}
			System.out.println(unit[i]+ "원 짜리 : " + a +"개");		
		}
		S.close();
	}
}