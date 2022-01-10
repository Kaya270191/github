//4-10
//멤버의 접근 지정자

class Sample{ //같은 패키지 내에 있기 떄문에 default 
	public int a; // 어디서나 접근 가능
	private int b; // 같은 클래스만 접근 가능
	int c; // 같은 패키지 내 접근 가능 
}


public class p_ch4_10 {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
//		sample.b = 10; //private int b는 다른 클래스에 있기 때문에 접근 불가능 
		sample.c = 10; 
	}

}
