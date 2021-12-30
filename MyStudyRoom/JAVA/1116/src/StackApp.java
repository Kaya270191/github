//p.319
//Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라

import java.util.Scanner;
interface Stack{ 				//인터페이스 Stack
	int length();				//현재 스택에 저장된 개수 리턴 
	int capacity();				//스택의 전체 저장 가능한 개수 리턴
	String pop();				//스택의 톱(top)에 실수 저장 
	Boolean push(String val);	//스택의 톱(top)에 저장된 실수 리턴 
}


class StringStack implements Stack {			//인터페이스 Stack를 상속
	Scanner S = new Scanner(System.in);
	int space; //저장 가능한 공간
	String array[]; //배열 
	int tos; // 스택의 가장 위의 값 
	
	StringStack(int space) { //매개변수1개인 생성자  공간만들기 
		array = new String [space]; 
		tos =-1; 			//배열이 0번째 부터 시작하니까 초기값은 -1로 시작해줌.
	}
	
	@Override
	public int length() { // 현재 저장된 값이 몇갠지 
		return tos+1;		//+1를 해줘야 배열의 0번째가 됨. 
	}
	
	@Override
	public int capacity() { //배열에 저장가능한 배열 전체 크기 
		return array.length;
	}
	
	@Override
	public String pop() { //맨 위에 저장한 글자 꺼내기 
		if(tos==-1) { //값이 하나도 저장이 안 되어 있으면 null값 리턴
			return null;
		}
		String s = array[tos]; //배열의 값을 하나 꺼내면 tos값을 한 개씩 빼줌
		tos--;
		return s; //값이 하나라도 있으면 배열의 마지막 값 s 을 리턴 	
	}
	
	@Override
	public Boolean push(String val) { //입력하는 글자를 배열에 저장
		if(tos==array.length-1) 	//tos가 -1부터 시작하니 배열의 값과 같아지기 위해선 배열길이-1 해주기
			return false; 			//길이가 같으면 더 이상 저장할 곳이 없으니 false 값 리턴
		else { 						//입력값 저장하기 
			tos++; 					// tos가 -1부터 시작하니 1씩 증가
			array[tos] = val; 		//배열의 tos 번쨰에 입력한 글자 저장 
			return true;
		}
	}
}

class StackApp {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		int space = S.nextInt(); 					//저장 공간의 크기 
		StringStack stack = new StringStack(space); //객체생성->생성자 호출
		
		while(true) {
				System.out.println("문자열 입력>>");
				String word = S.next();  //입력한 값을 String 타입으로 받기 
				if(word.equals("그만")) //그만 이라고 입력하면 while문 탈출 
					break;
				
				boolean result = stack.push(word);
				if(!result) { //만약 result가 false이면 
					System.out.println("스택이 꽉 차서 푸시불가");
				}
		}
		
		System.out.println("스택에 저장된 모든 문자열>>");
		int len = stack.length();
		for(int i =0; i<len; i++) {
			System.out.print(stack.pop()+ " ");
		}
		S.close();
	}
}
				
		


