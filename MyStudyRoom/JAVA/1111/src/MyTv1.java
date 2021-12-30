//p.315
//2. ColorTV를 상속받는 IPTV 클래스 작성 

class TV1{ 							//TV클래스 
	private int size;				 //멤버 변수 	
	public TV1(int size) { 			//생성자() 함수
		this.size = size;
	}
	protected int getSize() { 		//getSize()함수
		return size;
	}
}

class ColorTV1 extends TV1 { 		//ColorTV 클래스
	private int color; 				//멤버 변수 
	public ColorTV1(int size, int color) { //매개변수 2개인 생성자 함수
		super(size); 				//부모클래스의 size로 ~
		this.color = color;
	}	
	public void printProperty() { 	//printProperty 함수
		System.out.println(getSize() + "인치 " + color + "컬러 ");
	}	
}

class IPTV extends ColorTV1 { 		//IPTV 클래스 
	String address; 				//멤버 변수
	public IPTV(String address, int size, int color) { //매개변수 3개인 생성자 함수
		super(size, color); 		// ColorTV1 의 생성자 함수로~
		this.address = address;
	}
	public void printProperty() { 	//printProperty 함수
		System.out.print("나의 IPTV는 " + address + "주소의");
		super.printProperty(); 		//ColorTV1 의 함수 호출
	}
}

public class MyTv1 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
	}
}