//5-4
//instanceof ������ Ȱ��

class Person{} //Person Ŭ����
class Student extends Person{} //Person Ŭ������ ��ӹ��� StudentŬ����
class Researcher extends Person{} //Person Ŭ������ ��ӹ��� Researcher Ŭ����
class Professor extends Researcher{} //Researcher, Person Ŭ������ ��ӹ��� Professor Ŭ���� 

public class p_ch5_4 {
	static void print(Person p) {
		if(p instanceof Person) //p�� Person Ÿ���̸� 
			System.out.print("Person");
		if(p instanceof Student) //p�� StudentŸ���̸�
			System.out.print("Student");
		if(p instanceof Researcher) //p�� Researcher Ÿ���̸�
			System.out.print("Researcher");
		if(p instanceof Professor) //p�� Professor Ÿ���̸� 
			System.out.print("Professor");
	}
	
	public static void main(String[] args) {//��ĳ���� 
		System.out.print("new Student() ->\t"); print(new Student()); //Person p = new Student()
		System.out.print("new Student() ->\t"); print(new Researcher());//Person p = new Researcher()
		System.out.print("new Professor() ->\t"); print(new Professor());//Person p = new Professor()
	}
}
