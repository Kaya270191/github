//pdf 7-17
//Unit class 만들고 이 클래스를 상속받는 클래스만들기

abstract class Unit{
	int x, y; 
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void stop() {
		System.out.println("정지");
	}
}

class Marine extends Unit{
	void stimPack() {
		System.out.println("스팀팩 사용");
	}
}

class Tank extends Unit{
	void changeMode() {
		System.out.println("공격모드로 변환");
	}
}

class Dropship extends Unit{
	void load() {
		System.out.println("선택된 대상을 태운다");
	}
	void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}


public class pdf7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
