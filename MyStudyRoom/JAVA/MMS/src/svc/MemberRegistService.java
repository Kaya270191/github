package svc;

import ui.MemberUI;
import vo.Member;


public class MemberRegistService {
	
	public boolean registMember(Member newMember) throws Exception{ 
		
		boolean registSuccess = true; //registSuccess 에 true값을 넣음
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==newMember.getId()) { //기존 아이디랑 새로운 아이디를 비교함 
				registSuccess = false; //같으면 false로 둠 
				break; //for문 빠져나감 
			}
		}
		
		if(registSuccess) { //기존 아이디랑 새로운 아이디가 같지 않다면 true이니 이 if문을 들어옴
			Member [] tempArray = MemberUI.memberArray; //객체 치환
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1]; //기존 배열보다 길이를 한 개 더 늘림
			
			for(int i =0; i < tempArray.length; i++) { //기존에 있는 걸 복사.
				MemberUI.memberArray[i] = tempArray[i];
			}
			
			MemberUI.memberArray[MemberUI.memberArray.length-1] = newMember; //memberArray의 마지막칸에 newMember담기
		}
		return registSuccess;
	}

}
