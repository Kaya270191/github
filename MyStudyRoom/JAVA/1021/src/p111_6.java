import java.util.Scanner;
public class p111_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~99������ ������ �Է��Ͻÿ�>>");
		
		int a = s.nextInt();
		int b = a / 10; 
		int c = a % 10; 
	
		if ( b % 3 == 0 ){
			if (c % 3 == 0)
				System.out.println("�ڼ�¦¦");
		}
		
		
		if (b % 3 == 0 | c % 3 ==0) 
			System.out.println("�ڼ�¦");
		
		else
			System.out.println("�ڼ�����");


	}

}
