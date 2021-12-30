//실습문제 1

public class TV { //tv클래스
	String brand;
	int year;
	int inch;
	
	public TV(String brand, int year, int inch){ //생성자 
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() { //메소드
		System.out.println(brand+"에서 만든"+ year+"년형"+inch+"TV");
	}
	

public static void main(String[] args) { //메인 
	TV myTV = new TV("LG", 2017,32);
	myTV.show();
	}

}
