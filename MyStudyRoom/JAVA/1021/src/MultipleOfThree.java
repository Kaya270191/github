import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수 입력");
		int number = scanner.nextInt(); //정수 입력 
		
		if(number % 3 ==0) //3으로 나눈 나머지가 0이면
			System.out.println("3의 배수입니다.");
		
		else // 3으로 나눈 나머지가 0이 아니면 
			System.out.println("3의 배수가 아닙니다");
		
		scanner.close();

	}

}
