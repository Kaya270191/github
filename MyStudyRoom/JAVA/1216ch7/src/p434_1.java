//p434
//1.  Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 
// 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라

import java.util.Scanner;
import java.util.Vector; 

public class p434_1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>(); //정수값만 다루는 벡터 생성 		
	
		while(true) {
			System.out.println("정수 -1 이 입력될 때까지");
			int num =S.nextInt(); 
			if(num==-1) { 
				break; 
			}
			else { //저장하고 벡터 검색해서 가장 큰 수 출력 
				v.add(num); //입력받은 숫자를 벡터에 요소 삽입	
			}
		} //while 문 탈출하면 프린트하기- 숫자를 비교하기 
		int v_max=0; // 최대값을 0으로 초기화 
		for(int i =0; i<v.size(); i++) {
			int n = v.get(i);// 벡터의 i 번쨰 정수 
			if(v_max==0) { //최대값이 0이면  첫번째 n값을 v_max에 넣기 
				v_max=n;
			}
			else if(v_max < n) { //n 값이 v_max보다 더 크면 그 값을 v_max로 넣기 
				v_max=n;
				}System.out.print(n + ",");
			}
			System.out.println("");
			System.out.println(v_max);
		}
	}

