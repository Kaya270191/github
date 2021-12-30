import java.util.Random;
import java.util.Scanner;



public class p159_OpenChallenge {

	public static void main(String[] args) {
		
		Random r = new Random(); //랜덤 객체 생성
		int k = r.nextInt(100); //랜덤 숫자 생성 
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		
		Scanner s = new Scanner(System.in); //스캐너 실행 
	
		
		System.out.print("수를 입력하세요 0~99:"); //사용자가 수를 입력 
		int number = s.nextInt();
		
		
		
		while (k != number) {  //k가 사용자 수와 일치하지 않을 떄 
			if ( number > k) {
				System.out.println("더 낮게");
				number = s.nextInt(); // 새로운 수 입력 
				continue;
			}
			else if (number < k) {
				System.out.println("더 높게");
				number = s.nextInt(); // 새로운 수 입력 
				continue;
				
			}
		}
		
		if (number == k) 
			System.out.println("맞았습니다");
			
				
		System.out.println("다시하시겠습니까(y/n)");
		String answer = s.next();
		
			

		
		s.close();
		
		


	}

}
