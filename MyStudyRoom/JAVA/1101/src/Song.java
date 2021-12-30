//3. 
public class Song { //클래스
	String title; //필드 
	String artist;
	int year;
	String country;
	
	public Song() { //기본 생성자
		//this.title = title;
		//this.artist = artist;
		//this.year= year;
		//this.country= country;		
		}
	
	public Song(int year, String country, String artist, String title){ //생성자
		this.title = title;
		this.artist = artist;
		this.year= year;
		this.country= country;		
		}
	
	public void show() { //show 메소드
		System.out.println(year+"년"+ country +"국적의" + artist + "가 부른" + title);
	}
		
	public static void main(String[] args) {
		Song mySong = new Song (1978,"스웨덴", "ABBA", "Dancing Queen");
		mySong.show();

	}

}
