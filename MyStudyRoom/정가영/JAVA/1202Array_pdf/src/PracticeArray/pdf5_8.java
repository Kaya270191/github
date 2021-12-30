//5-8 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 *을 찍어서
// 그래프로 그리는 프로그램 

package PracticeArray;

public class pdf5_8 {

	public static void main(String[] args) {
		int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int [] counter = new int[4];
		
		for(int i =0; i<answer.length; i++) { //answer[]의 길이만큼 반복하면서 1,2,3,4의 갯수를 센다. 
			if(answer[i]==1) {				
				counter[0]+=1; 	//1의 갯수를 counter[0]번째에 넣고 
			}else if(answer[i]==2) {					
				counter[1]+=1; //2의 갯수를 counter[1]번째에 넣고 
			}else if(answer[i]==3) {				
				counter[2]+=1; //3의 갯수를 counter[2]번째에 넣고 
			}else {				
				counter[3]+=1; //4의 갯수를 counter[3]번째에 넣는다! counter[]완성
			}
		}

		for(int i =0; i< counter.length; i++) {
			System.out.print(counter[i]); //counter[]의 숫자 차례대로 출력
			for(int k =0; k<counter[i];k++) {	///counter[i]의 숫자만큼 반복하면서 *출력		
				System.out.print("*");				
			}
			System.out.println("");
		}
	}
}
