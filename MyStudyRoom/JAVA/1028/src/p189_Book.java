//����� ������ ��Ÿ���� title�� author �ʵ带 ���� book Ŭ���� �ۼ�, ������ �ۼ� 

public class p189_Book {
	String title; //�ʵ�
	String author; //�ʵ� 
	
	
	public p189_Book(String t) { //������ 1
		title= t;
		author = "���� �̻�";
	}
	
	public p189_Book(String t, String a) { //������2
		title=t;
		author=a;
	}

	public static void main(String[] args) {
		p189_Book littlePrince = new p189_Book("�����", "�������丮"); //������2ȣ��
		p189_Book loveStory = new p189_Book("������"); //������1ȣ��
		
		System.out.println(littlePrince.title +  " " + littlePrince.author);
		System.out.println(loveStory.title+" " + loveStory.author);

	}

}
