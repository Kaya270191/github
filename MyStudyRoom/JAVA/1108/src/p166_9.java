//p.166 9번
//4x4 의 2차원 배열을 만들고 이곳에 1에서 10까지의 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고
//2차원 배열을 화면에 출력하라 

import java.util.Arrays;
import java.util.Scanner;
public class p166_9 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int array [][]= new int [4][4]; //배열크기가 4x4 인 array 배열 생성 
		
		for (int i = 0; i < array.length; i++) {		
			for(int j =0; j < array[i].length; j++) {
				array [i][j] = (int)(Math.random()*10+1); //랜덤하게 생성된 정수를 array[i][j]에 저장 
			}
		}
		System.out.println(Arrays.deepToString(array));
			}
		}
	


