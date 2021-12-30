//p.402 예제7-1
//정수만 다루는 Vector<Integer> 컬렉션 활용

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //정수값만 다루는 벡터 생성
		v.add(5); //5 삽입
		v.add(4); //4 삽입
		v.add(-1); //-1 삽입
		
		v.add(2,100); //2번 자리에 100 삽입
		
		System.out.println("벡터 내의 요소 개수 :" + v.size()); //벡터 안 요소 개수 
		System.out.println("벡터의 현재 용량:" + v.capacity()); //벡터 용량 10
		
		//모든 요소 정수 출력하기
		for(int i =0; i<v.size(); i++) {
			int n = v.get(i); //벡터의 i번째 정수
			System.out.println(n);			
		}
		
		//벡터 속의 모든 정수 더하기
		int sum =0;
		for(int i =0; i<v.size(); i++) {
			int n = v.elementAt(i); //벡터의 i번째 정수 
			sum +=n;			
		}System.out.println("벡터에 있는 정수 합:" + sum);
	}
}
