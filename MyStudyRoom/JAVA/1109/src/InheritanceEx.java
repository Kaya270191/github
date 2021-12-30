//p.260 예제 5-2

class Person{  // Person :부모 클래스  
	private int weight; 		//private  접근 지정 - 같은 클래스 내 
	int age; 					//디폴트  접근지정-같은 패키지 내 
	protected int height; 		// protected 접근 지정- 같은 패키지 내 or 상속받은 서브 클래스 
	public String name; 		//public 접근 지정 - 같은 패키지, 다른 패키지 모두 가능 
	
	public void setWeight(int weight) { //private 멤버인 weight 를 접근하기 위한 get/set 메소드
		this.weight = weight;
	}
	public int getWeight() { //private 멤버인 weight 를 접근하기 위한 get/set 메소드
		return weight; 		//weight 값을 리턴 
	}
}

class Student extends Person{ // Person 부모 클래스를 상속받은  Student 클래스 
	public void set() {		// set() 함수 
		age = 30; 			// Person 클래스의 디폴트 멤버 접근 가능 
		name = "홍길동"; 		// Person 클래스의 퍼블릭 멤버 접근 가능 
		height = 175; 		// Person 클래스의 프로텍티드 멤버 접근 가능 
		setWeight(99); 		//private 멤버  weight는 setWeight()로 간접 접근 
	}
}

public class InheritanceEx { //InheritanceEx 클래스 
	public static void main(String[] args) {
		Student s = new Student(); 		//Student 클래스의 객체 s 생성 
		s.set(); 						// 객체 s에 함수 set 호출 
		s.getWeight(); 					// setWeight()함수에 저장된 99가 getWeight 함수에서 리턴됨 
		System.out.println(s.getWeight()); 
	}
}
