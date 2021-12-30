package PracticeArray;

import java.util.Scanner;
public class pdf5_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("돈을 입력하세요");
		int money = s.nextInt();
		
		int[] coinUnit = {500,100,50,10}; //동전의 단위
		int[] coin = {5,5,5,5}; //단위별 동전의 개수 
		
		for(int i =0; i<coinUnit.length; i++) { //coinUnit의 길이만큼 반복 
			int coinNum =0; //필요한 동전의 숫자를 변수 coinNum 으로 설정 
			
			coinNum = money / coinUnit[i]; //필요한 동전의 개수 
			
			if(coin[i]>=coinNum) { //coin[i] 가 필요한 동전 갯수보다 크거나 같으면
				coin[i] = coin[i]-coinNum; //coin[i]에서 필요한 수를 빼고 그 수를 coin[i]에 넣기
			}
			else { //coin[i]가 필요한 동전 수보다 작으면
				coinNum= coin[i]; //coin[i] 5를 coinNum에 넣고
				coin[i]=0; //coin[i]에 0을 대입하기 
			}

			money = money - (coinUnit[i]*coinNum); //
					
			System.out.println(coinUnit[i]+"원:" + coinNum);
			//System.out.println(money);
		}
		if(money>0) {
			System.out.println("거스름돈이 부족합니다");
			System.out.println("프로그램을 종료합니다");
		}
		System.out.println("-남은 동전의 개수-");
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원:" + coin[i]);
		}
		s.close();
	}
}
