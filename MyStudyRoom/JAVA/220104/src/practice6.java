
public class practice6 { //Ŭ����
	String title; //���� ����ʵ� title
	String author; //���� ����ʵ� author
	
	void show() {
		System.out.println(title + " " + author);
	}
	public practice6() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public practice6(String title) { //�Ű����� ���� �Ѱ��� �޴� ������ 
		this(title,"���ڹ̻�"); // this�� ��ü�̸� practice6(String title,String author ) ȣ�� 
	
	}
	public practice6(String title, String author) {//�Ű����� ���� �ΰ��� �޴� ������ 
		this.title = title;// this. <-�ڱ��ڽ� 
		this.author = author;
	}
	

	public static void main(String[] args) {
		practice6 littlePrince= new practice6("�����", "�����㺣��");
		practice6 loveStory = new  practice6("������");
		practice6 emptyBook = new practice6();
		loveStory.show();
	}
}
