import java.util.Random;
import java.util.Scanner;


public class p159_OP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //��ĳ�� ���� 
		Random r = new Random(); //���� ��ü ����
		
		
		while(true) {
			int k = r.nextInt(100); //���� ���� ���� 
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			int number = s.nextInt(); //����� �Է� ���� 
			System.out.print("���� �Է��ϼ��� 0~99:"); //����ڰ� ���� �Է� 
			
			
			while (k != number) {  //k�� ����� ���� ��ġ���� ���� �� 
				if ( number > k) {
					System.out.println("�� ����");
					int number2 = s.nextInt(); // ���ο� �� �Է� 
					System.out.println("�ٽ��Է�>>>");
					
				}
				else if (number < k) {
					System.out.println("�� ����");
					int number2 = s.nextInt(); // ���ο� �� �Է� 
					System.out.println("�ٽ��Է�>>>");
						
				}
				
			}
			if (number == k) 
				System.out.println("�¾ҽ��ϴ�");
				
					
			System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
			String answer = s.next();
	
			
		}
		
		

		
	}
}