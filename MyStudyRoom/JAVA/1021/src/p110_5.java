import java.util.Scanner;
public class p110_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��Ͻÿ�");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a + b > c ) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
			
		else if (b + c > a ) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
			
		else if (a + c > b ) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		
		else {
			System.out.println("�ﰢ���� �� �˴ϴ�.");
		}
			
			
	s.close();
		
		
		

	}

}
