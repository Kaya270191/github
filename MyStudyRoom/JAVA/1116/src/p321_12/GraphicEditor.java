package p321_12;
//p.321
//12.
import java.util.Scanner;

public class GraphicEditor{
	private String name;
	private Shape start=null, last=null; //Shape 타입으로 업캐스팅되어야 해서  
	private Scanner sc = new Scanner(System.in);
	
	public GraphicEditor(String name) { //생성자 
		this.name=name;
	}
	
	public void run() {
		System.out.println("그래픽 에디터 "+ name + "를 실행합니다.");
		int choice=0;
		
		while(choice !=4) { //choice가 4가 아니면 계속 반복 
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			choice = sc.nextInt(); //choice값을 스캐너로 받기 
			int num = 0; //변수-모양고르는 번호 
			
			switch(choice) {
			case 1: 
				//insert()
				System.out.println("Line(1), Rect(2), Circle(3)>>");
				num =sc.nextInt(); //입력받은 숫자를 변수 num에 저장 
				if(num<1 || num>3) {
					System.out.println("잘못입력"); //입력한 숫자가 1보다 작거나3보다 크면 if문 탈출해서 다시 선택할 수 있게..
					break;
				}
				insert(num);
				break;
				
			case 2:
				//delete()
				System.out.println("삭제할 도형 위치입력");
				num = sc.nextInt(); 
				if(!delete(num)) {//삭제 할 수 없었다면 
					System.out.println("삭제할 수 없음.");
				}
				break;
				
			case 3:
				//show()
				Shape t = start; //Shape타입의 레퍼런스 t를 start에게 전달
				while( t != null) { //t값이 null 이 아닐때까지 반복 
					t.draw();
					t = t.getNext();
				}
				break;
				
			case 4:
				System.out.println(name + "을 종료합니다.");
				break;
			default: //사용자가 1~4를 벗어난 수를 입력한다면
				System.out.println("1~4까지 입력가능");
			}
		}
	}
		private void insert(int num) {
			Shape obj = null; 
			switch(num) { //num 값에 따라 객체 생성
			case 1: //Line 객체
				obj = new Line();
				break;
			case 2: // Rect 객체
				obj = new Rect();
				break;
			case 3: //Circle객체
				obj = new Circle();
				break;
			}
			if(start ==null) { //처음에 start,last 값이 없음. obj를 가리킴
				start = last = obj; 
			}
			else {
				last.setNext(obj); //last 레퍼런스를 통해서 setNext함수 호출(호출 시 매개변수가 obj)
				last = obj; //last 레퍼런스가 obj를 가리킴.
			}
		}
		
		private boolean delete (int num) { //true 면 지운거. false면 안 지운 거 
			Shape cur = start; //현재
			Shape pre = start; //과거
			if(start == null) //start 값이 없으면 삭제할 것이 없어서 false
				return false;
			for(int i = 0; i < num; i++) { //start가 null 이 아닌 경우 . 
				pre = cur;
				cur = cur.getNext();
				if(cur==null) //cur가 더 이상 이동할 곳이 없으면(=null 값이면) / 지울 것이 없는 경우 
					return false;
			}
		
			if(start == last) { //삭제하는 경우 - 전체 객체가 1개일 때 
				start = last = null; // start .last 를  null로 만든다.
				return true;
			}
			if(cur == start) { //지우고 싶은 객체가 0번째일때 
				start = start.getNext();
			}
			else if(cur == last) {
				last = pre;
				last.setNext(null);
			}
			else {
				pre.setNext(cur.getNext());
			}
			return true;	
}
		
		
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
