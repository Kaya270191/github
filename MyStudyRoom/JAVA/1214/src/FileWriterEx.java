//p.458 예제 8-4
//Scanner 를 이용하여 입력받은 데이터를 c:\\Temp\test.txt 파일에 저장하는 프로그램을 작성하라 
import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test2.txt"); //파일과 연결된 출력문자 스트림 생성 
			
			while(true) {
				String line = scanner.nextLine();// 빈칸 포함 한줄읽기
				if(line.length() == 0) // 한줄에 엔터키만 입력한 경우 
					break;
				fout.write(line, 0, line.length());//읽은 문자열을 파일에 저장
				fout.write("\r\n", 0 , 2); //한 줄 띄기 위해\r\n을 파일에 저장 
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("입출력 오류 ");
		}
		scanner.close();
	}
}
