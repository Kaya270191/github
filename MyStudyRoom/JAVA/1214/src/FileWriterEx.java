//p.458 ���� 8-4
//Scanner �� �̿��Ͽ� �Է¹��� �����͸� c:\\Temp\test.txt ���Ͽ� �����ϴ� ���α׷��� �ۼ��϶� 
import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test2.txt"); //���ϰ� ����� ��¹��� ��Ʈ�� ���� 
			
			while(true) {
				String line = scanner.nextLine();// ��ĭ ���� �����б�
				if(line.length() == 0) // ���ٿ� ����Ű�� �Է��� ��� 
					break;
				fout.write(line, 0, line.length());//���� ���ڿ��� ���Ͽ� ����
				fout.write("\r\n", 0 , 2); //�� �� ��� ����\r\n�� ���Ͽ� ���� 
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("����� ���� ");
		}
		scanner.close();
	}
}
