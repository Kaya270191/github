import java.util.Scanner;
public class p111_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a,b,r,d;
		int x1, y1;
		
		System.out.println("���� �߽ɰ� ������ �Է� >>");
		
		a = s.nextDouble(); //���� x ��ǥ
		b = s.nextDouble(); //���� y ��ǥ
		r = s.nextDouble(); //������ 
		
		
		System.out.println("�� �Է�  >>");
		
		x1 = s.nextInt(); //���ο� ���� x��ǥ
		y1 = s.nextInt(); //���ο� ���� y��ǥ
		
		d = Math.sqrt(((x1-a)*(x1-a)) + ((y1-b)*(y1-b))); //���� �߽ɰ� x1,y1 ������ �Ÿ� 
		
		if (d < r) {
			System.out.println("��" + x1 +"," + y1 + "�� �� �ȿ� �ִ� ");
			
		}
		
		s.close();
		

	}

}
