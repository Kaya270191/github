//5-6 
//�޼ҵ� �������̵�

 class Weapon{ //Weapon Ŭ���� - ���� Ŭ����
	 protected int fire() {//������ ���ϰ��� ������ fire()�޼ҵ�
		 return 1;
	 }
 }

class Cannon extends Weapon{ //Weapon Ŭ������ ��ӹ��� Cannon Ŭ����
	protected int fire() {//������ ���ϰ��� ������ fire()�޼ҵ�
		return 10;
	}
}
 

public class p_ch5_6 {

	public static void main(String[] args) {
		Weapon weapon; //Weapon Ŭ������ ���۷��� weapon ����
		weapon = new Weapon();//Weapon Ŭ������ ��ü ���� 
		System.out.println("�⺻ ������ ��� �ɷ���" + weapon.fire()); //Weapon Ŭ������ fire()�Լ� ȣ�� 
		
		weapon = new Cannon(); //��ĳ���� Weapon weapon = new Cannon()
		System.out.println("������ ��� �ɷ���" + weapon.fire()); //CannonŬ������ fire()�Լ� ȣ�� - �޼ҵ� �������̵�(�������ε�)

	}
}
