//p.208
//4-8

public class p_ch5 {
	
	static void replaceSpace(char a[]) {//문자열 배열[]을 매개변수로 받는 함수 replaceSpace
		for(int i =0; i<a.length; i++) {
			if(a[i] == ' ')//배열의 요소가 빈칸이면 
				a[i]=',';  //,로 바꿈 
		}
	}
	
	static void printCharArray(char a[]) { //문자열 배열[]을 매개변수로 받는 함수 printCharArray
		for(int i=0; i<a.length; i++) {//프린트 
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		char c[] = {'t','h','i','s',' ', 'p','e','n','c','i','l','.'};
		replaceSpace(c);
		printCharArray(c);
	}
}
