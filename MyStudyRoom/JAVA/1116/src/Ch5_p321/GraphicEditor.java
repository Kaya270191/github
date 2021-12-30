  package Ch5_p321;

import java.util.Scanner;

import p321_12.Shape;
public class GraphicEditor {
	private String name;
	private Shape start=null, last=null; 
	int num;
	
	GraphicEditor(String name){ //생성자 함수 
		this.name = name;
	}
	
	private void run(){ //run함수 
		Scanner S = new Scanner(System.in);
		
		System.out.println("그래픽 에디터" + name + "를 실행합니다.");

		
		int choice;
		while(choice > 0 && choice < 5) { //초이스가 1~4사이가 아닌경우가 아니면 while 문 반복하기. 
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			choice = S.nextInt(); //실행 할 번호 선택 
			
			int num =0;
			switch(choice) {
			case 1: //insert
				System.out.println("Line(1), Rect(2), Circle(3)");
				num = S.nextInt(); //넣을 번호 선택 
				
				if(num>4 ||num<0) { //숫자가 1~3을 벗어나면  다시 입력 
					System.out.println("다시 입력해주세요.");
					break; 
					}
				insert(num); //insert 함수 호출 
				break;
			
			case 2: //delete
				System.out.println("삭제할 도형의 위치>>");
				
				if(!delete(num)) {
					System.out.println("삭제할 수 없습니다.");
					break;
				}
				delete(num);
				break;
				
			case 3: //show
				Shape t = start; 
				if (t != null) {
					t.draw();
					t.getNext();
				}
				break;
			case 4: //finish
				
				
				System.out.println("종료합니다");
			default:
				System.out.println("1~4사이의 숫자를 다시 입력해주세요.");
	
		}
		
		
		
		insert(num){ //함수 - 객체 생성
			if(num==1) {
				
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor(beauty); //객체 생성-> 생성자 함수
		ge.run();
		

	}

}
