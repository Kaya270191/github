//p.418 예제7-7. HashMap에 객체 저장, 학생 정보 관리 
//id와 tel로 구성되는 Student 클래스를 만들고 이름을 '키', Student 객체를 '값'으로 하는 해시맵 작성 

import java.util.*;

class Student1{
	private int id; 
	private String tel;
	public Student1(int id, String tel) {//생성자
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		//학생 이름, Student 객체를 저장하는 해시맵 생성
		HashMap<String, Student1> map = new HashMap<String, Student1>();
		map.put("가옹이", new Student1(1, "010-2222-2222")); //3명의 학생 저장 (이름, 객체)
		map.put("아롱이", new Student1(2, "010-3333-3333"));
		map.put("해롱이", new Student1(3, "010-4444-4444"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름??");
			String name = scanner.nextLine(); //입력한 이름을 변수name 에 저장
			if(name.equals("exit"))  //exit 입력하면 종료
				System.out.println("종료");
				break; 			
			Student1 student1 = map.get(name); // 레퍼런스map으로 get() name 검색한 값을 Student타입의 변수 student 에 저장  
			if(student1 == null) 
				System.out.println(name + "은 없는 사람입니다");
			else
				System.out.println("id" + student1.getId() + ",전화:" + student1.getTel());
		}scanner.close();
	}
}
