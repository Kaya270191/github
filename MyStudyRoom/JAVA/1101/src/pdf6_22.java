//정의된 메서드를 작성하고 테스트하기 

public class pdf6_22 {
	
	public static boolean isNumber (String str) {
		if(str == null || str.equals(""))  //문자열이 null 이거나 빈문자열이면 
			return false; //false

		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); 
				
			if (c < '0' || c >'9') 
					return false;
				}
			return true;
			}

	
public static void main(String[] args) { //메인 메소드
		String str = "123";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));
	}
}
