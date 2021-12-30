//p.314
//1. TV�� ��ӹ��� ColorTVŬ������ �ۼ��϶�.

class TV{ //TVŬ���� 
	private int size; //��� ���� 
	
	public TV(int size) { //������() �Լ�
		this.size = size;
	}
	protected int getSize() { //getSize()�Լ�
		return size;
	}
}


class ColorTV extends TV { //ColorTV Ŭ����
	
	private int color; //��� ���� 

	public ColorTV(int size, int color) { //�Ű����� 2���� ������ �Լ�
		super(size);
		this.color = color;
	}
	
	public void printProperty() { //printProperty �Լ�
		System.out.println(getSize() + "��ġ " + color + "�÷� ");
	}	
}

public class MyTv {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024); //ColorTV Ŭ������ ���۷��� myTV ����. �Ű������� ������ ȣ���ؼ� ��� 
		myTV.printProperty();
	}
}
