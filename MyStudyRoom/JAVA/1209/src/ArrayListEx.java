//p.409 ���� 7-3 ���ڿ� �Է¹޾� ArrayList�� ����
//�̸��� 4�� �Է¹޾� ArrayList�� �����ϰ� ��� ����� �� ���� �� �̸� ���

import java.util.*;


public class ArrayListEx {
	public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>(); //���ڿ��� ���԰����� ArrayList ����

	//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ���� 
	Scanner scanner = new Scanner(System.in); //Scanner ��ü ����
	for(int i = 0; i<4; i++) {
		System.out.println("�̸��� �Է��ϼ���");
		String s = scanner.next(); //�Է� ���� ���� s�� �����ϰ�
		a.add(s); //ArrayList �÷��ǿ� ���� 
	}
	//ArrayList�� �ִ� ��� �̸� ��� 
	for(int i =0; i<a.size(); i++) { //ArrayList a�� ũ�⸸ŭ �ݺ�
		String name = a.get(i); //���Ҹ� get()�Լ��� �� name�� �ֱ� 
		System.out.print(name + " ");
	}
	
	//���� �� �̸� ���
	int longestIndex = 0;
	for(int i =1; i<a.size(); i++) { //ArrayList a �� ũ�⸸ŭ �ݺ� 
		if(a.get(longestIndex).length() < a.get(i).length()) //�̸� ���� ��
			longestIndex = i ; 	
	}
	System.out.println("���� �� �̸���" + a.get(longestIndex));	
	}
}
