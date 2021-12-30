//pdf7-19
class Buyer{
	int money = 1000;
	Product [] cart = new Product [3]; //구입한 제품을 저장하기 위한 배열
	int i = 0; //product배열  cart에 사용될 index
	
	void buy(Product p) { //제품 구입하는 기능
		if(money < p.price) {//돈이 가격보다 작으면  
			System.out.println("잔액이 부족하여" + p.toString()+ "을 살 수 없습니다." );
		}
		else {
			money = money - p.price; 
			add(p); //add 함수 호출 
		}
	}
	
	void add(Product p) { //장바구니에 구입한 물건을 추가
		
		Product [] newcart = null;
		
		if (i >= cart.length) { //i의 값이 장바구니의 크기보다 같거나 크면
		newcart = new Product[cart.length*2]; //기존 장바구니보다 2배 큰 새로운 배열 생성
		
			for ( int i =0; i < cart.length; i++) {
				newcart[i] = cart[i]; //cart 안 product 들을 newcart로 복사
			}
		cart = newcart; //newcart를 cart로  바꾼다.	
		}
		cart[i]=p;
		i++;		
	}
	
	void summary() { //구입한 물건의 목록, 사용금액, 남은금액 출력
		int sum = 0; 
		for(int i =0; i < cart.length; i++) {
			System.out.print( cart[i].toString() + ","); //목록을 만들어 출력
			sum += cart[i].price ; //물건들의 가격을 모두 더해서 출력
		}
		System.out.println("");
		System.out.println("사용한 금액:" + sum); //사용한 금액 
		System.out.println("남은 금액 : " + money );//사고 남은 금액 출력 		
	}
}
		
class Product{
	int price; //제품의 가격
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
		}
}

public class pdf7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer(); //Buyer객체 생성
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

