import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Arrays; //해시맵을 프린트하기 위해 임포트 

public class p438_8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		//해시맵 생성 
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		
		System.out.println("**포인트 관리 프로그램입니다**");
		while(true) {
			System.out.println("이름과 포인트 입력>>");
			String  name = S.next(); //이름 입력
			int score = S.nextInt(); //점수 입력 
			if(name.equals("그만")){//그만 입력하면 while문 탈출 
				break;
			}
			if(scoreMap.get(name)==null) {  //기존 해시맵에 이름이 없으면
				scoreMap.put(name, score); //해시맵에 새롭게 추가 
			}
			else {// 기존 해시맵에 이름이 있으면 
				scoreMap.put(name, scoreMap.get(name)+score);//기존 점수에 입력받은 점수를 더하기 
			}
			// 해시맵 프린트 
			Set<String>findName  = scoreMap.keySet();
			Iterator<String>it = findName.iterator();
			
			while(it.hasNext()) {
				String name2 = it.next(); 
				int sum =  scoreMap.get(name2);
				System.out.print("("+name2 +","+sum+")");	
			}System.out.println(" ");
		}
	}
}