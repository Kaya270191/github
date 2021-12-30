import java.util.Random;
import java.util.Scanner;


public class p159_OP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //스캐너 실행 
		Random r = new Random(); //랜덤 객체 생성
		
		
		while(true) {
			int k = r.nextInt(100); //랜덤 숫자 생성 
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int number = s.nextInt(); //사용자 입력 숫자 
			System.out.print("수를 입력하세요 0~99:"); //사용자가 수를 입력 
			
			
			while (k != number) {  //k가 사용자 수와 일치하지 않을 떄 
				if ( number > k) {
					System.out.println("더 낮게");
					int number2 = s.nextInt(); // 새로운 수 입력 
					System.out.println("다시입력>>>");
					
				}
				else if (number < k) {
					System.out.println("더 높게");
					int number2 = s.nextInt(); // 새로운 수 입력 
					System.out.println("다시입력>>>");
						
				}
				
			}
			if (number == k) 
				System.out.println("맞았습니다");
				
					
			System.out.println("다시하시겠습니까(y/n)");
			String answer = s.next();
	
			
		}
		
		

		
	}
}