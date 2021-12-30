package svc;

import ui.MemberUI;
import vo.Member;

public class MemberUpdateService {
	
	public Member getOldMember(int id) {//아이디가 원래 있던 것인지 확인 
		
		Member oldMember = null;
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==id) { //전체배열에서 id 찾기 
				oldMember = MemberUI.memberArray[i];
				break;
			}
		}
		return oldMember;
	}
	
	public boolean updateMember(Member newMember) {
		boolean updateSuccess = false;
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == newMember.getId()) {// 새로 넣은 아이디 값과 멤버어레이의 아이디 값이 같으면 
				MemberUI.memberArray[i] = newMember;
				updateSuccess = true;
				break;
			}
		}
		return updateSuccess;
	}

}
