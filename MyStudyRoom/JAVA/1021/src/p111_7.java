import java.util.Scanner;
public class p111_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		System.out.println("점 (x,y)좌표를 입력하시오>>>");
		int a = s.nextInt();
		int b = s.nextInt();
		
				
		if(a >= 100 & a <= 200 && b >= 100 & b <= 200) {		
		System.out.println("("+ a + "," + b + ")" + "는 사각형 안에 있습니다.");
			
	
		}
	

	}

}
