package svc;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {
	
	public Member searchMemberById(String searchValue) { //���̵�� ���ã�� 		
		Member member = null; //��� ���� ���� �ʱ�ȭ 		
		for(int i = 0 ; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() ==Integer.parseInt(searchValue)) { //�Ű������� ��Ʈ��Ÿ������ �޾Ƽ� �̰��� �������·� ��ȯ�ؼ� �� 
				member = MemberUI.memberArray[i]; 
				break;
			}
		}
		
		return member;
	}
	
	public Member[] searchMemberByName(String searchValue) { //�̸����� ���ã�� 	
		Member[] searchMemberArray = null;
		
		int count =0;
		Member[] tempArray = new Member[MemberUI.memberArray.length]; // ������� �̸��� �� ���� �� �־ tempArray ���̸� ���� ���� 
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) { //ã�� �̸��� �����̿� �ִ� �̸��� ������ 
				tempArray[count++] = MemberUI.memberArray[i]; //������ ������̿� ���.
			}
		}
		
		searchMemberArray = new Member[count];
		
		for(int i =0; i < count ; i++) {//ī��Ʈ������ �ݺ� (ī��Ʈ�� ���� ����ִ� ��.������ �ݺ��ϸ� ��) 
			searchMemberArray[i] = tempArray[i];
		}
		
		return searchMemberArray;
	}

}
