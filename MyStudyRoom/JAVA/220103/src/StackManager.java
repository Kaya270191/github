//p.438 ���׸� Ŭ���� �ۼ� ���� 
//IStack<T> �������̽��� �����ϴ� MyStack<T>Ŭ���� �ۼ� 
//������ ���Ҵ� Vector<E> �̿��Ͽ� ���� 
//MyStack<Integer>�� ��üȭ�� ���� ������ �����ϰ� Ȱ���ϴ� �ڵ�� �������̴�.
import java.util.Vector;

interface IStack<T>{ //�������̽�
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T>{ //�������̽��� ������ MyStackŬ����
	Vector<T>v =null; // ���� �ʱⰪ ���� 
	
	public MyStack() {//������ �Լ�
		v= new Vector<T>();//���� ����
	}
	
	public T pop() {
		if(v.size() ==0) //������ ����� 0�̸� 
			return null; //�� �� ����
		else //����� 0 �� �ƴϸ� 
			return v.remove(0);
	}
	
	public boolean push(T ob) {		
		v.add(0,ob);  //���Ϳ� �� ����ֱ�
		return true;
	}
}

public class StackManager {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i =0; i<10; i++) 
			stack.push(i); //10���� ���� Ǫ��
		while(true) { //������ �� ������ pop
			Integer n = stack.pop();
			if(n==null) 
				break; //������ �� ��� 
			System.out.print(n +" "); //���� ���� ����Ʈ 
		}
	}
}
