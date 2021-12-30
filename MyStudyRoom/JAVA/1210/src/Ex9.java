//p.387 9. 
//철수와 컴퓨터의 가위바위보 게임을 만들어보자. 가위,바위,보는 1,2,3zldlek
//철수가 키를 입력하면 동시에 프로그램도 Math.Random()을 이용하여 1,2,3 중에 한 수를 발생시키고 이것을 컴퓨터가 낸 것으로 한다
//그런 다음 철수와 컴퓨터 중 누가 이겼는지 판별하여 승자를 출력하라

import java.util.Scanner;

public class Ex9 {
	public static String hand(int com) { //문자열 타입의 hand함수(인트형 매개변수) 
		String hand; //
		if(com==1) {
			hand = "가위";
			return hand;
		}
		else if(com==2) {
			hand = "바위";
			return hand;
		}
		else if(com==3) {
			hand = "보";
			return hand;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		int cheol; //철수가 선택한 것을 담을 정수형 변수 cheol
		Scanner S = new Scanner(System.in);
		while(true) { 
			System.out.print("철수[가위(1),바위(2),보(3),끝내기(4)]>>");
			cheol = S.nextInt(); //철수의 선택
							
			int com = (int)(Math.random()*1)+3; //컴퓨터 가위바위보를 랜덤으로 생성 
			//System.out.println(com);
			//toString(com);
			
			//철수와 컴퓨터가 선택한 숫자를 hand()함수 호출
			System.out.println("철수("+ hand(cheol) + ") : 컴퓨터(" + hand(com) +")");
			
			if(cheol == 1) { 
				if(com == 3) {
					System.out.println("철수가 이겼습니다");
				}
				else if (com == 2) {
					System.out.println("컴퓨터가 이겼습니다");
				}
				else if(com ==3) {
					System.out.println("비겼습니다");
				}
			}
			else if(cheol ==2) {
				if(com == 3) {
					System.out.println("컴퓨터가 이겼습니다");
				}
				else if(com == 2) {
					System.out.println("비겼습니다");
				}
				else if(com ==1) {
					System.out.println("철수가 이겼습니다");
				}
			}
			else if(cheol ==3) {
				if(com == 3) {
					System.out.println("비겼습니다");
				}
				else if(com == 2) {
					System.out.println("철수가 이겼습니다");
				}
				else if(com ==1) {
					System.out.println("컴퓨터가 이겼습니다");
				}
			}if(cheol==4) { //4를 입력하면 끝
				break;}
		}
	}
}
