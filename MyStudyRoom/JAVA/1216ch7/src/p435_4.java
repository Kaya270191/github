// p.435 
// Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라
// 강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력

import java.util.*;

public class p435_4 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();//정수값을 다루는 벡터 생성
		
		while(true) {
			Scanner S = new Scanner(System.in);
			System.out.println("강수량 입력(0 입력시 종료)>> ");
			int num = S.nextInt(); //강수량 입력받기 
			
			if(num == 0) { // 0 입력하면 종료 
				System.out.println("종료");
				break;
			}
			v.add(num); //정수 삽입 
			
			int sum = 0; //평균을 위한 sum
			for(int i =0; i<v.size(); i++) { //출력 
				int n = v.get(i); //출력을 위한 n 
				int ave = v.elementAt(i); //평균을 위한 숫자 
				sum += ave;
				System.out.print(n + " ");								
			}
			System.out.println("현재 평균:"+ sum / v.size());
		}
	}
}
