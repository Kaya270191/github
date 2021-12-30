//p.420 7-8. Collections 클래스의 활용
//Collections 클래스를 활용하여 문자열 정렬, 반대로 정렬, 이진 검색을 실행하는 사례를 살펴보자

import java.util.*;

public class CollectionsEx {

	static void printList(LinkedList<String> l) { //리스트의 요소를 모두 출력하는 메소드
		Iterator<String> iterator = l.iterator(); //Iterator형태의String타입의 레퍼런스iterator 객체 리턴
		while(iterator.hasNext()) {//Iterator 객체에 요소가 있을 때까지 반복 
			String e = iterator.next(); //다음 요소 리턴
			String seperator; 
			if(iterator.hasNext())
				seperator = "->"; //마지막 요소가 아니면 -> 출력 
			else
				seperator = "\n"; //마지막 요소이면 줄바꿈
			System.out.println(e+seperator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>(); //빈 리스트 생성
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("해리포터");
		myList.add(0,"터미네이터"); //0번째에 터미네이터 넣기
		myList.add(2, "아바타"); //2번째에 아바타 넣기
		
		System.out.println(myList);
		Collections.sort(myList); //요소 정렬
		System.out.println(myList); 
		
//		Collections.reverse(myList); //요소 순서를 반대로
//		System.out.println(myList);
		
		int index = Collections.binarySearch(myList, "해리포터")+1;
		System.out.println("아바타는" + index + "번째 요소입니다");
	}
}
