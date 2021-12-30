//p.387
//겜블링 게임을 만들어 보자. 두 사람이 게임을 진행하고 이름은 키보드로 입력받고 각 사람은 Person 클래스로 작성
//프로그램에 두 개의 Person 객체 만들기 . 각 사람이 자기 차례에서 enter키 입력하면 3개의 난수 발생
//이 숫자가 모두 같으면 승자가 되고 게임이 끝난다
//난수의 범위를 너무 크게 잡으면 3개의 숫자가 일치하게 나올 가능성이 적기 때문에 숫자의 범위는 1~3까지로 한다. 
import java.util.Scanner;
class Person{
	String name;
	
	Person(String name){
		this.name = name;
		
	}
	
	int Random() { //랜덤한 값 세 개를 만들어 주는 함수 
		int num =0;
	
		for(int i =0; i<3; i++) {
			num = (int)(Math.random()*1)+3;
			
		}return num;
	}
}	
	


public class Ex10 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("첫번쨰 선수 이름>>");
		Person p1 = new Person(S.next()); //객체1
		System.out.println("두번쨰 선수 이름>>");
		Person p2 = new Person(S.next()); //객체2

		S.nextLine(); //엔터키를 누르면
		p1.Random();
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.Random());
		
	}

}
