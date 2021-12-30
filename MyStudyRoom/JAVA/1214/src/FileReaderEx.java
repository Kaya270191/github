//p.452. 예제8-1 
// FileReader를 이용하요 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램을 작성하라.
// system.ini는 텍스트 파일이다.

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null; 
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //파일  입력 스트림 생성. 스트림을 파일과 연결
			int c;
			while((c= fin.read())!= -1) { //파일 읽기. 파일의 끝을 만나면 -1 리턴 
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류 ");
		}
	}
}
