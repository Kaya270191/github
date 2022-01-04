
import java.util.Scanner;
public class Rectangle0104 {//Rectangle0104 클래스
	
	int width; //정수형 멤버 width
	int height; //정수형 멤버 height
	public int getArea() { //정수를 리턴값으로 가지는 getArea()함수 
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle0104 Rec = new Rectangle0104();//레퍼런스 선언 및 인스턴스 생성
		Scanner S = new Scanner(System.in); //스캐너 생성
		System.out.println(">>");
		Rec.width =S.nextInt(); //스캐너로 입력받은 값을 객체의 멤버 width에 저장
		Rec.height = S.nextInt(); //스캐너로 입력받은 값을 객체의 멤버 height에 저장
		System.out.println("사각형의 면적은" + Rec.getArea()); //객체의 getArea()함수 호출해서 리턴 받은 값을 꺼냄
		S.close();
		

	}

}
