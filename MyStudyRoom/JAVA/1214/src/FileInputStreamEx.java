//p.464 예제 8-6
// FileInputStream을 이용하여 c:\Temp\test.out 파일(예제 8-5에서 저장한 파일)을 읽어 
//byte[] 배열 속에 저장하고 화면에 출력하라 

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6]; //비어있는 byte 배열 
		
		try {
			// c:\\Temp\\test.out 파일을 읽어 배열 b 에 저장 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			fin.read(b);
		//배열 b[] 의 바이트 값을 모두 화면에 출력  
		System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
		for(int i =0; i<b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		
		fin.close();

		}catch(IOException e) {
			System.out.println("c:\\Temp\\test.out 에서 읽지 못했습니다. 경로명을 확인해 보세요.");
		}	
	}
}
