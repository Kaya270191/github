//����(marine)�� Ŭ������ ������ ��. ��� �߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������?


class Marine {
	int x = 0, y =0; //��ġ ��ǥ
	int hp = 60; // ���� ü��
	int weapon = 6 ;  // ���ݷ�
	int armor = 0; //���� 
	
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
