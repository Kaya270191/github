//p.434
//2. Scanner 클래스를 사용하여 5개 학점('A','B','C','D','F')을 문자로 입력받아
//ArrayList 에 저장하고 ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)
//로 변환하여 평균을 출력하는 프로그램 작성 

import java.util.*;

public class p434_2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>(); //문자열만 삽입가능한 ArrayList 생성
		String grade; //입력받은 학점 
		double ave=0;
		System.out.println("5개의 학점을 빈 칸으로 분리 입력 (A/B/C/D/F)");
		
		for(int i =0 ; i<5; i++) { //입력받은 학점을 ArrayList a 에 저장 
			grade = S.next(); 
			a.add(grade); //입력받은 grade를 ArrayList에 추가하기 
		}
		System.out.println(a); //ArrayList a 출력해보기 
		
		//입력받은 grade를 score로 변환 
		double score =0; 
		for(int i =0; i<a.size(); i++) {	//반복할 때마다 a의 요소를 더하기 
			String b = a.get(i);//ArrayList a  의  i를 리턴 
			switch(b) { //
				case "A" : 
					score += 4.0; 
					break;
				case "B" : 
					score += 3.0; 
					break;
				case "C" : 
					score += 2.0; 
					break;
				case "D" : 
					score += 1.0; 
					break;
				case "F" : 
					score += 0;  
					break;
				default: System.out.println("학점을 다시 입력해주세요 ");	
			}
		System.out.println(score); //바꾼 점수를 출력 
		ave = score/a.size(); //평균 출력	
		}System.out.println("평균은" + ave);
	}
}
