//p.409 예제 7-3 문자열 입력받아 ArrayList에 저장
//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름 출력

import java.util.*;


public class ArrayListEx {
	public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>(); //문자열만 삽입가능한 ArrayList 생성

	//키보드로부터 4개의 이름 입력받아 ArrayList에 삽입 
	Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
	for(int i = 0; i<4; i++) {
		System.out.println("이름을 입력하세요");
		String s = scanner.next(); //입력 받은 값을 s에 저장하고
		a.add(s); //ArrayList 컬렉션에 삽입 
	}
	//ArrayList에 있는 모든 이름 출력 
	for(int i =0; i<a.size(); i++) { //ArrayList a의 크기만큼 반복
		String name = a.get(i); //원소를 get()함수로 얻어서 name에 넣기 
		System.out.print(name + " ");
	}
	
	//가장 긴 이름 출력
	int longestIndex = 0;
	for(int i =1; i<a.size(); i++) { //ArrayList a 의 크기만큼 반복 
		if(a.get(longestIndex).length() < a.get(i).length()) //이름 길이 비교
			longestIndex = i ; 	
	}
	System.out.println("가장 긴 이름은" + a.get(longestIndex));	
	}
}
