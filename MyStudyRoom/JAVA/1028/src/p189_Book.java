//제목과 제저를 나타내는 title과 author 필드를 가진 book 클래스 작성, 생성자 작성 

public class p189_Book {
	String title; //필드
	String author; //필드 
	
	
	public p189_Book(String t) { //생성자 1
		title= t;
		author = "작자 미상";
	}
	
	public p189_Book(String t, String a) { //생성자2
		title=t;
		author=a;
	}

	public static void main(String[] args) {
		p189_Book littlePrince = new p189_Book("어린왕자", "생텍쥐페리"); //생성자2호출
		p189_Book loveStory = new p189_Book("춘향전"); //생성자1호출
		
		System.out.println(littlePrince.title +  " " + littlePrince.author);
		System.out.println(loveStory.title+" " + loveStory.author);

	}

}
