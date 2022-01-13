package util;

import java.util.InputMismatchException;


import java.util.Scanner;

import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	
	//�����ε� getNewMember
	public Member getNewMember(Scanner scan) { //��� Ŭ������ �����ɹ��Լ�(����:��ĳ�ʷ� �Է°�)
		
		Member newMember = new Member(); // ��� Ŭ������ newMember ���۷��� ����. 
		
		while(true) {
			try { //���ܹ߻����ɼ� 
				System.out.println("=====�� ȸ�� ���� ���====="); //id, name, email, addr, tel, age �Է¹ޱ�
				System.out.print("ȸ�����̵�: ");//����: ���̵� ���������� �� �� �³�?
				int id = scan.nextInt(); 
				System.out.print("ȸ���̸�: ");
				String name = scan.next();
				System.out.print("ȸ���̸���: "); 
				String email = scan.next();
				System.out.print("ȸ���ּ�: ");
				String addr = scan.next();
				System.out.print("ȸ�����: ");
				String hobby = scan.next();
				System.out.print("ȸ����ȭ��ȣ: ");
				String tel = scan.next();
				System.out.print("ȸ������: ");
				int age = scan.nextInt(); 
			
			
				newMember.setId(id); 		//newMember ���۷����� Ŭ���� ����� setId�Լ� ȣ�� 
				newMember.setName(name);    //newMember ���۷����� Ŭ���� ����� setEmail �Լ� ȣ��
				newMember.setEmail(email);  
				newMember.setAddr(addr);
				newMember.setHobby(hobby);
				newMember.setTel(tel);
				newMember.setAge(age);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ��Է��ϼ���");
				scan.next(); //��ĳ�ʷ� �߸��Է¹��� ���� �ٽ� �Է� 
			}
		}
		
		return newMember;			 //newMember ��ü ����
	}
		
		
	public void printRegistSuccessMessage(int id) { // printRegistSuccessMessage(int�� id�� �Ű������� �޴�) �Լ�
			System.out.println(id + "ȸ�� ��� ����");
	}
		
	public void printRegistFailMessage(int id) {
			System.out.println(id + "ȸ�� ��� ����");
	}
		
	public void printMemberList(Member[] memberArray) { //printMemberList(Member[] memberArray) ���Ŭ������ memberArray[]�迭�� �Ű������� �޴� �Լ� 
		if(memberArray.length == 0) { 	//���� memberArray�� ���̰� 0 �̸� 
			System.out.println("�߰��� ȸ�� ������ �����ϴ�.");
		}
		else { 				//memberArray�� ���̰� 0�� �ƴϸ� 
			for(int i =0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]); //memberArray�� [i]���� ����Ʈ �ϱ� 
			}
		}
	}
		
	public int getId(String msgKind, Scanner scan) { //msg�� ������ ���̵�, ������ ���̵�, ã�� ���̵�
		while(true) {
			try {
				System.out.println(msgKind + "���̵�: ");
				return scan.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("�߸��Է��߽��ϴ�. ���̵�(����)�Է��ϼ���");
				scan.next();//
				continue; //�ٽ� ���Ϸ�
				
			}
			catch(NullPointerException e) {
				System.out.println("���̵� �����ϴ�. �ٽ� �Է����ּ���");
				scan.next();
				continue;
			}
		}			
	}
		
	//�����ε�  getNewMember
	public Member getNewMember(Member oldMember, Scanner scan) { //MemberŬ������ getNewMember�Լ�(���Ŭ������ oldMember��, �Է¹��� ���� �Ű������� ����)		
		Member member = new Member(); //��� Ŭ������ ���۷��� member ����. 
		String name, email, addr, hobby, tel;
		int age;				
		while(true) {
			try {
				System.out.println("=====�� ȸ�� ���� ����=====");
				System.out.println("ȸ�� ���̵�: " + oldMember.getId());
				System.out.println("���� �̸�: " + oldMember.getName());
				System.out.println("�� ȸ�� �̸�: ");
				name = scan.next();
				System.out.println("���� �̸���: " + oldMember.getEmail());
				System.out.println("�� ȸ�� �̸���: ");
				email = scan.next();
				System.out.println("���� �ּ�: " + oldMember.getAddr());
				System.out.println("�� ȸ�� �ּ�: ");
				addr = scan.next();
				System.out.println("���� ���: " + oldMember.getHobby());
				System.out.println("�� ȸ�� ���: ");
				hobby = scan.next();
				System.out.println("�� ȸ�� ��ȭ��ȣ: ");
				tel = scan.next();
				age = scan.nextInt(); 
				System.out.println("���� ����: " + oldMember.getAge());
				System.out.println("�� ȸ�� ����: ");
				break;
				}
			catch(InputMismatchException e) {
				System.out.println("����(����)�� �Է��� �ּ���");
				scan.next();						
				}
			}			
				member.setId(oldMember.getId());
				member.setName(name);
				member.setEmail(email);
				member.setAddr(addr);
				member.setHobby(hobby);
				member.setTel(tel);
				member.setAge(age);
			return member;
	}


		public void printUpdateSuccessMessage(int id) {
			System.out.println(id + "ȸ�� ���� ���� ����");
		}
		
		public void printUpdateFailMessage(int id) {
			System.out.println(id + "ȸ�� ���� ���� ����");
		}
		
		public void printDeleteSuccessMessage(int id) {
			System.out.println(id + "ȸ�� ���� ���� ����");
		}
		
		public void printDeleteFailMessage(int id) {
			System.out.println(id + "ȸ�� ���� ���� ����");
		}
		
		public SearchData getSearchData(Scanner scan) {	 
			String searchValue = null; //searchValue �ʱⰪ �� �־�� ���ϰ��� ���� �� ����
			String searchCondition = null; //searchCondition �ʱⰪ 
			
			while(true) { 
				System.out.println("�˻� ������ �����Ͻÿ�.");
				System.out.println("1. ���̵�");
				System.out.println("2. �̸�");
				System.out.println("�˻� ����: ");
				searchValue =null;
				searchCondition = scan.next(); //���̵�� �̸� �� �ϳ� 
							
				if(searchCondition.contentEquals("���̵�")) {
					System.out.println("�˻��� ���̵�: ");
					searchValue = scan.next();
					break;
				}
				else if(searchCondition.equals("�̸�")) {
					System.out.println("�˻��� �̸�: ");
					searchValue = scan.next();
					break;
				}
				else {
					System.out.println("�ٽ� �Է�");
					continue;
				}
			}
			SearchData searchData = new SearchData();
			searchData.setSearchCondition(searchCondition);
			searchData.setSearchValue(searchValue);			
			return searchData;
		}

		
		public void printSearchMember(Member member) { //���̵�� �˻��� ���
			if(member == null) {
				System.out.println("�˻��� ����� �����ϴ�.");
			}
			else {
				System.out.println(member.getId() + "���� �˻��� ���");
				System.out.println(member);
			}
		}
		
		public void printSearchMemberArray(Member[] memberArray) { //�̸����� �˻��� ��� 
			if( memberArray.length == 0) {
				System.out.println("�̸����� �˻��� ����� �����ϴ�.");
			}
			else {
				System.out.println("�̸����� �˻��� ���");
				for(int i = 0; i < memberArray.length; i++) {
					System.out.println(memberArray[i]);
			}
			
		}
	}	
}

