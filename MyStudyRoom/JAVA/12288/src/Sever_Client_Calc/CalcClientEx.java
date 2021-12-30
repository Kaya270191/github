package Sever_Client_Calc;

import java.io.*;
import java.net.*;
import java.util.*;


public class CalcClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); 
		
		try {
			socket = new Socket("localhost", 9999); //클라이언트 소켓 생성. 서버와 바로 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//소켓 입력 스트림
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//소켓 출력 스트림
			
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예: 24 + 42)>>"); //프롬프트
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")){
					out.write(outputMessage+ "\n"); //bye 문자열 전송
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine(); //서버로부터 계산 결과 수신
				System.out.println("계산 결과: " + inputMessage); //서버로받은 계산 결과 화면 출력 
						
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close(); //클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
