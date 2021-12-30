package action;

import java.util.Scanner;
import svc.MemberDeleteService;
import util.ConsoleUtil;

public class MemberDeleteAction implements Action {
	
	ConsoleUtil consoleUtil = new ConsoleUtil();
	
	public void execute(Scanner scan) throws Exception{ //execute�������̵� 
		
		int id = consoleUtil.getId("������ ", scan);
		
		MemberDeleteService memberDeleteService = new MemberDeleteService();// ��ü ���� 
		
		boolean deleteSuccess = memberDeleteService.deleteMember(id);
		
		if(deleteSuccess) { //���� ����
			consoleUtil.printDeleteSuccessMessage(id);
		}
		else { //���� ���� 
			consoleUtil.printDeleteFailMessage(id);
		}
	}

}
