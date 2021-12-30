//p.319
//Stack �������̽��� ��ӹ޾� �Ǽ��� �����ϴ� StringStack Ŭ������ �����϶�

import java.util.Scanner;
interface Stack{ 				//�������̽� Stack
	int length();				//���� ���ÿ� ����� ���� ���� 
	int capacity();				//������ ��ü ���� ������ ���� ����
	String pop();				//������ ��(top)�� �Ǽ� ���� 
	Boolean push(String val);	//������ ��(top)�� ����� �Ǽ� ���� 
}


class StringStack implements Stack {			//�������̽� Stack�� ���
	Scanner S = new Scanner(System.in);
	int space; //���� ������ ����
	String array[]; //�迭 
	int tos; // ������ ���� ���� �� 
	
	StringStack(int space) { //�Ű�����1���� ������  ��������� 
		array = new String [space]; 
		tos =-1; 			//�迭�� 0��° ���� �����ϴϱ� �ʱⰪ�� -1�� ��������.
	}
	
	@Override
	public int length() { // ���� ����� ���� ��� 
		return tos+1;		//+1�� ����� �迭�� 0��°�� ��. 
	}
	
	@Override
	public int capacity() { //�迭�� ���尡���� �迭 ��ü ũ�� 
		return array.length;
	}
	
	@Override
	public String pop() { //�� ���� ������ ���� ������ 
		if(tos==-1) { //���� �ϳ��� ������ �� �Ǿ� ������ null�� ����
			return null;
		}
		String s = array[tos]; //�迭�� ���� �ϳ� ������ tos���� �� ���� ����
		tos--;
		return s; //���� �ϳ��� ������ �迭�� ������ �� s �� ���� 	
	}
	
	@Override
	public Boolean push(String val) { //�Է��ϴ� ���ڸ� �迭�� ����
		if(tos==array.length-1) 	//tos�� -1���� �����ϴ� �迭�� ���� �������� ���ؼ� �迭����-1 ���ֱ�
			return false; 			//���̰� ������ �� �̻� ������ ���� ������ false �� ����
		else { 						//�Է°� �����ϱ� 
			tos++; 					// tos�� -1���� �����ϴ� 1�� ����
			array[tos] = val; 		//�迭�� tos ������ �Է��� ���� ���� 
			return true;
		}
	}
}

class StackApp {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("�� ���� ���� ������ ũ�� �Է� >>");
		int space = S.nextInt(); 					//���� ������ ũ�� 
		StringStack stack = new StringStack(space); //��ü����->������ ȣ��
		
		while(true) {
				System.out.println("���ڿ� �Է�>>");
				String word = S.next();  //�Է��� ���� String Ÿ������ �ޱ� 
				if(word.equals("�׸�")) //�׸� �̶�� �Է��ϸ� while�� Ż�� 
					break;
				
				boolean result = stack.push(word);
				if(!result) { //���� result�� false�̸� 
					System.out.println("������ �� ���� Ǫ�úҰ�");
				}
		}
		
		System.out.println("���ÿ� ����� ��� ���ڿ�>>");
		int len = stack.length();
		for(int i =0; i<len; i++) {
			System.out.print(stack.pop()+ " ");
		}
		S.close();
	}
}
				
		


