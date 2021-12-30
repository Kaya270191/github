//p.416
//7-5 HashMap을 이용하여 (영어, 한글)단어 쌍의 저장 검색

import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		//해시맵 생성 var dic = new HashMap<String, String>(); 
		HashMap<String, String> dic = new HashMap<String, String>(); 
		
		//3개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//사용자로부터 영어 단어 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner scanner = new Scanner(System.in); 
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = scanner.next(); //영어 단어 입력 받기
			if(eng.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			String kor = dic.get(eng); //eng로 해시태그 객체 dic의 밸류값을 가져와서 kor에 저장
			if(kor == null) //검색했는데 값이 없으면 
				System.out.println(eng + "는 없는 단어입니다");
			else //값이 있으면 
				System.out.println(kor);
		}
	}
}
