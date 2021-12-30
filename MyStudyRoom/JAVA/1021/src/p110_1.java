import java.util.Scanner;

public class p110_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요 (단위:원) ");
		int a = scanner.nextInt();
		
		System.out.println( a + "는" + "$" + a/1100 + "입니다");
		
		
		

	}

}
