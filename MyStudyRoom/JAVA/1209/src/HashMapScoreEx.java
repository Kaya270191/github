//p.417 7-6
//해시맵을 이용하여 자바 과목의 이름과 점수 관리
//해시맵을 이용하여 학생의 이름고 ㅏ자바 점수를 기록 관리하는 프로그램을 작성하라

import java.util.*;
public class HashMapScoreEx {
	public static void main(String[] args) {
		//이름은 String, 점수는Integer로 구성된 해시맵
		//var scoreMap = new HashMap<String, Integer>();
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		//5개의 정수 저장 
		scoreMap.put("kaya", 90);
		scoreMap.put("jay", 70);
		scoreMap.put("nana", 30);
		scoreMap.put("julia", 75);
		scoreMap.put("alvin",55); 
		
		//해시맵 요소의 개수 출력 
		System.out.println("해시맵 요소의 개수 = "+scoreMap.size());
		
		//모든 사람의 점수 출력 
		Set<String> keys = scoreMap.keySet(); //해시맵의 모든 키를 가진 keySet()을 Set<String>타입의 변수key에 담기  
		Iterator<String> it = keys.iterator(); //Set에 있는 모든 키를 순서대로 검색하는 Iterator리턴
		
		while(it.hasNext()) { //모든 점수 출력
			String name = it.next(); //다음키, 학생 이름
			int score = scoreMap.get(name); //점수 알아내기 
			System.out.println(name + ":" +score);
		}		
	}	
}
