//p.294
//5-7

abstract class Calculator{ 						//Calculator  추상클래스 
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int [] a);	 //추상 클래스에서 선언된 추상 메소드는 자식클래스에서 모두 구현해야 함!
}

public class GoodcCalc extends Calculator{ 		//Calculator  추상클래스를 상속받은  GoodcCalc 
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public double average(int [] a) {
		int sum =0;
		for(int i =0; i< a.length; i++) {
			sum += a[i];  
		}
		return sum/ a.length;	
	}

	public static void main(String[] args) {
		GoodcCalc c = new GoodcCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3,4}));
	}
}
