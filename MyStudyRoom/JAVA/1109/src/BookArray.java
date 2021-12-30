//p.203 4-7
//Book 클래스를 활용하여 2개 짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하라.

import java.util.Scanner;

class Book{				//Book 클래스
	String title;		//클래스 멤버 변수 
	String author;
	
	public Book(String title, String author) {		//매개변수가 두 개인 생성자 
		this.title = title;
		this.author = author;
	}
}

public class BookArray {			//BookArray 클래스 
	public static void main(String[] args) {
		Book book [] = new Book [2]; 	//Book 클래스의 크기가 2인  book 객체 생성 
		
		Scanner S = new Scanner(System.in);
		for(int i = 0; i < book.length ;i++ ) {
			System.out.print("제목>>");
			String title = S.nextLine();
			System.out.print("저자>>");
			String author = S.nextLine();
			book[i] = new Book (title, author);		//title과 author 매개변수 두개를 받아서 Book 클래스에서 생성자에 가서 이 내용을 다시 book[i]에 저장 
		}
		for(int i =0 ; i < book.length; i++) 		//출력
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		S.close();
	}
}
