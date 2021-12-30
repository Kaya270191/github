//pdf7-19
class Buyer{
	int money = 1000;
	Product [] cart = new Product [3]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; //product�迭  cart�� ���� index
	
	void buy(Product p) { //��ǰ �����ϴ� ���
		if(money < p.price) {//���� ���ݺ��� ������  
			System.out.println("�ܾ��� �����Ͽ�" + p.toString()+ "�� �� �� �����ϴ�." );
		}
		else {
			money = money - p.price; 
			add(p); //add �Լ� ȣ�� 
		}
	}
	
	void add(Product p) { //��ٱ��Ͽ� ������ ������ �߰�
		
		Product [] newcart = null;
		
		if (i >= cart.length) { //i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
		newcart = new Product[cart.length*2]; //���� ��ٱ��Ϻ��� 2�� ū ���ο� �迭 ����
		
			for ( int i =0; i < cart.length; i++) {
				newcart[i] = cart[i]; //cart �� product ���� newcart�� ����
			}
		cart = newcart; //newcart�� cart��  �ٲ۴�.	
		}
		cart[i]=p;
		i++;		
	}
	
	void summary() { //������ ������ ���, ���ݾ�, �����ݾ� ���
		int sum = 0; 
		for(int i =0; i < cart.length; i++) {
			System.out.print( cart[i].toString() + ","); //����� ����� ���
			sum += cart[i].price ; //���ǵ��� ������ ��� ���ؼ� ���
		}
		System.out.println("");
		System.out.println("����� �ݾ�:" + sum); //����� �ݾ� 
		System.out.println("���� �ݾ� : " + money );//��� ���� �ݾ� ��� 		
	}
}
		
class Product{
	int price; //��ǰ�� ����
	
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
		Buyer b = new Buyer(); //Buyer��ü ����
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

