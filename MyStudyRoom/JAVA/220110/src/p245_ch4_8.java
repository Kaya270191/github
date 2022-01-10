//p.245
//8. 이름, 전화번호, 필드와 생성자 등을 가진 Phone 클래스를 작성하고 실행 예시와 같이 작동하는 PhoneBook 클래스를 작성하라

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	public Phone(String name, String tel) { //매개변수를 name과 tel을 받는 생성자 함수 
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
		Phone phoneBook []; //레퍼런스 선언
		Scanner S = new Scanner(System.in);
		System.out.println("인원수>>");
		int num = S.nextInt();//배열의 크기를 입력 받음 
		phoneBook = new Phone[num]; //입력받은 수만큼의 객체 배열 생성
		
		for(int i =0 ; i<num; i++) {
			System.out.println("이름과 번호는 빈 칸 없이 입력 ");
			String name = S.next(); //이름 입력 
			String tel = S.next();  // 번호 입력
			phoneBook[i] = new Phone(name, tel); //객체 생성해서 배열에 넣기 
		}System.out.println("저장되었습니다.");
		
		System.out.println("검색할 이름??");
		String searchName = S.next(); //검색할 이름
		for(int i=0; i<num; i++) {
			if(searchName.equals(phoneBook[i].getName())) {
				System.out.println(phoneBook[i].getName() + phoneBook[i].getTel());
			}else
				System.out.println(searchName + "은 없습니다.");
		}
	}
}
