//1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램

public class Array5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i =0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			System.out.print(j); //랜덤 숫자 10개 뽑음 
			
			
			
			
			
		}
		
		for(int i =0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
	}

}
