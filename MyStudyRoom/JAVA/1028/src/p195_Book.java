//this ()로 이용해 수정하기


public class p195_Book {
	String title; //필드
	String author; //필드 
	
	void show() {System.out.println(title+" "+ author); }
	
	public p195_Book() { //생성자 1
		this("","");
		System.out.println("생성자 호출됨"); 
		
	}
	
	public p195_Book(String title) { //생성자2
		this(title,"작자미상"); //this 는 객체 자신에 대한 레퍼런스 
	}
	
	public p195_Book(String title, String author) { //생성자3
		this.title =title;
		this.author =author;
	}

	public static void main(String[] args) {
		p195_Book littlePrince = new p195_Book("어린왕자", "생텍쥐페리"); //생성자3호출
		p195_Book loveStory = new p195_Book("춘향전"); //생성자2호출-생성자3으로 이동 
		p195_Book emptyp195_Book = new p195_Book(); //생성자1호출-생성자3으로 이동 
		loveStory.show();
		

	}

}