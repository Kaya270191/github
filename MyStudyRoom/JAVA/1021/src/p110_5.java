import java.util.Scanner;
public class p110_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a + b > c ) {
			System.out.println("삼각형이 됩니다.");
		}
			
		else if (b + c > a ) {
			System.out.println("삼각형이 됩니다.");
		}
			
		else if (a + c > b ) {
			System.out.println("삼각형이 됩니다.");
		}
		
		else {
			System.out.println("삼각형이 안 됩니다.");
		}
			
			
	s.close();
		
		
		

	}

}
