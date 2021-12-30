package action;

import java.util.Scanner;
import svc.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action { //����Ʈ �����ͼ� �����ֱ�
	
	public void execute(Scanner scan) { //execute �������̵�
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		MemberListService memberListService = new MemberListService();
		
		Member [] memberArray = memberListService.getMemberArray();
		
		consoleUtil.printMemberList(memberArray);
	}

}
