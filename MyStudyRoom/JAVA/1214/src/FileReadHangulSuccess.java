//p.455 예제 8-2
//InputStreamReader를 이용하여 MS949문자 집합으로 한글 텍스트 파일을 읽고 출력하라

import java.io.*;

public class FileReadHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
	
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "MS949");
			int c ;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c= in.read()) != -1){
				System.out.print((char)c);
			}

			in.close();
			fin.close();
	
		}catch(IOException e) {
			System.out.println("입출력 오류 ");
		}
	}
}
