//3. 
public class Song { //Ŭ����
	String title; //�ʵ� 
	String artist;
	int year;
	String country;
	
	public Song() { //�⺻ ������
		//this.title = title;
		//this.artist = artist;
		//this.year= year;
		//this.country= country;		
		}
	
	public Song(int year, String country, String artist, String title){ //������
		this.title = title;
		this.artist = artist;
		this.year= year;
		this.country= country;		
		}
	
	public void show() { //show �޼ҵ�
		System.out.println(year+"��"+ country +"������" + artist + "�� �θ�" + title);
	}
		
	public static void main(String[] args) {
		Song mySong = new Song (1978,"������", "ABBA", "Dancing Queen");
		mySong.show();

	}

}
