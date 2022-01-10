//4-11
//static 멤버를 가진 Calc 클래스 작성 
class Calc{ //static 은 객체 생성 전에 호출 가능 
	public static int abs(int a) { 
		return a>0? a: -a; // a가 0보다 크니? 참이면 a : 거짓이면 -a 리턴 
	}
	public static int max(int a, int b) {
		return (a>b)? a: b; //a가 b보다 크니? 참이면 a : 거짓이면 b
	}
	public static int min(int a, int b) {
		return (a>b)? b:a; //a가 b보다 크니? 참이면 b : 거짓이면 a 
	}
}

public class p_ch4_11 {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3,  -8));

	}

}
