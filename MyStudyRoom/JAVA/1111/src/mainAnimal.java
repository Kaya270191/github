
class Animal{ //����Ŭ���� Animal 
	//Ŭ���� �ʵ�
	void Cry(){ //Cry �Լ� 
		System.out.println("�������");
	}		
	void Crycry(Animal a) { //Crycry �Լ� - �ִϸ� ��üa �� �Ű������� ������ 
		a.Cry();	// Cry �Լ� ȣ�� 
	}
}

class Cat extends Animal{
	void Cry() { //�������̵� 
		System.out.println("�߿�");
	}	
}

class Dog extends Animal{
	void Cry() { //�������̵�
		System.out.println("�۸�");		
	}
}

class Jindo extends Dog{
	void Cry() { //�������̵� 
		System.out.println("��������");
	}
	void Run() {
		System.out.println("������");
	}
}

public class mainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(); //Animal Ŭ������ ��ü����. ���۷��� animal
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
