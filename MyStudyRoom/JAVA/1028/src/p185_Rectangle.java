//너비(width)와 높이(height)를 입력받아 사각형의 합을 출력하는 프로그램 

import java.util.Scanner;

class p185_Rectangle{
	int width; //너비 필드
	int height; //높이 필드
	
	public int getArea() { //면적 계산 메소드 
		return width*height;
	}
}

class RectApp {
	public static void main(String[] args) {
		p185_Rectangle rect = new p185_Rectangle(); //객체 rect 생성 
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.width = scanner.nextInt(); //rect의 너비 입력받기
		rect.height = scanner.nextInt(); //rect의 높이 입력받기 
		System.out.println("사각형의 면적은" + rect.getArea());
		scanner.close();
	
	
}


	}

