//p.203 4-7
//Book Ŭ������ Ȱ���Ͽ� 2�� ¥�� Book ��ü �迭�� �����, ����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭�� �ϼ��϶�.

import java.util.Scanner;

class Book{				//Book Ŭ����
	String title;		//Ŭ���� ��� ���� 
	String author;
	
	public Book(String title, String author) {		//�Ű������� �� ���� ������ 
		this.title = title;
		this.author = author;
	}
}

public class BookArray {			//BookArray Ŭ���� 
	public static void main(String[] args) {
		Book book [] = new Book [2]; 	//Book Ŭ������ ũ�Ⱑ 2��  book ��ü ���� 
		
		Scanner S = new Scanner(System.in);
		for(int i = 0; i < book.length ;i++ ) {
			System.out.print("����>>");
			String title = S.nextLine();
			System.out.print("����>>");
			String author = S.nextLine();
			book[i] = new Book (title, author);		//title�� author �Ű����� �ΰ��� �޾Ƽ� Book Ŭ�������� �����ڿ� ���� �� ������ �ٽ� book[i]�� ���� 
		}
		for(int i =0 ; i < book.length; i++) 		//���
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		S.close();
	}
}
