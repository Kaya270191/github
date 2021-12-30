//p.475 예제 8-10
// FileInputStream 과 FileOutputStream을 이용하여 이미지 파일을 복사하라
import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg"); //원본 파일 경로명
		
		File dest = new File("c:\\Temp\\copyimg2.jpg"); //복사 파일 경로명 
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); //파일 입력 바이트 스트림 생성
			FileOutputStream fo = new FileOutputStream(dest); //파일 출력 바이트 스트림 생성 
			
			while((c = fi.read()) != -1) { //fi.read() 는 파일 끝을 만나면 -1 리턴 
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사했습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류 ");
		}
	}
}
