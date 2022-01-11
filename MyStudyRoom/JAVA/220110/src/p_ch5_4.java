//5-4
//instanceof 연산자 활용

class Person{} //Person 클래스
class Student extends Person{} //Person 클래스를 상속받은 Student클래스
class Researcher extends Person{} //Person 클래스를 상속받은 Researcher 클래스
class Professor extends Researcher{} //Researcher, Person 클래스를 상속받은 Professor 클래스 

public class p_ch5_4 {
	static void print(Person p) {
		if(p instanceof Person) //p가 Person 타입이면 
			System.out.print("Person");
		if(p instanceof Student) //p가 Student타입이면
			System.out.print("Student");
		if(p instanceof Researcher) //p가 Researcher 타입이면
			System.out.print("Researcher");
		if(p instanceof Professor) //p가 Professor 타입이면 
			System.out.print("Professor");
	}
	
	public static void main(String[] args) {//업캐스팅 
		System.out.print("new Student() ->\t"); print(new Student()); //Person p = new Student()
		System.out.print("new Student() ->\t"); print(new Researcher());//Person p = new Researcher()
		System.out.print("new Professor() ->\t"); print(new Professor());//Person p = new Professor()
	}
}
