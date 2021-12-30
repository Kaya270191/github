//병사(marine)를 클래스로 정의한 것. 멤머 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는?


class Marine {
	int x = 0, y =0; //위치 좌표
	int hp = 60; // 현재 체력
	int weapon = 6 ;  // 공격력
	int armor = 0; //방어력 
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x , int y ) {
		this.x = x;
		this.y = y;
	}
}


public class pdf6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
