
public class practice6 { //클래스
	String title; //문자 멤버필드 title
	String author; //문자 멤버필드 author
	
	void show() {
		System.out.println(title + " " + author);
	}
	public practice6() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public practice6(String title) { //매개변수 문자 한개를 받는 생성자 
		this(title,"작자미상"); // this는 객체이며 practice6(String title,String author ) 호출 
	
	}
	public practice6(String title, String author) {//매개변수 문자 두개를 받는 생성자 
		this.title = title;// this. <-자기자신 
		this.author = author;
	}
	

	public static void main(String[] args) {
		practice6 littlePrince= new practice6("어린왕자", "생텍쥐베리");
		practice6 loveStory = new  practice6("춘향전");
		practice6 emptyBook = new practice6();
		loveStory.show();
	}
}
