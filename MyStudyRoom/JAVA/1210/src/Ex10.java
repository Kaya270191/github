//p.387
//�׺� ������ ����� ����. �� ����� ������ �����ϰ� �̸��� Ű����� �Է¹ް� �� ����� Person Ŭ������ �ۼ�
//���α׷��� �� ���� Person ��ü ����� . �� ����� �ڱ� ���ʿ��� enterŰ �Է��ϸ� 3���� ���� �߻�
//�� ���ڰ� ��� ������ ���ڰ� �ǰ� ������ ������
//������ ������ �ʹ� ũ�� ������ 3���� ���ڰ� ��ġ�ϰ� ���� ���ɼ��� ���� ������ ������ ������ 1~3������ �Ѵ�. 
import java.util.Scanner;
class Person{
	String name;
	
	Person(String name){
		this.name = name;
		
	}
	
	int Random() { //������ �� �� ���� ����� �ִ� �Լ� 
		int num =0;
	
		for(int i =0; i<3; i++) {
			num = (int)(Math.random()*1)+3;
			
		}return num;
	}
}	
	


public class Ex10 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("ù���� ���� �̸�>>");
		Person p1 = new Person(S.next()); //��ü1
		System.out.println("�ι��� ���� �̸�>>");
		Person p2 = new Person(S.next()); //��ü2

		S.nextLine(); //����Ű�� ������
		p1.Random();
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.Random());
		
	}

}
