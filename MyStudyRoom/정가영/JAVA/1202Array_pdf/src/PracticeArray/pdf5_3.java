//5-3 배열arr에 담긴 모든 값을 더하는 프로그램 

package PracticeArray;

public class pdf5_3 {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0; 
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 	//배열의 요소를 for 문이 반복할 때 마다 더해준다.
		}		
		System.out.println("sum =" + sum);
	}
}
