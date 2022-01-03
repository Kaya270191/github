//p.438 제네릭 클래스 작성 연습 
//IStack<T> 인터페이스를 구현하는 MyStack<T>클래스 작성 
//스택의 원소는 Vector<E> 이용하여 저장 
//MyStack<Integer>로 구체화한 정수 스택을 생성하고 활용하는 코드와 실행결과이다.
import java.util.Vector;

interface IStack<T>{ //인터페이스
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T>{ //인터페이스를 구현한 MyStack클래스
	Vector<T>v =null; // 벡터 초기값 지정 
	
	public MyStack() {//생성자 함수
		v= new Vector<T>();//벡터 생성
	}
	
	public T pop() {
		if(v.size() ==0) //벡터의 사이즈가 0이면 
			return null; //널 값 리턴
		else //사이즈가 0 이 아니면 
			return v.remove(0);
	}
	
	public boolean push(T ob) {		
		v.add(0,ob);  //벡터에 값 집어넣기
		return true;
	}
}

public class StackManager {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i =0; i<10; i++) 
			stack.push(i); //10개의 정수 푸시
		while(true) { //스택이 빌 때까지 pop
			Integer n = stack.pop();
			if(n==null) 
				break; //스택이 빈 경우 
			System.out.print(n +" "); //꺼낸 숫자 프린트 
		}
	}
}
