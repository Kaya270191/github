
public class practice7 { //클래스
	int radius; //정수형 멤버필드
	public practice7(int radius) {//생성자 함수 (매개변수로 정수 1개 받음)
		this.radius= radius;//객체 자신의  radius로 저장
	}
	public double getArea() { //실수로 리턴하는 getArea()메소드
		return 3.14*radius*radius;
	}
	

	public static void main(String[] args) {
		practice7 [] c  ; //practice7 배열에 대한 레퍼런스 c 선언
		c = new practice7[5]; //5개의 레퍼런스 배열 생성
		
		for(int i=0; i<c.length; i++) //배열의 길이만큼 반복
			c[i] = new practice7(i);//i 번째 원소 생성 
		
		for(int i=0; i<c.length; i++)// 배열의 길이만큼 반복
			System.out.println((int)(c[i].getArea())+" ");// 각 배열의 객체로 getArea()메소드 호출해서 리턴값 받아와서 면적 프린트

	}

}
