//거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산. 나눗셈 연산자와 나머지 연산자 사용 

package PracticeArray;

public class pdf5_6 {

	public static void main(String[] args) {
		int [] coinUnit = {500,100,50,10};
		
		int money = 2680;
		int coin; //동전을 표시할 매개변수를 정함 
	
		for(int i=0; i<coinUnit.length; i++) {
			coin=money/coinUnit[i];	//몫은 동전의 수
			money= money - (coinUnit[i]*coin); //기존의 돈에서 coinUnit[i]번째 x 동전의 수를 빼서 다시 돈에 넣기
			System.out.println(coinUnit[i]+"원:" + coin); 
		}		
	}
}
