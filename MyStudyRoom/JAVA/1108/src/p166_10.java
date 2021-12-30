import java.util.Arrays;

//p.166
//4x4의 배열을 만들고 1~10까지 범위의 정수를 10개만 랜덤하게 생성하여 임으의 위치에 삽입하라.
//나머지 6개의 정수는 모두 0이다.


public class p166_10 {

	public static void main(String[] args) {
		int array [][] = new int[4][4]; // 크기가 4x4 인 배열 array 생성
		
		for(int i = 0; i < array.length; i++) {
			for(int j =0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10+1); //랜덤한 숫자를 배열에 저장
			}
		}
		System.out.println(Arrays.deepToString(array));

	}

}
