//�̸�(name), ��ȭ��ȣ(tel) �ʵ�� ������ ���� ���� Phone Ŭ������ �ۼ��ϰ�, ���� ���ÿ� ���� �۵��ϴ� PhonBook Ŭ������ �ۼ��϶�.

import java.util.Scanner;

class Phone{//�ʵ�
	Scanner S = new Scanner(System.in);

	String name;
	String tel;
	
	
	public Phone(String name, String tel){//������
		this.name=name;
		this.tel=tel;
		}
	}


public class PhoneBook {
	Scanner S = new Scanner(System.in);
	
	
	Phone phonebook[];//�Է¹��� ���ڷ� �迭�� ũ�� ����  . phone��ü �迭
	PhoneBook(int num){ //�⺻ ������ 
		this.phonebook=new Phone[num];
		
		for(int i=0; i < phonebook.length ; i++) {
			System.out.print("�̸��� ��ȭ��ȣ�� �� ĭ ���� �Է�>>");
			String name = S.next();
			String tel = S.next();
			phonebook[i] = new Phone(name, tel);
			
			} System.out.println(phonebook); System.out.println("����Ǿ����ϴ�....");
		}
	
	
	public void search() { // �Լ�
		while(true) {
			System.out.println("�˻��� �̸�?");
			String name = S.next();
	
			for (int i= 0; i < this.phonebook.length; i++) {
				if(name.equals(this.phonebook[i].name)){
					System.out.println(this.phonebook[i].name+ "�� ��ȣ��"+ this.phonebook[i].tel +"�Դϴ�.");
				}
				else {
					System.out.println(name+"�� �����ϴ�.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("�ο���?>>");
		int num = S.nextInt();
		PhoneBook phonebook = new PhoneBook(num);
		
		phonebook.search();

		
		
		

	}

}
