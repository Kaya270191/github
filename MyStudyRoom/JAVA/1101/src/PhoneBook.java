//이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고, 실행 예시와 같이 작동하는 PhonBook 클래스를 작성하라.

import java.util.Scanner;

class Phone{//필드
	Scanner S = new Scanner(System.in);

	String name;
	String tel;
	
	
	public Phone(String name, String tel){//생성자
		this.name=name;
		this.tel=tel;
		}
	}


public class PhoneBook {
	Scanner S = new Scanner(System.in);
	
	
	Phone phonebook[];//입력받은 숫자로 배열의 크기 설정  . phone객체 배열
	PhoneBook(int num){ //기본 생성자 
		this.phonebook=new Phone[num];
		
		for(int i=0; i < phonebook.length ; i++) {
			System.out.print("이름과 전화번호는 빈 칸 없이 입력>>");
			String name = S.next();
			String tel = S.next();
			phonebook[i] = new Phone(name, tel);
			
			} System.out.println(phonebook); System.out.println("저장되었습니다....");
		}
	
	
	public void search() { // 함수
		while(true) {
			System.out.println("검색할 이름?");
			String name = S.next();
	
			for (int i= 0; i < this.phonebook.length; i++) {
				if(name.equals(this.phonebook[i].name)){
					System.out.println(this.phonebook[i].name+ "의 번호는"+ this.phonebook[i].tel +"입니다.");
				}
				else {
					System.out.println(name+"이 없습니다.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("인원수?>>");
		int num = S.nextInt();
		PhoneBook phonebook = new PhoneBook(num);
		
		phonebook.search();

		
		
		

	}

}
