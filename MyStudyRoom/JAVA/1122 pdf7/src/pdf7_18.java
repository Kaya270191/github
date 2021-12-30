//pdf7-18
//메서드명: action
//주어진 객체 메서드 호출
//DanceRobot인 경우, dance()호출 . SingRobot인 경우 Sing()호출. DrawRobot인 경우 draw()호출
//반환타입: 없음
//Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스 

class Robot{}

class DanceRobot extends Robot{ //Robot을 상속받은 DanceRobot
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{ //Robot을 상속받은 SingRobot
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot{  //Robot을 상속받은 DrawRobot
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}


public class pdf7_18 {
	static void action(Robot r){ //instanceof 로 로봇r의 타입이 무엇인지 확인 
		if(r instanceof DanceRobot) { //r 이 DanceRobot이면  
			((DanceRobot) r).dance(); // 레퍼런스 r 의 DanceRobot 타입의 dance() 함수 호출 
		}
		else if (r instanceof SingRobot) { //r 이 SingRobot이면  
			((SingRobot) r).sing(); // 레퍼런스 r 의 SingRobot 타입의 sing() 함수 호출 
		}
		else if (r instanceof DrawRobot) { //r 이 DrawRobot이면  
			((DrawRobot) r).draw(); //레퍼런스 r의 DrawRobot 타입의 draw()함수 호출 
		}
	}

	public static void main(String[] args) {
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		//Robot 클래스의 레퍼런스arr 배열 생성.
		for(int i =0; i<arr.length; i++) 
			action(arr[i]);
	}
}
