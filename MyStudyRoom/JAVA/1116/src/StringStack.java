//p.319
//Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라

import java.util.Scanner;
interface Stack{ 				//인터페이스 Stack
	int length();				//현재 스택에 저장된 개수 리턴 
	int capacity();				//스택의 전체 저장 가능한 개수 리턴
	String pop();				//스택의 톱(top)에 실수 저장 
	Boolean push(String val);	//스택의 톱(top)에 저장된 실수 리턴 
}


public class StringStack implements Stack {			//인터페이스 Stack를 상속
	Scanner S = new Scanner(System.in);
	String array[];
	
	public StringStack(int space) { //매개변수1개인 생성자  공간만들기 
		
		array = new String [space]; //
		for (int i =0; i<array.length; i++) { //
		System.out.println(array);
		}
	}
	public int length() { // 저장된 값이 몇갠지 
		
		
	}
	public int capacity() { //배열에 저장가능한 배열 전체 크기 
		return array.length;
	}
	public String pop() { //저장한 글자 꺼내기 
		
	}
	Boolean push(String val) { //입력하는 글자를 배열에 저장
		for(int i =0; i< array.length; i++) {
			String word = S.next(val);
			array[i] = new String(word);
		}
	
	}
	

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		int space = S.nextInt();
		StringStack stack = new StringStack(space);
		
		
		

	}

}
