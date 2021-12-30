//p.315
//2. ColorTV�� ��ӹ޴� IPTV Ŭ���� �ۼ� 

class TV1{ 							//TVŬ���� 
	private int size;				 //��� ���� 	
	public TV1(int size) { 			//������() �Լ�
		this.size = size;
	}
	protected int getSize() { 		//getSize()�Լ�
		return size;
	}
}

class ColorTV1 extends TV1 { 		//ColorTV Ŭ����
	private int color; 				//��� ���� 
	public ColorTV1(int size, int color) { //�Ű����� 2���� ������ �Լ�
		super(size); 				//�θ�Ŭ������ size�� ~
		this.color = color;
	}	
	public void printProperty() { 	//printProperty �Լ�
		System.out.println(getSize() + "��ġ " + color + "�÷� ");
	}	
}

class IPTV extends ColorTV1 { 		//IPTV Ŭ���� 
	String address; 				//��� ����
	public IPTV(String address, int size, int color) { //�Ű����� 3���� ������ �Լ�
		super(size, color); 		// ColorTV1 �� ������ �Լ���~
		this.address = address;
	}
	public void printProperty() { 	//printProperty �Լ�
		System.out.print("���� IPTV�� " + address + "�ּ���");
		super.printProperty(); 		//ColorTV1 �� �Լ� ȣ��
	}
}

public class MyTv1 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
	}
}