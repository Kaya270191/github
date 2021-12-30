//예제 5-6 
class Weapon{ //Weapon 클래스 
	protected int fire() { //fire 함수 
		return 1;
	}
}

class Cannon extends Weapon{ //Weapon 클래스를 상속받은 Cannon 함수 
	@Override
	protected int fire() { //fire 함수 - 오버라이딩 
		return 10; 
	}
}

public class Overriding { //Overriding 클래스 

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon(); //Weapon 클래스의 객체 weapon 생성 
		System.out.println("기본 무기의 살상 능력은" + weapon.fire()); // Weapon 클래스의 fire 함수 호출 
		
		weapon = new Cannon(); // Weapon weapon = new Cannon(); = Weapon 클래스의 레퍼런스 weapon. 이 객체는  Cannon()을 가리킴 
		System.out.println("대포의 살상 능력은" + weapon.fire()); // 오버라이딩 되어 Cannon함수의 fire 호출 
	}
}
