package svc;

import ui.MemberUI;
import vo.Member;


public class MemberRegistService {
	
	public boolean registMember(Member newMember) throws Exception{ 
		
		boolean registSuccess = true; //registSuccess �� true���� ����
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==newMember.getId()) { //���� ���̵�� ���ο� ���̵� ���� 
				registSuccess = false; //������ false�� �� 
				break; //for�� �������� 
			}
		}
		
		if(registSuccess) { //���� ���̵�� ���ο� ���̵� ���� �ʴٸ� true�̴� �� if���� ����
			Member [] tempArray = MemberUI.memberArray; //��ü ġȯ
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1]; //���� �迭���� ���̸� �� �� �� �ø�
			
			for(int i =0; i < tempArray.length; i++) { //������ �ִ� �� ����.
				MemberUI.memberArray[i] = tempArray[i];
			}
			
			MemberUI.memberArray[MemberUI.memberArray.length-1] = newMember; //memberArray�� ������ĭ�� newMember���
		}
		return registSuccess;
	}

}
