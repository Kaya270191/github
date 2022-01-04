

public class practice_220104 {
	//리턴할 값이 반드시 String 
	public static String numbering(int a, int b) { //numbering()
		int i =a;
		String output="";
		while(i<b) {
			output +=i;
			i++;
		}
		return output; // 메소드의 출력값을 반환 
	}
	
	public static void main(String[] args) {
		String result = numbering(1,5); //numbering()이 리턴한 값이 변수result에 담긴다
		System.out.println(result);// result 프린트 
	}
}
