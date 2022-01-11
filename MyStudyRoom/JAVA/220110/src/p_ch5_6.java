//5-6 
//메소드 오버라이딩

 class Weapon{ //Weapon 클래스 - 슈퍼 클래스
	 protected int fire() {//정수형 리턴값을 가지는 fire()메소드
		 return 1;
	 }
 }

class Cannon extends Weapon{ //Weapon 클래스를 상속받은 Cannon 클래스
	protected int fire() {//정수형 리턴값을 가지는 fire()메소드
		return 10;
	}
}
 

public class p_ch5_6 {

	public static void main(String[] args) {
		Weapon weapon; //Weapon 클래스의 레퍼런스 weapon 선언
		weapon = new Weapon();//Weapon 클래스의 객체 생성 
		System.out.println("기본 무기의 살상 능력은" + weapon.fire()); //Weapon 클래스의 fire()함수 호출 
		
		weapon = new Cannon(); //업캐스팅 Weapon weapon = new Cannon()
		System.out.println("대포의 살상 능력은" + weapon.fire()); //Cannon클래스의 fire()함수 호출 - 메소드 오버라이딩(동적바인딩)

	}
}
