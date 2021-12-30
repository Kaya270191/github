//2중 중첩 for문 사용해 구구단 출력 프로그램 만들기 
public class p123_NestedLoop {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) { //단: i는 1단부터 시작해서 10보다 작을 때까지 반복하며 반복할 때마다 i는 1씩 증가 
			for(int j=1; j<10; j++) { //i가 1일때, j는 10보다 작을 때까지 반복하며 반복할 때마다 j는 1씩 증가 
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print('\t');
				
			}
			System.out.println();
		}

	}

}
