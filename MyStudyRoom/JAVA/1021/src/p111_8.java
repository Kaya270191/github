import java.util.Scanner;
public class p111_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.println("좌표 입력 x1, y1, x2, y2 ");
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		if (x1 <= 100 && y1 <= 100 && x2 >= 100 && y2 >= 100 ) {  //x1, y1가 100보다 작고  x2, y2 100보다 커야함 
			System.out.println("직사각형과 충돌합니다.");
		}
			
		else if (x1 <= 100 && y1 >= 200 && x2 >=100 && y2 >=200) { 	//x1이 100보다 작고 y1은 200보다 작다. x2는 100보다 크고 y2는 200보다 작다
			System.out.println("직사각형과 충돌합니다.");
		}
		
		else if (x1 <= 200 && y1 <= 200 && x2 >= 200 && y2 >= 200) {
			System.out.println("직사각형과 충돌합니다.");
		}
		
		else if (x1 >= 200 && y1 <= 100 && x2 >= 200 && y2 >=100) {
			System.out.println("직사각형과 충돌합니다.");
		}
		
		else 
			System.out.println("직사각형과 충돌하지 않습니다.");
			
			
		s.close();
		
			
		}
		
		
		
		

		
		

		
		

	}


