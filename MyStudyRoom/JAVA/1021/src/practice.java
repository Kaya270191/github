import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int a = scanner.nextInt();
		
		System.out.print("�� ��° ����: ");
		int b = scanner.nextInt();
		
		System.out.print("�� ��° ����: ");
		int c = scanner.nextInt();
		
		
		if (a > b ) {	//a�� b���� ũ�ٸ�
			if (a > c ) 	//a�� c�� ���ؼ� a�� �� ũ�� 
				System.out.println("�ִ밪�� ..a"); 	//a�� b,c���� ũ�� �ִ밪��  a
			else { 	//a�� b���� ũ�� a�� c���� ���� c>a>b 
				System.out.println("�߰����� ..a"); 	//�߰����� a
			}
		}
		else {	 // a�� b���� �۴� 
			if (a < c ) 	//a ��  c ���� �۴�   => a�� b,c���� �۴� 
				System.out.println("���ʰ��� ..a"); 			
		}
		

		
		if (b > a ) { 	//b�� a���� ũ��
			if (b > c ) 	//b�� c���� ũ�ٸ� b>a,b
				System.out.println("�ִ밪�� ..b");
			else { 	//b��a���� ũ�� c���� �۴�c>b>a
				System.out.println("�߰����� ..b");
			}
		}
		else { 	//b�� a���� �۴� 
			if (b < c ) 	//b�� c���� �۴� 
				System.out.println("���ʰ��� ..b");			
		}
		

		
		if (c > b ) { 	//c�� b���� ũ��
			if (c > a ) 	//c�� a���� ũ�� c > b, a
				System.out.println("�ִ밪�� ..c");
			else { 	//c�� b���� ũ�� a���� �۴�  a>c>b 
				System.out.println("�߰����� ..c");
			}
		}
		else { 	//c�� b���� �۴� 
			if (c < a ) 	//c�� a���� �۴�  c<a,b
				System.out.println("���ʰ��� ..c");			
		}		
				
			
			scanner.close();
			
				                  
		}
		

	}


