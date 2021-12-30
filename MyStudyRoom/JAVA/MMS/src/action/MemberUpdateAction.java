package action;

import java.util.Scanner;
import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;



public class MemberUpdateAction implements Action{
	
	public void execute(Scanner scan) {
				
		ConsoleUtil consoleUtil = new ConsoleUtil();		
		int id = consoleUtil.getId("수정할 ", scan); //수정할 것을 scan해서 받기 		
		MemberUpdateService memberUpdateService = new MemberUpdateService();		
		Member oldMember = memberUpdateService.getOldMember(id);
		
		if(oldMember ==null) { //올드멤버가 없는 아이디면 다시 처음으로 다시 돌아가서 수정할 아이디를 다시 받기!!
			execute(scan);
		}
		
		Member newMember = consoleUtil.getNewMember(oldMember, scan); //new 멤버 만들기 		
		boolean updateSuccess =memberUpdateService.updateMember(newMember);		
		
		if(updateSuccess) {
			consoleUtil.printUpdateSuccessMessage(newMember.getId());
		}
		else {
			consoleUtil.printUpdateFailMessage(newMember.getId());
		}
	}
}
