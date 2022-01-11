//5-7
//추상클래스의 구현 연습

abstract class Calculator{ //추상 클래스 Calculator
	public abstract int add(int a, int b); //추상메서드 정수를 리턴
	public abstract int subtract(int a, int b);//추상메서드 정수를 리턴
	public abstract double average(int[] a);//추상메서드 정수의배열을 리턴
}


public class p_ch5_7 extends Calculator{ //추상클래스 Calculator를 상속받은 클래스
	public int add(int a, int b) {//추상클래스 구현
		return a+b; //두 매개변수를 더해서 정수형으로 리턴
	}
	public int subtract(int a, int b) { //추상클래스 구현
		return a-b;// 두 매개 변수의 차를 정수형으로 리턴 
	}
	public double average(int[]a) { //추상클래스 구현 - 정수형 배열을 매개변수로 받음
		double sum = 0;// 초기값 설정
		for(int i =0; i<a.length; i++) //매개변수로 받은 배열의 수 만큼 반복
			sum+=a[i];//모든 값 더하기
		return sum/a.length;//배열의 길이만큼 모두 더한값 나누면 평균이 나옴 
	}

	public static void main(String[] args) {
		p_ch5_7 c = new p_ch5_7(); //레퍼런스 선언 및 객체 생성
		System.out.println(c.add(2, 3));//add()함수 호출
		System.out.println(c.subtract(2, 3));//subtract()함수 호출
		System.out.println(c.average(new int[]{2,3,4}));//average()함수 호출 
	}
}
