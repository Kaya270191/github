//4-6
//반지름이  0-4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라 

class Circle{ 						//Circle 클래스 
	int radius;						 //클래스의 멤버 변수 
	
	public Circle(int radius) {		//매개변수가 하나인 생성자 
		this.radius = radius; 
	}
	public double getArea() {		//getArea() 함수 - 면적을 구함 
		return 3.14*radius*radius;
	}
}

public class CircleArray {			//CircleArray 클래스 
	public static void main(String[] args) {
		Circle c []; 				//Circle 클래스의 레퍼런스 함수 c 선언  
		c = new Circle [5];			//레퍼런스 c 배열의 크기는 5 
		
		for(int i =0; i < c.length; i++)	//배열의 개수만큼
			c[i] = new Circle(i);			//c[i] 생성하고 Circle 클래스 생성자에서 radius를 만든 값을  c[i]에 저장 
		
		for(int i =0; i<c.length; i++)		//배열의 개수만큼 
			System.out.println((int)c[i].getArea()); //getArea()함수 호출해서 면적 구하기 
	}
}
