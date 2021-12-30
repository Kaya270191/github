//p.166
//정수를 몇 개 저장할지 키보드로부터 개수를 입력받아 (100보다작은 개수) 정수 배열을 생성하고
//이곳에 1~100까지 범위의 정수를 랜덤하게 삽입하라
//배열에는 같은 수가 없도록 하고 배열을 출력하기

import java.util. Arrays;
import java.util.Scanner;
public class p166_8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("정수 몇 개?>>");
		int num = S.nextInt();
		
		int array [] = new int[num]; //입력받은 정수 크기 만큼의 배열 array 생성
		int chk=0;
		
		for (int i =0; i < num; i++) { //입력한 숫자만큼 배열 안의 정수를 랜덤으로 만들기 
			int tmp = (int)(Math.random()*100+1); //랜덤한 숫자를 tmp 에 저장 
			for(int j =0; j < num; j++) {
				if(tmp == array[i]) { //랜덤한 숫자 tmp 가 array[i] 와 같다면 
					chk=1; //chk =1로 바꾸고 아래 if 절로 넘어가기 
					break;
				}
			}
			if(chk ==1) { // chk 가 1이면
				i--; //i-1을 하고 진행 
				continue;
			}
			array[i]=tmp;
		}
		System.out.println(Arrays.toString(array)); //랜덤한 배열의 수 출력 
		}

}
