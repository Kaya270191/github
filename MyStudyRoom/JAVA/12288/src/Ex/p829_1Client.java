package Ex;

import java.io.*;
import java.net.*;
import java.util.*;

public class p829_1Client { //한줄씩 입력받아 서버로 보냄 

	public static void main(String[] args) {
		BufferedWriter out = null;
		Socket socket = null;
		Scanner s = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 7777); //클라이언트 소켓 생성, 서버에 연결
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //소켓 출력 스트림
			while(true) {
				System.out.print("텍스트입력>>"); //프롬프트
				String outputMessage = s.nextLine(); //키보드에 입력한 문자열
				if(outputMessage.equals("끝")) { //끝 이라고 입력하면 종료 
					out.write(outputMessage+"\n");
					out.flush();
					System.out.println("연결을 종료합니다.");
					break;
				}
				out.write(outputMessage + "\n"); //키보드로 입력한 문자열 전송 
				out.flush();
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
				if(socket != null) socket.close(); //클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("오류발생 ");
			}
		}
	}
}
