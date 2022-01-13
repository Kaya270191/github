package action;

import java.util.Scanner;
import svc.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action { //리스트 가져와서 보여주기
	
	public void execute(Scanner scan) { //execute 오버라이딩
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		MemberListService memberListService = new MemberListService();
		
		Member [] memberArray = memberListService.getMemberArray();
		
		consoleUtil.printMemberList(memberArray);
	}

}
