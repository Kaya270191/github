//5-8 
//�������̽� ���� 

interface PhoneInterface{ //�������̽� PhoneInterface
	final int TIMEOUT  = 10000; //��� �ʵ� ����
	void sendCall(); //�߻� �޼��� public abstract ����
	void receiveCall(); //�߻� �޼���  public abstract ���� 
	default void printLogo() { // public default �޼��� 
		System.out.println("**Phone");
	}
}

class SamsungPhone implements PhoneInterface{ //�������̽� ������ SamsungPhone Ŭ����
	public void sendCall() { //�������̽� �߻�޼��� ����- �������̵�
		System.out.println("�츮����");
	}
	public void receiveCall() {//�������̽� �߻�޼��� ����- �������̵�
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	public void flash() {//�޼ҵ� �߰� �ۼ�
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}

public class p_ch5_8 {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone(); //�Ｚ�� Ŭ������ ���۷��� ���� �� ��ü ����
		phone.printLogo();//�������̽��� printLogo()�޼��� ȣ��
		phone.sendCall();//�� Ŭ������ sendCall()�޼��� ȣ��
		phone.receiveCall();//�� Ŭ������ receive()�޼��� ȣ��
		phone.flash();//�� Ŭ������ flash()�޼��� ȣ�� 
	}
}
