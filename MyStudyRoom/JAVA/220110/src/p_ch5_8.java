//5-8 
//인터페이스 구현 

interface PhoneInterface{ //인터페이스 PhoneInterface
	final int TIMEOUT  = 10000; //상수 필드 선언
	void sendCall(); //추상 메서드 public abstract 생략
	void receiveCall(); //추상 메서드  public abstract 생략 
	default void printLogo() { // public default 메서드 
		System.out.println("**Phone");
	}
}

class SamsungPhone implements PhoneInterface{ //인터페이스 구현한 SamsungPhone 클래스
	public void sendCall() { //인터페이스 추상메서드 구현- 오버라이드
		System.out.println("띠리리링");
	}
	public void receiveCall() {//인터페이스 추상메서드 구현- 오버라이드
		System.out.println("전화가 왔습니다");
	}
	public void flash() {//메소드 추가 작성
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class p_ch5_8 {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone(); //삼성폰 클래스의 레퍼런스 선언 및 객체 생성
		phone.printLogo();//인터페이스의 printLogo()메서드 호출
		phone.sendCall();//폰 클래스의 sendCall()메서드 호출
		phone.receiveCall();//폰 클래스의 receive()메서드 호출
		phone.flash();//폰 클래스의 flash()메서드 호출 
	}
}
