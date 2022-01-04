import java.util.Scanner;
public class practice8 { //클래스 
	String title, author; //문자 필드멤버 title, author
	public practice8(String title, String author) { //생성자 함수 
		this.title= title;
		this.author = author;
	}
	

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("배열의 크기를 입력");
		int number = S.nextInt();
		practice8 [] book; // practice8 배열에 대한 레퍼런스 book 선언
		book = new practice8[number]; // 2개의 레퍼런스 배열생성
		
		
		for(int i =0; i<number;i++) {
			System.out.println("제목>>");
			String title = S.nextLine();
			System.out.println("저자>>");
			String author = S.nextLine();
			book[i] = new practice8(title,author); // 배열 원소 객체 생성 
		}
		
		for(int i =0 ; i<number; i++) {
			System.out.println( book[i].title + "." + book[i].author);
		}

	}

}
