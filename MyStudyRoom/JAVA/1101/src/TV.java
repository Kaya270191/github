//�ǽ����� 1

public class TV { //tvŬ����
	String brand;
	int year;
	int inch;
	
	public TV(String brand, int year, int inch){ //������ 
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() { //�޼ҵ�
		System.out.println(brand+"���� ����"+ year+"����"+inch+"TV");
	}
	

public static void main(String[] args) { //���� 
	TV myTV = new TV("LG", 2017,32);
	myTV.show();
	}

}
