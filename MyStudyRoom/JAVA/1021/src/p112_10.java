import java.util.Scanner;
public class p112_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a,b,r,x,y,r1, d;
		
		
		System.out.println("원의 중심과 반지름 입력 >>");
		
		a = s.nextDouble(); //원의 x 좌표
		b = s.nextDouble(); //원의 y 좌표
		r = s.nextDouble(); //반지름 
		
		x = s.nextDouble(); //원1의 x 좌표
		y = s.nextDouble(); //원1의 y 좌표
		r1 = s.nextDouble(); //반지름 
		
		d = Math.sqrt(((x-a)*(x-a)) + ((y-b)*(y-b))); //원의 중심과 새로운 원의 중심 사이의 거리  
		
		if ((r+r1)>d) {
			System.out.println("두 원은 서로 겹친다");
		}
		else 
			System.out.println("두 원은 서로 겹치지 않는다");
		
		s.close();
		
		}
	}


