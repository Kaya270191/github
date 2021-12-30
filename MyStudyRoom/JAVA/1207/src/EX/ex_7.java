//6-7 String 클래스 메소드 활용

package EX;

public class ex_7 {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+"의 길이는"+a.length()); //문자열의 길이(문자 개수-빈칸포함)
		System.out.println(a.contains("#"));//a가 #포함하고 있는지? ->true
		
		a =a.concat(b); //a와 b를 연결해서 매개변수 a에 저장 
		System.out.println(a);
		
		a =a.trim();//a 앞,뒤 공백 제거 
		System.out.println(a);
		
		a =a.replace("C#", "Java");//a의 내용이C#,C++ ->  Java,C++ 로 바뀜
		System.out.println(a);
		
		String s[] = a.split(",");// , 로 문자열 분리 
		for(int i =0; i<s.length; i++)
			System.out.println("분리된 문자열"+i + ":" +s[i]);
		
		a= a.substring(5); //5 인덱스부터 시작하는 서브 스트링 리턴
		System.out.println(a);
		
		char c  = a.charAt(2); //인덱스2의 문자 리턴
		System.out.println(c);
	}
}
