package svc;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {
	
	public Member searchMemberById(String searchValue) { //아이디로 멤버찾기 		
		Member member = null; //멤버 선언 변수 초기화 		
		for(int i = 0 ; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() ==Integer.parseInt(searchValue)) { //매개변수로 스트링타입으로 받아서 이것을 숫자형태로 변환해서 비교 
				member = MemberUI.memberArray[i]; 
				break;
			}
		}
		
		return member;
	}
	
	public Member[] searchMemberByName(String searchValue) { //이름으로 멤버찾기 	
		Member[] searchMemberArray = null;
		
		int count =0;
		Member[] tempArray = new Member[MemberUI.memberArray.length]; // 기존멤버 이름이 다 같을 수 있어서 tempArray 길이를 같이 해줌 
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) { //찾는 이름이 멤버어레이에 있는 이름과 같으면 
				tempArray[count++] = MemberUI.memberArray[i]; //같으면 템프어레이에 담기.
			}
		}
		
		searchMemberArray = new Member[count];
		
		for(int i =0; i < count ; i++) {//카운트까지만 반복 (카운트가 값이 들어있는 곳.까지만 반복하면 됨) 
			searchMemberArray[i] = tempArray[i];
		}
		
		return searchMemberArray;
	}

}
