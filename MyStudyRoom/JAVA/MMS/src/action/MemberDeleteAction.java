package action;

import java.util.Scanner;
import svc.MemberDeleteService;
import util.ConsoleUtil;

public class MemberDeleteAction implements Action {
	
	ConsoleUtil consoleUtil = new ConsoleUtil();
	
	public void execute(Scanner scan) throws Exception{ //execute오버라이딩 
		
		int id = consoleUtil.getId("삭제할 ", scan);
		
		MemberDeleteService memberDeleteService = new MemberDeleteService();// 객체 생성 
		
		boolean deleteSuccess = memberDeleteService.deleteMember(id);
		
		if(deleteSuccess) { //삭제 성공
			consoleUtil.printDeleteSuccessMessage(id);
		}
		else { //삭제 실패 
			consoleUtil.printDeleteFailMessage(id);
		}
	}

}
