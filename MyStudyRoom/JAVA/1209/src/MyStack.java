//p.424 ����7-9 ���׸� ���� �����
//���� �ڷ� ������ ���׸� Ŭ������ �����ϰ�  String�� Integer ������ ���� ����ϴ� ��

class GStack<T>{ //���׸� ���� ����, ���׸� Ÿ�� T
	int tos;
	Object [] stck; //���ÿ� ��Ҹ� ������ ���� �迭 
	public GStack() {
		tos =0;
		stck = new Object[10]; //Object�迭 10ĭ¥���� �����Ͽ� ���� Ÿ���� ��ü�� ��ҷ� ���� 
	}
	public void push(T item) {
		if(tos ==10) //������ �� ���� �� �̻� ��� ������ �� ����
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() { //�ٿ� ĳ���� 
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos]; //Ÿ�� �Ű����� Ÿ������ ĳ���� 
	}	
}

public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); //StringŸ���� GStack ����

		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0; n<3; n++)
			System.out.println(stringStack.pop()); //stringStack ���ÿ� �ִ� 3���� ���ڿ� ��
		
		GStack<Integer> intStack = new GStack<Integer>(); //Integer Ÿ���� GStack ����
		
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n =0; n<3; n++)
			System.out.println(intStack.pop()); //intStack ���ÿ� �ִ� 3���� ���� ��
	}
}
