//p.319
//Stack �������̽��� ��ӹ޾� �Ǽ��� �����ϴ� StringStack Ŭ������ �����϶�

import java.util.Scanner;
interface Stack{ 				//�������̽� Stack
	int length();				//���� ���ÿ� ����� ���� ���� 
	int capacity();				//������ ��ü ���� ������ ���� ����
	String pop();				//������ ��(top)�� �Ǽ� ���� 
	Boolean push(String val);	//������ ��(top)�� ����� �Ǽ� ���� 
}


public class StringStack implements Stack {			//�������̽� Stack�� ���
	Scanner S = new Scanner(System.in);
	String array[];
	
	public StringStack(int space) { //�Ű�����1���� ������  ��������� 
		
		array = new String [space]; //
		for (int i =0; i<array.length; i++) { //
		System.out.println(array);
		}
	}
	public int length() { // ����� ���� ��� 
		
		
	}
	public int capacity() { //�迭�� ���尡���� �迭 ��ü ũ�� 
		return array.length;
	}
	public String pop() { //������ ���� ������ 
		
	}
	Boolean push(String val) { //�Է��ϴ� ���ڸ� �迭�� ����
		for(int i =0; i< array.length; i++) {
			String word = S.next(val);
			array[i] = new String(word);
		}
	
	}
	

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("�� ���� ���� ������ ũ�� �Է� >>");
		int space = S.nextInt();
		StringStack stack = new StringStack(space);
		
		
		

	}

}
