
class Animal{ //슈퍼클래스 Animal 
	//클래스 필드
	void Cry(){ //Cry 함수 
		System.out.println("엉엉울어");
	}		
	void Crycry(Animal a) { //Crycry 함수 - 애니멀 객체a 를 매개변수를 받으면 
		a.Cry();	// Cry 함수 호출 
	}
}

class Cat extends Animal{
	void Cry() { //오버라이딩 
		System.out.println("야옹");
	}	
}

class Dog extends Animal{
	void Cry() { //오버라이딩
		System.out.println("멍멍");		
	}
}

class Jindo extends Dog{
	void Cry() { //오버라이딩 
		System.out.println("진도진도");
	}
	void Run() {
		System.out.println("도망쳐");
	}
}

public class mainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(); //Animal 클래스의 객체생성. 레퍼런스 animal
		Cat cat = new Cat();
		Dog dog = new Dog();
		Jindo jindo = new Jindo(); 
		
		animal.Cry();
		cat.Cry();
		dog.Cry();
		jindo.Cry();
		
		animal.Crycry(animal);
		animal.Crycry(cat);
		animal.Crycry(dog);
		cat.Crycry(jindo);
		jindo.Run();		
	}
}
