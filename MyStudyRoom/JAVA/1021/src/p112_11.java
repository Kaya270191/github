import java.util.Scanner;
public class p112_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���(1~12)");
		
		int season = s.nextInt();
		switch(season) {
			case 3: 
			case 4:
			case 5:
				System.out.println("��");
				break;
				
				
			case 6:
			case 7:
			case 8:
				System.out.println("����");
				break;
				
				
			case 9:
			case 10:
			case 11:
				System.out.println("����");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println("�ܿ�");
				break;
			
			default:
				System.out.println("�߸� �Է�");
				break;	
					
		}

		s.close();
		
		
	}
	
}