//5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램 
import java.util.Scanner;

public class p125_ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 매소드 
		
		System.out.println("정수를 5개 입력하세요."); //숫자 5개 입력받기 
		int sum=0; //변수 설정
		for(int i=0; i<5; i++) { //i의 초기값은 0, i는 5보다 작을 때까지 반복, i는 1씩 증가
			int n= scanner.nextInt(); //n=스캐너의 입력받은 숫자
			if(n<=0) //만약 n이 0보다 작거나 같으면 
				continue; //다음 반복으로 진행 i를 1씩 증가시킴 (반복 후 작업으로 )
			else //n이 0보다 크면  
				sum+=n; //덧셈
			
		}
		System.out.println("양수의 합은"+sum);
		
		scanner.close();

	}

}
