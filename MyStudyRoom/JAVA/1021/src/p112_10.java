import java.util.Scanner;
public class p112_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a,b,r,x,y,r1, d;
		
		
		System.out.println("���� �߽ɰ� ������ �Է� >>");
		
		a = s.nextDouble(); //���� x ��ǥ
		b = s.nextDouble(); //���� y ��ǥ
		r = s.nextDouble(); //������ 
		
		x = s.nextDouble(); //��1�� x ��ǥ
		y = s.nextDouble(); //��1�� y ��ǥ
		r1 = s.nextDouble(); //������ 
		
		d = Math.sqrt(((x-a)*(x-a)) + ((y-b)*(y-b))); //���� �߽ɰ� ���ο� ���� �߽� ������ �Ÿ�  
		
		if ((r+r1)>d) {
			System.out.println("�� ���� ���� ��ģ��");
		}
		else 
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�");
		
		s.close();
		
		}
	}


