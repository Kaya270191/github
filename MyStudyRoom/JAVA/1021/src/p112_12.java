import java.util.Scanner;
public class p112_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("����>>");
		
	
		int a = s.nextInt();
		String op = s.next();
		int b = s.nextInt();
	
		if (op.equals ("+")) 
			System.out.println(a + "+" + b + "��� ����� " + (a+b) );
		
		if (op.equals ("-")) 
			System.out.println(a + "-" + b + "��� ����� " + (a-b) );
		
		if (op.equals ("*")) 
			System.out.println(a + "*" + b + "��� ����� " + (a*b) );
		
		if (op.equals ("/")) 
			System.out.println(a + "/" + b + "��� ����� " + (a/b) );
			if (b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			
			s.close();


	}

}
