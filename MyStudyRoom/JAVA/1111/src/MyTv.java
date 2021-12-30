//p.314
//1. TV를 상속받은 ColorTV클래스를 작성하라.

class TV{ //TV클래스 
	private int size; //멤버 변수 
	
	public TV(int size) { //생성자() 함수
		this.size = size;
	}
	protected int getSize() { //getSize()함수
		return size;
	}
}


class ColorTV extends TV { //ColorTV 클래스
	
	private int color; //멤버 변수 

	public ColorTV(int size, int color) { //매개변수 2개인 생성자 함수
		super(size);
		this.color = color;
	}
	
	public void printProperty() { //printProperty 함수
		System.out.println(getSize() + "인치 " + color + "컬러 ");
	}	
}

public class MyTv {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024); //ColorTV 클래스의 레퍼런스 myTV 생성. 매개변수를 생성자 호출해서 담기 
		myTV.printProperty();
	}
}
