package action;

import java.util.Scanner;
import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;



public class MemberUpdateAction implements Action{
	
	public void execute(Scanner scan) {
				
		ConsoleUtil consoleUtil = new ConsoleUtil();		
		int id = consoleUtil.getId("������ ", scan); //������ ���� scan�ؼ� �ޱ� 		
		MemberUpdateService memberUpdateService = new MemberUpdateService();		
		Member oldMember = memberUpdateService.getOldMember(id);
		
		if(oldMember ==null) { //�õ����� ���� ���̵�� �ٽ� ó������ �ٽ� ���ư��� ������ ���̵� �ٽ� �ޱ�!!
			execute(scan);
		}
		
		Member newMember = consoleUtil.getNewMember(oldMember, scan); //new ��� ����� 		
		boolean updateSuccess =memberUpdateService.updateMember(newMember);		
		
		if(updateSuccess) {
			consoleUtil.printUpdateSuccessMessage(newMember.getId());
		}
		else {
			consoleUtil.printUpdateFailMessage(newMember.getId());
		}
	}
}
