import java.util.Random;
import java.util.Scanner;



public class p159_OpenChallenge {

	public static void main(String[] args) {
		
		Random r = new Random(); //���� ��ü ����
		int k = r.nextInt(100); //���� ���� ���� 
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
		
		Scanner s = new Scanner(System.in); //��ĳ�� ���� 
	
		
		System.out.print("���� �Է��ϼ��� 0~99:"); //����ڰ� ���� �Է� 
		int number = s.nextInt();
		
		
		
		while (k != number) {  //k�� ����� ���� ��ġ���� ���� �� 
			if ( number > k) {
				System.out.println("�� ����");
				number = s.nextInt(); // ���ο� �� �Է� 
				continue;
			}
			else if (number < k) {
				System.out.println("�� ����");
				number = s.nextInt(); // ���ο� �� �Է� 
				continue;
				
			}
		}
		
		if (number == k) 
			System.out.println("�¾ҽ��ϴ�");
			
				
		System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
		String answer = s.next();
		
			

		
		s.close();
		
		


	}

}
