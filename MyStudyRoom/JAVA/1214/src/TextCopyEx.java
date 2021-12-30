//p.475 예제 8-9
//문자 스트림 FileReader 와 FileWriter 를 이용하여 c:\window\system.ini를
//c:\Temp\system.txt 로 복사하는 프로그램 작성하기

import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\system.ini"); //원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt"); //복사 파일 경로명
		
		int c; 
		try {
			FileReader fr = new FileReader(src); //파일 입력 문자 스트림 생성 FileReader
			FileWriter fw = new FileWriter(dest); //파일 출력 문자 스트림 생성 FileWriter
			
			while((c = fr.read())!= -1){ //문자 하나 읽고
				fw.write((char)c); //문자 하나 쓰고 
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+ "를" + dest.getPath()+ "로 복사했습니다");
		} catch(IOException e ) {
			System.out.println("파일 복사 오류 ");
		}
	}
}
