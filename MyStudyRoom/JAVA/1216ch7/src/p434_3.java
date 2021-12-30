//p.435
//3. 그만 이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램\
//HashMap<String, Integer> nations = new HashMap<String, Integer>();

import java.util.*;
import java.util.Arrays.*; //해시맵 배열을 출력하기 위해 임포트 

public class p434_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Hashmap<문자, 정수>를 저장함. 레퍼런스는 nation 
		HashMap<String, Integer> nation = new HashMap<String, Integer>();
		String name;//나라이름
		int pop; //인구
				
		while(true) {// 해시맵 안에 정보 입력 저장 
			System.out.println("나라이름과 인구를 입력하세요(예: Korea 5000)"); 
			name = scan.next(); 
			if(name.equals("그만")) { //그만 입력하면 입력받기 종료 
				System.out.println("입력 종료");
				System.out.println(nation); //해시맵 프린트 
				break;
			}			
			pop = scan.nextInt(); 
			nation.put(name, pop); //해시맵에 입력받은 name과 pop 넣기 
			System.out.println(nation);
		}
		
		//해시맵 찾기 
		while(true) {
			System.out.println("인구 검색>>");
			String search_country = scan.next(); //입력받는 나라 
			if(search_country.equals("그만")) { //그만 입력하면 종료 
				System.out.println("프로그램 종료 ");
				break;
			}
			//해시맵에서 입력한 나라 검색해서 인구수 출력
			int search_pop = nation.get(search_country); // 해시맵 nation에서 입력받은 나라를 가져와서 인구수 반환 
			if(search_pop == 0) // 없는 나라 이면 0 값이 반환 
				System.out.println( search_country+"는 없습니다");
			else
				System.out.println(search_country + "의 인구는"+ search_pop);
		}scan.close();
	}	
}
