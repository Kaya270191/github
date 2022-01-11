//5-9
//인터페이스를 구현하고 동시에 슈퍼 클래스를 상속받는 사례

interface PhoneInterface1{ //PhoneInterface 인터페이스 
	final int TIMEOUT  = 10000; //상수 필드 선언
	void sendCall(); //추상 메서드 public abstract 생략
	void receiveCall(); //추상 메서드  public abstract 생략 
	default void printLogo() { // public default 메서드 
		System.out.println("**Phone");
	}
}

interface MobilePhoneInterface extends PhoneInterface1{ //폰인터페이스를 상속받은 모바일폰인터페이스 
	void sendSMS();//추상메서드 public abstract 생략
	void receiveSMS();//추상메서드 public abstract 생략
}

interface MP3Interface{ //mp3인터페이스 
	public void play(); //추상메서드 public abstract 생략
	public void stop(); //추상메서드 public abstract 생략
}
class PDA{ //클래스 
	public  int calculate(int x, int y) { //인트타입 매개변수 두개 받아서 리턴하는 함수 
		return x+y;
	}
}
//pda클래스를 상속받고 모바일폰인터페이스, 엠피스리인터페이스를 구현(추상메서드)하는 스마트폰클래스
class SmartPhone1 extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() { //interface PhoneInterface1 - 오버라이드
		System.out.println("따르릉따르릉");
	}
	public void receiveCall() { //interface PhoneInterface1 - 오버라이드
		System.out.println("전화왔어요");
	}
	public void sendSMS() { //interface MobilePhoneInterface - 오버라이드
		System.out.println("문자갑니다");
	}
	public void receiveSMS() {//interface MobilePhoneInterface - 오버라이드
		System.out.println("문자왔어요");
	}
	public void play() {//interface MP3Interface - 오버라이드
		System.out.println("음악연주합니다");
	}
	public void stop() {//interface MP3Interface - 오버라이드
		System.out.println("음악중단합니다");
	}
	public void schedule() { //추가로 작성한 메소드 
		System.out.println("일정 관리합니다.");
	}
}

public class p_ch5_9 {

	public static void main(String[] args) {
		SmartPhone1 phone = new SmartPhone1();//스마트폰 클래스의 레퍼런스 선언 및 객체 생성
		phone.printLogo();//interface PhoneInterface1의 함수 호출
		phone.sendCall();// 오버라이딩
		phone.play();//오버라이딩
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));//class PDA 메서드 호출
		phone.schedule();// class SmartPhone1의 메서드 호출 
	}
}
