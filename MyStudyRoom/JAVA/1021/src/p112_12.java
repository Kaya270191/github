import java.util.Scanner;
public class p112_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("연산>>");
		
	
		int a = s.nextInt();
		String op = s.next();
		int b = s.nextInt();
	
		if (op.equals ("+")) 
			System.out.println(a + "+" + b + "계산 결과는 " + (a+b) );
		
		if (op.equals ("-")) 
			System.out.println(a + "-" + b + "계산 결과는 " + (a-b) );
		
		if (op.equals ("*")) 
			System.out.println(a + "*" + b + "계산 결과는 " + (a*b) );
		
		if (op.equals ("/")) 
			System.out.println(a + "/" + b + "계산 결과는 " + (a/b) );
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			
			s.close();


	}

}
