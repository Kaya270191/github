//5-2
//상속 관계에 있는 클래스 간 멤버 접근 

class Person{ //Person 클래스 
	private int weight; //Person 클래스 안에서만 접근가능한 멤버 변수
	int age; //default 멤버변수 - 같은 패지키내 클래스 및 같은 패키지 서브 클래스 
	protected int height; //protected 멤버변수 - 같은 패키지내 클래스 및 다른 패키지 서브클래스 
	public String name;//public 멤버변수- 어디서나 접근 가능
	
	public void setWeight(int weight) { //몸무게 저장하는 함수 
		this.weight = weight;
	}
	public int getWeight() { //몸무게 리턴하는 함수 
		return weight;
	}
}

class Student extends Person{ //Person 클래스를 상속받은 Student클래스 
	public void set() {
		age = 30; 
		name = "홍길동";
		height = 175;
		setWeight(99); //부모클래스의 setWeight함수 호출 
	}
}

public class p_ch5_2 {

	public static void main(String[] args) {
		Student s = new Student(); //Student클래스의 레퍼런스 선언 및 객체 생성 
		s.set(); //Student클래스 레퍼런스 s로 set()함수 호출 
	}
}
