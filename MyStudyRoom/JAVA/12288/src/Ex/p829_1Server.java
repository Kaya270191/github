package Ex;

import java.io.*;
import java.net.*;
import java.util.*;

public class p829_1Server { //서버 클래스 - 받는 텍스트를 출력만 함
	public static void main(String[] args) {
		BufferedReader in = null; 
		ServerSocket listener = null;
		Socket socket = null;
		Scanner s = new Scanner(System.in);
		
		try {listener = new ServerSocket(7777); //서버 소켓 생성
			System.out.println("서버입니다. 클라이언트를 기다립니다.");
			socket = listener.accept(); //클라이언트로부터 연결 요청 대기 
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓 입력 스트림
			while(true) {
				String inputMessage = in.readLine(); //클라이언트가 보낸 행 읽기
				if(inputMessage.equals("끝")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("..." + inputMessage); //클라이언트가 보낸 메시지 출력 
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
			socket.close(); //통신용 소켓 닫기
			listener.close(); //서버 소켓 닫기 
			}catch (IOException e) {
				System.out.println("오류가 발생 ");
			}
		}	
	}
}
