//2�� 

import java.util.Scanner;
public class Grade { //grade Ŭ���� 
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) { //������
		this.math= math;
		this.science= science;
		this.english= english;
	}
	
	public int average() { //average �Լ� 
		return (math+ science+ english)/3;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = S.nextInt();
		int science = S.nextInt();
		int english = S.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����"+ me.average()); 
		
		S.close();
	}

}
