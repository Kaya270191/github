	

class SutdaCard{ //Ŭ���� ���� 
	int num;
	boolean isKwang;
	
	
	public SutdaCard() { //�Ű����� 1�� ������ ������ 
		num =1;
		isKwang = true; //this(1,true);		
	}
	
	
	public SutdaCard(int num, boolean isKwang) { //�Ű����� 2�� ������ ������ 
		this.num = num;
		this.isKwang = isKwang;
		
	}
	
	String info() { //String Ÿ���� info �Լ� 
		if (isKwang == true) {
			return num + "K";
		}
		return num+"";
		
		
		//return num + (isKwang ? "K" : "");   isKwang  �� ���̸� num �� K�� ���̰� �ƴϸ� ""���̱�		
	}
	
public static void main(String[] args) { //���� �Լ� 
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); //3
		System.out.println(card2.info()); //1K

	}
}