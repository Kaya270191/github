import java.util.Scanner;
public class practice8 { //Ŭ���� 
	String title, author; //���� �ʵ��� title, author
	public practice8(String title, String author) { //������ �Լ� 
		this.title= title;
		this.author = author;
	}
	

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է�");
		int number = S.nextInt();
		practice8 [] book; // practice8 �迭�� ���� ���۷��� book ����
		book = new practice8[number]; // 2���� ���۷��� �迭����
		
		
		for(int i =0; i<number;i++) {
			System.out.println("����>>");
			String title = S.nextLine();
			System.out.println("����>>");
			String author = S.nextLine();
			book[i] = new practice8(title,author); // �迭 ���� ��ü ���� 
		}
		
		for(int i =0 ; i<number; i++) {
			System.out.println( book[i].title + "." + book[i].author);
		}

	}

}
