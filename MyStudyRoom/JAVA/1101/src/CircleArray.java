//4-6 0~4인 circle 객체 5개를 가지는 배열 생성, 배열에 있는 모든 circle 객체의 면적 구하기 
class ccircle {
	int radius;
	public ccircle(int radius) {
		this.radius =radius;
	}

	public double getArea() {
		return 3.14*radius;
	}
}
	

public class CircleArray {
	public static void main(String[] args) {
		ccircle [] c ; //circle 배열에 대한 레퍼런스 c 선언
		c = new ccircle[5]; //5개의 레퍼런스 배열 생성
		
		for(int i=0; i<c.length; i++) //배열의 개수 만큼
			c[i] = new ccircle(i); //i번째 원소 객체 생성 
		
		for(int i =0; i<c.length; i++) //배열의 모든 circle객체의 면적 출력 
			System.out.println((int)(c[i].getArea()) +" ");
		

	}
}


