import java.util.Scanner; //스캐너 객체 불러오기 
public class SuccessOrFail { //클래스 이름 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		
		if (score >= 80) {	//80점 이상이면 
			System.out.println("축하합니다! 합격입니다."); //실행
		}
		else if (score >= 60) { //if 문이 거짓이면 else if 로 와서 확인
			System.out.println("예비합격입니다.");
		}
		
		else if (score >=40) { //if, else if 문이 거짓이면 새로운 else if 문에서 확인
			System.out.println("예비2합격입니다.");
		}
			
		else {	//위의 조건식들이 모두 거짓이면 else 
			System.out.println("땡");	//실행
		} */
		
		
		char grade;
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		
		switch(score/10) { //점수를 10으로 나눠서 
			case 10 :	//그 값이 10이면 
			case 9 :	//그 값이 9이면
				grade = 'A';	//실행
				break;
			case 8 :
				grade = 'B';
				break;
			default:	//case 이외는 디폴트로 
				grade = 'F';
		}
		System.out.println("학점은" + grade + "입니다");
		
		scanner.close(); //스캐너 객채 닫기
		
		
	}

}
