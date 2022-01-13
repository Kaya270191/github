package svc;

import ui.MemberUI;
import vo.Member;


public class MemberDeleteService { //���� 
	
	public boolean deleteMember(int id) {
		
		boolean deleteSuccess = false;
		int index = -1; //�迭�� 0���� �����Ͱ� ���� �� �־ �ʱⰪ�� -1�� �� 
		
		for(int i =0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==id) { //ã�� ���� ������
				index = i; //�ε����� i������ �ٲ��(�ٲ� ���� �ִٴ� ��)
			}
		}
		
		if(index != -1) { //���� �� ���� �ִٴ� �ǹ� 
			Member[] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length -1]; //�ϳ� ���� �Ŵϱ� �迭�� ũ�⸦ 1�� �۰� �����
			
			for(int i =0; i < tempArray.length; i++) { //���� �迭 ũ�⸸ŭ 
				if(i < index) { //������ �ε��������� ���� ������ �״�� �����ؼ� �ֱ� 
					MemberUI.memberArray[i] = tempArray[i];
				}
				else if(i > index) { //������ �ε��������� ũ�ٸ� 
					MemberUI.memberArray[i-1] = tempArray[i]; // ū �͵��� �迭�� �ֱ� 
				}
			}
			deleteSuccess = true;// �� �ϸ� true������ �ٲ��ְ� 
		}
		return deleteSuccess; //����
	}

}
