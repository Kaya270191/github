//5-5. 1-9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램 

package PracticeArray;

public class pdf5_5 {
	public static void main(String[] args) {
		int [] ballArr = {1,2,3,4,5,6,7,8,9}; //정수형 ballArr배열
		int [] ball3 = new int[3]; //정수형 ball3 의 3칸짜리 배열 생성 
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다 
		for(int i=0; i<ballArr.length; i++) { //ballArr의 길이만큼 for문 반복 
			int j = (int)(Math.random()*ballArr.length);
			int tmp=0;
			//치환
			tmp = ballArr[i]; //처음 배열 ballArr[i]를 빈 변수 tmp 에 저장
			ballArr[i] = ballArr[j]; //랜덤한 숫자j를 i 배열에 저장 
			ballArr[j] = tmp; //tmp 값을 ballArr[j]에 저장-> 기존의 배열을 비우기 위함 
		}

		for (int i =0;  i<ballArr.length; i++) //뒤섞은 배열ballArr 프린트 
			System.out.print(ballArr[i]);
			System.out.println(" ");
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.	
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i]; 	//ballArr[0][1][2]번째 수를 ball3[0][1][2]에 차례로 복사 
			System.out.print(ball3[i]);			
		}			
	}
}

