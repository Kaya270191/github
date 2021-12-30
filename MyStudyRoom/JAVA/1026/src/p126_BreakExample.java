
import java.util.Scanner;
public class p126_BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다");
		
		while(true) { //exit 의 단어가 나올 때 까지 반복함 
			System.out.print(">>"); //사용자 입력
			String text = scanner.nextLine();
			if(text.equals("exit")) //만약 exit 이 입력되면 
				break;// while 문 끝 
		}
		System.out.println("종료합니다");
			
			
		scanner.close();
					
		}

	}


