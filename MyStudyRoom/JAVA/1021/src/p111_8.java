import java.util.Scanner;
public class p111_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.println("��ǥ �Է� x1, y1, x2, y2 ");
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		if (x1 <= 100 && y1 <= 100 && x2 >= 100 && y2 >= 100 ) {  //x1, y1�� 100���� �۰�  x2, y2 100���� Ŀ���� 
			System.out.println("���簢���� �浹�մϴ�.");
		}
			
		else if (x1 <= 100 && y1 >= 200 && x2 >=100 && y2 >=200) { 	//x1�� 100���� �۰� y1�� 200���� �۴�. x2�� 100���� ũ�� y2�� 200���� �۴�
			System.out.println("���簢���� �浹�մϴ�.");
		}
		
		else if (x1 <= 200 && y1 <= 200 && x2 >= 200 && y2 >= 200) {
			System.out.println("���簢���� �浹�մϴ�.");
		}
		
		else if (x1 >= 200 && y1 <= 100 && x2 >= 200 && y2 >=100) {
			System.out.println("���簢���� �浹�մϴ�.");
		}
		
		else 
			System.out.println("���簢���� �浹���� �ʽ��ϴ�.");
			
			
		s.close();
		
			
		}
		
		
		
		

		
		

		
		

	}


