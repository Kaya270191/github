package svc;

import ui.MemberUI;
import vo.Member;


public class MemberDeleteService { //삭제 
	
	public boolean deleteMember(int id) {
		
		boolean deleteSuccess = false;
		int index = -1; //배열의 0번에 데이터가 있을 수 있어서 초기값을 -1로 줌 
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==id) { //찾는 값이 있으면
				index = i; //인덱스를 i값으로 바꿔라(바꿀 것이 있다는 말)
			}
		}
		
		if(index != -1) { //삭제 할 값이 있다는 의미 
			Member[] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length -1]; //하나 빠질 거니까 배열의 크기를 1개 작게 만들기
			
			for(int i =0; i < tempArray.length; i++) { //기존 배열 크기만큼 
				if(i < index) { //삭제할 인덱스값보다 작은 값들은 그대로 복사해서 넣기 
					MemberUI.memberArray[i] = tempArray[i];
				}
				else if(i > index) { //삭제할 인덱스값보다 크다면 
					MemberUI.memberArray[i-1] = tempArray[i]; // 큰 것들을 배열에 넣기 
				}
			}
			deleteSuccess = true;// 다 하면 true값으로 바꿔주고 
		}
		return deleteSuccess; //리턴
	}

}
