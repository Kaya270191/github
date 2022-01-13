package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;


public class MemberSearchAction implements Action {
	
	
	public void execute (Scanner scan) {

		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		SearchData searchData = consoleUtil.getSearchData(scan);
		MemberSearchService memberSearchService = new MemberSearchService();
		
		
				if(searchData.getSearchCondition().contentEquals("���̵�")) {
					Member member = memberSearchService.searchMemberById(searchData.getSearchValue()); //���̵�� �̸� ã�� 
					consoleUtil.printSearchMember(member);
				
					
				}
				else if(searchData.getSearchCondition().contentEquals("�̸�")) {
					Member [] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());// �迭���� �̸�ã�� 
					consoleUtil.printSearchMemberArray(memberArray);	
				
				}
	
			}
			
		
	}

