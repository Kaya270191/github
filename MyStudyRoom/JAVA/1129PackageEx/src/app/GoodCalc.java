package app;
import lib.Calculator; //다른 패키지에서 가져오기 때문에 import!! 해야함 

public class GoodCalc extends Calculator{ //@overriding 
	public int add(int a, int b) {
		return a+b;		
	}
	public int subtract(int a, int b) {
		return a-b;		
	}
	public double average(int[] a) {
		double sum =0;
		for(int i =0; i<a.length; i++)
			sum +=a[i];
		return sum/a.length;
	}
	public static void main(String []args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}
