//6-5 Wrapper 클래스 활용 

package EX;

public class ex_5 {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); //a
		
		char c1='4', c2='F';
		if(Character.isDigit(c1)) //문자 c1이 숫자면 true
			System.out.println(c1+"은 숫자");
		if(Character.isAlphabetic(c2)) //문자c2가 문자면 true
			System.out.println(c2+"는 영문자");
		
		System.out.println(Integer.parseInt("-222")); //문자열-222을 10진수로 리턴
		System.out.println(Integer.toHexString(28)); //정수28을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));//정수28을 16진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); //28에 대한 2진수의 1의 개수 
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());//문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); //문자열"3.14"를 실수3.14로 변환
		
		boolean b = (4>3); //b는 true
		System.out.println(Boolean.toString(b)); //true를 문자열"true"로 변환
		System.out.println(Boolean.parseBoolean("false")); //문자열을 "false"로 변환

	}

}
