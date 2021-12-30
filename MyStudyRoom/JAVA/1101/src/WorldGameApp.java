//n명이 참가하는 끝말잇기 게임 
//메인을 포함하는 WordGameApp 클래스와 Player 클래스 작성, 
//WordGameApp객체 하나와 선수 숫자만큼 Player 객체 생성. 

import java.util.Scanner;

class player{ //배열에 저장된 플레이어 이름,,,
	Scanner S = new Scanner(System.in);
	String name;
	
	public player(String name){
		this.name = name; 
		
		}
	public void getWordFromUser(String arr[]) {
		Scanner S = new Scanner(System.in);
		this.name=name;
		String word = S.next();
		
		System.out.println(arr[i]+">>"+ word);
		
		
		}
	public void checkSuccess() {
		

		}

}


class WorldGameApp{
	//생성자 
	
	public static void run(int num){ //받은 숫자 만큼 player 객체 배열 생성
		Scanner S = new Scanner(System.in);
		String arr [] = new String[num]; //받은 숫자(num)만큼 배열의 공간 생성
		
		for(int i = 0; i < arr.length; i++) { //받은 숫자만큼 참가자의 이름을 입력-for문 
			System.out.println("참가자의 이름을 입력하세요:");
			String name = S.nextLine();
			arr[i] = name;			
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		
		
		System.out.println(java.util.Arrays.toString(arr));
		}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.println("게임에 참가하는 인원은 몇명입니까?>>"); //참가인원 정수 입력 
		int num = S.nextInt(); //배열의 숫자
		run(num); 
		}
	}

	
