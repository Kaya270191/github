//5���� ������ �Է¹ް� �� �� ����鸸 ���Ͽ� ����ϴ� ���α׷� 
import java.util.Scanner;

public class p125_ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //��ĳ�� �żҵ� 
		
		System.out.println("������ 5�� �Է��ϼ���."); //���� 5�� �Է¹ޱ� 
		int sum=0; //���� ����
		for(int i=0; i<5; i++) { //i�� �ʱⰪ�� 0, i�� 5���� ���� ������ �ݺ�, i�� 1�� ����
			int n= scanner.nextInt(); //n=��ĳ���� �Է¹��� ����
			if(n<=0) //���� n�� 0���� �۰ų� ������ 
				continue; //���� �ݺ����� ���� i�� 1�� ������Ŵ (�ݺ� �� �۾����� )
			else //n�� 0���� ũ��  
				sum+=n; //����
			
		}
		System.out.println("����� ����"+sum);
		
		scanner.close();

	}

}
