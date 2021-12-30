import java.util.Scanner;
public class p164_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("정수를 입력하시오"); //정수 입력 
		
		int number = s.nextInt(); //사용자 입력 숫자 
		int a = number; //두번째 for 문
		
		for(int i=0; i<number; i++) { //초기값 i=0, 입력한 숫자 만큼 반복, 반복이 끝나면 i는 1씩 증가 
			for(int j=0; j<a; j++) { //초기값 j=0, j가 사용자 입력 숫자보다 작을 때까지 반복,  
				System.out.print('*'); //한번 반복할 때마다 * 프린트 
			}
			System.out.println();	
			a--; //두번째 for문을 벗어나온 후 a-1 를 하고 다시 첫번째 for 문으로 돌아감 
		}
		
		s.close();		
		}					
		}
		

	


