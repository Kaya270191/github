package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {
	
	public static Member [] memberArray = new Member[0];  //Member객체를 담을 수 있는 배열 
	
	public static void main(String[] args) {
		
		MemberController memberController = new MemberController(); //처리해줄 controlller 만들고 
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		Action action = null; //액션의 기본값을 초기화 
		String menu; //int menu -> String 타입으로 바꿈 
	
		do {
			System.out.println("=====회원데이터 관리=====");
			System.out.println("1.회원 가입");
			System.out.println("2.회원 목록 보기");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 정보 삭제");
			System.out.println("5.회원 정보 검색");
			System.out.println("6.프로그램 종료 ");
			System.out.println("메뉴 번호: ");
			
			menu = sc.next();
			
			switch (menu) { //어떤 일을 할 것인지
			case "1": //case 1 -> case "1" 문자열로 바꿈 
				action = new MemberRegistAction();
				break;
			case "2":
				action = new MemberListAction();
				break;			
			case "3":
				action = new MemberUpdateAction();
				break;
			case "4":
				action = new MemberDeleteAction();
				break;
			case "5":
				action = new MemberSearchAction();
				break;
			case "6":
				stop = true;
				System.out.println("프로그램 종료");
				action = null; //action 값을 없애줘야 반복을 더이상 안 할 수 있음. 
			default: //case가 아닌 것들이 입력됐을 경우 
				System.out.println("다시 입력해 주세요 ");					
			}
			
			if(action != null) {
				memberController.processRequest(sc, action); //해당액션을 멤버컨트롤러에게 넘겨줌 
			}			
		}
		while(!stop); //false가 아니면(true면) 계속 반복 ->  case "6"이 나올 때까지 반복하다는 의미 
		
	}
}
