//5-9
//�������̽��� �����ϰ� ���ÿ� ���� Ŭ������ ��ӹ޴� ���

interface PhoneInterface1{ //PhoneInterface �������̽� 
	final int TIMEOUT  = 10000; //��� �ʵ� ����
	void sendCall(); //�߻� �޼��� public abstract ����
	void receiveCall(); //�߻� �޼���  public abstract ���� 
	default void printLogo() { // public default �޼��� 
		System.out.println("**Phone");
	}
}

interface MobilePhoneInterface extends PhoneInterface1{ //���������̽��� ��ӹ��� ��������������̽� 
	void sendSMS();//�߻�޼��� public abstract ����
	void receiveSMS();//�߻�޼��� public abstract ����
}

interface MP3Interface{ //mp3�������̽� 
	public void play(); //�߻�޼��� public abstract ����
	public void stop(); //�߻�޼��� public abstract ����
}
class PDA{ //Ŭ���� 
	public  int calculate(int x, int y) { //��ƮŸ�� �Ű����� �ΰ� �޾Ƽ� �����ϴ� �Լ� 
		return x+y;
	}
}
//pdaŬ������ ��ӹް� ��������������̽�, ���ǽ����������̽��� ����(�߻�޼���)�ϴ� ����Ʈ��Ŭ����
class SmartPhone1 extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() { //interface PhoneInterface1 - �������̵�
		System.out.println("������������");
	}
	public void receiveCall() { //interface PhoneInterface1 - �������̵�
		System.out.println("��ȭ�Ծ��");
	}
	public void sendSMS() { //interface MobilePhoneInterface - �������̵�
		System.out.println("���ڰ��ϴ�");
	}
	public void receiveSMS() {//interface MobilePhoneInterface - �������̵�
		System.out.println("���ڿԾ��");
	}
	public void play() {//interface MP3Interface - �������̵�
		System.out.println("���ǿ����մϴ�");
	}
	public void stop() {//interface MP3Interface - �������̵�
		System.out.println("�����ߴ��մϴ�");
	}
	public void schedule() { //�߰��� �ۼ��� �޼ҵ� 
		System.out.println("���� �����մϴ�.");
	}
}

public class p_ch5_9 {

	public static void main(String[] args) {
		SmartPhone1 phone = new SmartPhone1();//����Ʈ�� Ŭ������ ���۷��� ���� �� ��ü ����
		phone.printLogo();//interface PhoneInterface1�� �Լ� ȣ��
		phone.sendCall();// �������̵�
		phone.play();//�������̵�
		System.out.println("3�� 5�� ���ϸ�" + phone.calculate(3, 5));//class PDA �޼��� ȣ��
		phone.schedule();// class SmartPhone1�� �޼��� ȣ�� 
	}
}
