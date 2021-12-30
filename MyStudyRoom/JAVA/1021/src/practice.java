import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int a = scanner.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int b = scanner.nextInt();
		
		System.out.print("세 번째 숫자: ");
		int c = scanner.nextInt();
		
		
		if (a > b ) {	//a가 b보다 크다면
			if (a > c ) 	//a와 c를 비교해서 a가 더 크면 
				System.out.println("최대값은 ..a"); 	//a는 b,c보다 크다 최대값은  a
			else { 	//a가 b보다 크고 a가 c보다 작음 c>a>b 
				System.out.println("중간값은 ..a"); 	//중간값은 a
			}
		}
		else {	 // a가 b보다 작다 
			if (a < c ) 	//a 가  c 보다 작다   => a는 b,c보다 작다 
				System.out.println("최초값은 ..a"); 			
		}
		

		
		if (b > a ) { 	//b가 a보다 크고
			if (b > c ) 	//b가 c보다 크다면 b>a,b
				System.out.println("최대값은 ..b");
			else { 	//b가a보다 크고 c보다 작다c>b>a
				System.out.println("중간값은 ..b");
			}
		}
		else { 	//b가 a보다 작다 
			if (b < c ) 	//b가 c보다 작다 
				System.out.println("최초값은 ..b");			
		}
		

		
		if (c > b ) { 	//c가 b보다 크고
			if (c > a ) 	//c가 a보다 크다 c > b, a
				System.out.println("최대값은 ..c");
			else { 	//c가 b보다 크고 a보다 작다  a>c>b 
				System.out.println("중간값은 ..c");
			}
		}
		else { 	//c가 b보다 작다 
			if (c < a ) 	//c가 a보다 작다  c<a,b
				System.out.println("최초값은 ..c");			
		}		
				
			
			scanner.close();
			
				                  
		}
		

	}


