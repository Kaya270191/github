
import java.util.Scanner;
public class p126_BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�");
		
		while(true) { //exit �� �ܾ ���� �� ���� �ݺ��� 
			System.out.print(">>"); //����� �Է�
			String text = scanner.nextLine();
			if(text.equals("exit")) //���� exit �� �ԷµǸ� 
				break;// while �� �� 
		}
		System.out.println("�����մϴ�");
			
			
		scanner.close();
					
		}

	}


