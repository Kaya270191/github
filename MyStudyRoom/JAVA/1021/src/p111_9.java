import java.util.Scanner;
public class p111_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a,b,r,d;
		int x1, y1;
		
		System.out.println("원의 중심과 반지름 입력 >>");
		
		a = s.nextDouble(); //원의 x 좌표
		b = s.nextDouble(); //원의 y 좌표
		r = s.nextDouble(); //반지름 
		
		
		System.out.println("점 입력  >>");
		
		x1 = s.nextInt(); //새로운 점의 x좌표
		y1 = s.nextInt(); //새로운 점의 y좌표
		
		d = Math.sqrt(((x1-a)*(x1-a)) + ((y1-b)*(y1-b))); //원의 중심과 x1,y1 사이의 거리 
		
		if (d < r) {
			System.out.println("점" + x1 +"," + y1 + "은 원 안에 있다 ");
			
		}
		
		s.close();
		

	}

}
