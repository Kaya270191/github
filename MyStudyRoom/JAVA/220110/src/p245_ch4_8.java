//p.245
//8. �̸�, ��ȭ��ȣ, �ʵ�� ������ ���� ���� Phone Ŭ������ �ۼ��ϰ� ���� ���ÿ� ���� �۵��ϴ� PhoneBook Ŭ������ �ۼ��϶�

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	public Phone(String name, String tel) { //�Ű������� name�� tel�� �޴� ������ �Լ� 
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class p245_ch4_8 {

	public static void main(String[] args) {
		Phone phoneBook []; //���۷��� ����
		Scanner S = new Scanner(System.in);
		System.out.println("�ο���>>");
		int num = S.nextInt();//�迭�� ũ�⸦ �Է� ���� 
		phoneBook = new Phone[num]; //�Է¹��� ����ŭ�� ��ü �迭 ����
		
		for(int i =0 ; i<num; i++) {
			System.out.println("�̸��� ��ȣ�� �� ĭ ���� �Է� ");
			String name = S.next(); //�̸� �Է� 
			String tel = S.next();  // ��ȣ �Է�
			phoneBook[i] = new Phone(name, tel); //��ü �����ؼ� �迭�� �ֱ� 
		}System.out.println("����Ǿ����ϴ�.");
		
		System.out.println("�˻��� �̸�??");
		String searchName = S.next(); //�˻��� �̸�
		for(int i=0; i<num; i++) {
			if(searchName.equals(phoneBook[i].getName())) {
				System.out.println(phoneBook[i].getName() + phoneBook[i].getTel());
			}else
				System.out.println(searchName + "�� �����ϴ�.");
		}
	}
}
