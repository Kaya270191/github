	

class SutdaCard{ //클래스 정의 
	int num;
	boolean isKwang;
	
	
	public SutdaCard() { //매개변수 1개 가지는 생성자 
		num =1;
		isKwang = true; //this(1,true);		
	}
	
	
	public SutdaCard(int num, boolean isKwang) { //매개변수 2개 가지는 생성자 
		this.num = num;
		this.isKwang = isKwang;
		
	}
	
	String info() { //String 타입의 info 함수 
		if (isKwang == true) {
			return num + "K";
		}
		return num+"";
		
		
		//return num + (isKwang ? "K" : "");   isKwang  이 참이면 num 에 K를 붙이고 아니면 ""붙이기		
	}
	
public static void main(String[] args) { //메인 함수 
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); //3
		System.out.println(card2.info()); //1K

	}
}