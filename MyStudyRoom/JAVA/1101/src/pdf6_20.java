//메서드 작성하고 테스트 
//배열에 담긴 값의 위치를 바꾸는 작업 반복 


public class pdf6_20 {
	
	public static int [] shuffle (int [] arr) { //int 형 배열 arr 배열에 담긴 값의 위치를 바꾸는 작업 반복.		
		
		for(int i = 0; i < arr.length; i++ ) {
			int ri = (int)(Math.random()*arr.length);
			
			int temp= arr[i]; //배열에 있던 값을 temp에 넣기 
			arr[i]= arr[ri];
			arr[ri]= temp;
			}
		return arr;
		}		
	

public static void main(String[] args) { //메인 메소드
	int[] original = {1,2,3,4,5,6,7,8,9}; // 배열
	System.out.println(java.util.Arrays.toString(original));
		
	int[] result = shuffle (original);
	System.out.println(java.util.Arrays.toString(result));
		}
	}


