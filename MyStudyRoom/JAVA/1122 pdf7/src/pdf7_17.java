//pdf 7-17
//Unit class ����� �� Ŭ������ ��ӹ޴� Ŭ���������

abstract class Unit{
	int x, y; 
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void stop() {
		System.out.println("����");
	}
}

class Marine extends Unit{
	void stimPack() {
		System.out.println("������ ���");
	}
}

class Tank extends Unit{
	void changeMode() {
		System.out.println("���ݸ��� ��ȯ");
	}
}

class Dropship extends Unit{
	void load() {
		System.out.println("���õ� ����� �¿��");
	}
	void unload() {
		System.out.println("���õ� ����� ������");
	}
}


public class pdf7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
