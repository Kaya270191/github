//p.427 예제 7-10. 
//예제7-9의 GStack을 이용하여 매개변수로 주어진 스택의 내용을 반대로 만드는 제네릭 메소드reverse()작성

public class GenericMethodEx {
	//T가 매개변수인 제네릭 메소드 
	public static <T> GStack<T> reverse(GStack<T> a){
		
		GStack<T> s = new GStack<T>(); //스택 a를 반대로 저장할 목적 GStack 생성 
		while(true) {
			T tmp;
			tmp = a.pop(); //원래 스택에서 요소 하나를 꺼냄 
			if(tmp == null) //스택이 비었음
				break; //거꾸로 만드는 작업 종료
			else
				s.push(tmp);	//새 스택에 요소 삽입
		}return s; //새 스택 리턴
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>(); //Double 타입의 GStack 생성
		
		for(int i =0; i<5; i++) { //5개 요소를 스택에 push
			gs.push(new Double(i));
		}
		
		gs = reverse(gs);
		for(int i =0; i<5; i++) {
			System.out.println(gs.pop());
		}		
	}
}
