//���� 5-6 
class Weapon{ //Weapon Ŭ���� 
	protected int fire() { //fire �Լ� 
		return 1;
	}
}

class Cannon extends Weapon{ //Weapon Ŭ������ ��ӹ��� Cannon �Լ� 
	@Override
	protected int fire() { //fire �Լ� - �������̵� 
		return 10; 
	}
}

public class Overriding { //Overriding Ŭ���� 

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon(); //Weapon Ŭ������ ��ü weapon ���� 
		System.out.println("�⺻ ������ ��� �ɷ���" + weapon.fire()); // Weapon Ŭ������ fire �Լ� ȣ�� 
		
		weapon = new Cannon(); // Weapon weapon = new Cannon(); = Weapon Ŭ������ ���۷��� weapon. �� ��ü��  Cannon()�� ����Ŵ 
		System.out.println("������ ��� �ɷ���" + weapon.fire()); // �������̵� �Ǿ� Cannon�Լ��� fire ȣ�� 
	}
}
