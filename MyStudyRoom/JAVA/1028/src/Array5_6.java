//거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산 

public class Array5_6 {

	public static void main(String[] args) {
		
		int coinUnit []  = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money"+money);
		
	
		for(int i = 0; i < 4; i++) {
			System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]); //돈 /코인 유닛을 각 나눠야함
			money = money % coinUnit[i]; // 나누고 남은 나머지 값을 money값으로 대입 
		}	
	}
}