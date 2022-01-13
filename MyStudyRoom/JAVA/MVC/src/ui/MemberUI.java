package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {
	
	public static Member [] memberArray = new Member[0];  //Member��ü�� ���� �� �ִ� �迭 
	
	public static void main(String[] args) {
		
		MemberController memberController = new MemberController(); //ó������ controlller ����� 
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		Action action = null; //�׼��� �⺻���� �ʱ�ȭ 
		String menu; //int menu -> String Ÿ������ �ٲ� 
	
		do {
			System.out.println("=====ȸ�������� ����=====");
			System.out.println("1.ȸ�� ����");
			System.out.println("2.ȸ�� ��� ����");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� �˻�");
			System.out.println("6.���α׷� ���� ");
			System.out.println("�޴� ��ȣ: ");
			
			menu = sc.next();
			
			switch (menu) { //� ���� �� ������
			case "1": //case 1 -> case "1" ���ڿ��� �ٲ� 
				action = new MemberRegistAction();
				break;
			case "2":
				action = new MemberListAction();
				break;			
			case "3":
				action = new MemberUpdateAction();
				break;
			case "4":
				action = new MemberDeleteAction();
				break;
			case "5":
				action = new MemberSearchAction();
				break;
			case "6":
				stop = true;
				System.out.println("���α׷� ����");
				action = null; //action ���� ������� �ݺ��� ���̻� �� �� �� ����. 
			default: //case�� �ƴ� �͵��� �Էµ��� ��� 
				System.out.println("�ٽ� �Է��� �ּ��� ");					
			}
			
			if(action != null) {
				memberController.processRequest(sc, action); //�ش�׼��� �����Ʈ�ѷ����� �Ѱ��� 
			}			
		}
		while(!stop); //false�� �ƴϸ�(true��) ��� �ݺ� ->  case "6"�� ���� ������ �ݺ��ϴٴ� �ǹ� 
		
	}
}
