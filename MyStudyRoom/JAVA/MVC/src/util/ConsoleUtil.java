package util;

import java.util.InputMismatchException;


import java.util.Scanner;

import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	
	//오버로딩 getNewMember
	public Member getNewMember(Scanner scan) { //멤버 클래스의 갯뉴맴버함수(변수:스캐너로 입력값)
		
		Member newMember = new Member(); // 멤머 클래스의 newMember 레퍼런스 생성. 
		
		while(true) {
			try { //예외발생가능성 
				System.out.println("=====새 회원 정보 등록====="); //id, name, email, addr, tel, age 입력받기
				System.out.print("회원아이디: ");//예외: 아이디를 정수형으로 한 것 맞나?
				int id = scan.nextInt(); 
				System.out.print("회원이름: ");
				String name = scan.next();
				System.out.print("회원이메일: "); 
				String email = scan.next();
				System.out.print("회원주소: ");
				String addr = scan.next();
				System.out.print("회원취미: ");
				String hobby = scan.next();
				System.out.print("회원전화번호: ");
				String tel = scan.next();
				System.out.print("회원나이: ");
				int age = scan.nextInt(); 
			
			
				newMember.setId(id); 		//newMember 레퍼런스로 클래스 멤버의 setId함수 호출 
				newMember.setName(name);    //newMember 레퍼런스로 클래스 멤버의 setEmail 함수 호출
				newMember.setEmail(email);  
				newMember.setAddr(addr);
				newMember.setHobby(hobby);
				newMember.setTel(tel);
				newMember.setAge(age);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("다시입력하세요");
				scan.next(); //스캐너로 잘못입력받은 것을 다시 입력 
			}
		}
		
		return newMember;			 //newMember 객체 리턴
	}
		
		
	public void printRegistSuccessMessage(int id) { // printRegistSuccessMessage(int형 id를 매개변수로 받는) 함수
			System.out.println(id + "회원 등록 성공");
	}
		
	public void printRegistFailMessage(int id) {
			System.out.println(id + "회원 등록 실패");
	}
		
	public void printMemberList(Member[] memberArray) { //printMemberList(Member[] memberArray) 멤버클래스의 memberArray[]배열을 매개변수로 받는 함수 
		if(memberArray.length == 0) { 	//만약 memberArray의 길이가 0 이면 
			System.out.println("추가된 회원 정보가 없습니다.");
		}
		else { 				//memberArray의 길이가 0이 아니면 
			for(int i =0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]); //memberArray의 [i]값을 프린트 하기 
			}
		}
	}
		
	public int getId(String msgKind, Scanner scan) { //msg는 삭제할 아이디, 수정할 아이디, 찾을 아이디
		while(true) {
			try {
				System.out.println(msgKind + "아이디: ");
				return scan.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("잘못입력했습니다. 아이디(숫자)입력하세요");
				scan.next();//
				continue; //다시 와일로
				
			}
			catch(NullPointerException e) {
				System.out.println("아이디가 없습니다. 다시 입력해주세요");
				scan.next();
				continue;
			}
		}			
	}
		
	//오버로딩  getNewMember
	public Member getNewMember(Member oldMember, Scanner scan) { //Member클래스의 getNewMember함수(멤버클래스의 oldMember와, 입력받은 값을 매개변수로 가짐)		
		Member member = new Member(); //멤버 클래스의 레퍼런스 member 생성. 
		String name, email, addr, hobby, tel;
		int age;				
		while(true) {
			try {
				System.out.println("=====새 회원 정보 수정=====");
				System.out.println("회원 아이디: " + oldMember.getId());
				System.out.println("이전 이름: " + oldMember.getName());
				System.out.println("새 회원 이름: ");
				name = scan.next();
				System.out.println("이전 이메일: " + oldMember.getEmail());
				System.out.println("새 회원 이메일: ");
				email = scan.next();
				System.out.println("이전 주소: " + oldMember.getAddr());
				System.out.println("새 회원 주소: ");
				addr = scan.next();
				System.out.println("이전 취미: " + oldMember.getHobby());
				System.out.println("새 회원 취미: ");
				hobby = scan.next();
				System.out.println("새 회원 전화번호: ");
				tel = scan.next();
				age = scan.nextInt(); 
				System.out.println("이전 나이: " + oldMember.getAge());
				System.out.println("새 회원 나이: ");
				break;
				}
			catch(InputMismatchException e) {
				System.out.println("나이(숫자)를 입력해 주세요");
				scan.next();						
				}
			}			
				member.setId(oldMember.getId());
				member.setName(name);
				member.setEmail(email);
				member.setAddr(addr);
				member.setHobby(hobby);
				member.setTel(tel);
				member.setAge(age);
			return member;
	}


		public void printUpdateSuccessMessage(int id) {
			System.out.println(id + "회원 정보 수정 성공");
		}
		
		public void printUpdateFailMessage(int id) {
			System.out.println(id + "회원 정보 수정 실패");
		}
		
		public void printDeleteSuccessMessage(int id) {
			System.out.println(id + "회원 정보 삭제 성공");
		}
		
		public void printDeleteFailMessage(int id) {
			System.out.println(id + "회원 정보 삭제 실패");
		}
		
		public SearchData getSearchData(Scanner scan) {	 
			String searchValue = null; //searchValue 초기값 이 있어야 리턴값을 받을 수 있음
			String searchCondition = null; //searchCondition 초기값 
			
			while(true) { 
				System.out.println("검색 조건을 선택하시오.");
				System.out.println("1. 아이디");
				System.out.println("2. 이름");
				System.out.println("검색 조건: ");
				searchValue =null;
				searchCondition = scan.next(); //아이디랑 이름 중 하나 
							
				if(searchCondition.contentEquals("아이디")) {
					System.out.println("검색할 아이디: ");
					searchValue = scan.next();
					break;
				}
				else if(searchCondition.equals("이름")) {
					System.out.println("검색할 이름: ");
					searchValue = scan.next();
					break;
				}
				else {
					System.out.println("다시 입력");
					continue;
				}
			}
			SearchData searchData = new SearchData();
			searchData.setSearchCondition(searchCondition);
			searchData.setSearchValue(searchValue);			
			return searchData;
		}

		
		public void printSearchMember(Member member) { //아이디로 검색한 결과
			if(member == null) {
				System.out.println("검색한 결과가 없습니다.");
			}
			else {
				System.out.println(member.getId() + "으로 검색한 결과");
				System.out.println(member);
			}
		}
		
		public void printSearchMemberArray(Member[] memberArray) { //이름으로 검색한 결과 
			if( memberArray.length == 0) {
				System.out.println("이름으로 검색한 결과가 없습니다.");
			}
			else {
				System.out.println("이름으로 검색한 결과");
				for(int i = 0; i < memberArray.length; i++) {
					System.out.println(memberArray[i]);
			}
			
		}
	}	
}

