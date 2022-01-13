package action;

import java.util.Scanner;
import svc.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;


public class MemberRegistAction implements Action { //멤버 등록 

	public void execute(Scanner scan) throws Exception{
		
		ConsoleUtil consoleUtil = new ConsoleUtil(); //
		
		Member newMember = consoleUtil.getNewMember(scan); //멤버 만들기. consoluUtil 안 getNewMember 메소드 호출 
		
		MemberRegistService memberRegistService = new MemberRegistService();
		
		
		boolean registSuccess = memberRegistService.registMember(newMember);// memberRegistService클래스의 registMember함수 
		
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newMember.getId());
		}
		else {
			consoleUtil.printRegistFailMessage(newMember.getId());
		}
	}
	
}
