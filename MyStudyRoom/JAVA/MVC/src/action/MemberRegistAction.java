package action;

import java.util.Scanner;
import svc.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;


public class MemberRegistAction implements Action { //��� ��� 

	public void execute(Scanner scan) throws Exception{
		
		ConsoleUtil consoleUtil = new ConsoleUtil(); //
		
		Member newMember = consoleUtil.getNewMember(scan); //��� �����. consoluUtil �� getNewMember �޼ҵ� ȣ�� 
		
		MemberRegistService memberRegistService = new MemberRegistService();
		
		
		boolean registSuccess = memberRegistService.registMember(newMember);// memberRegistServiceŬ������ registMember�Լ� 
		
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newMember.getId());
		}
		else {
			consoleUtil.printRegistFailMessage(newMember.getId());
		}
	}
	
}
