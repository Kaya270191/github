//p.452. ����8-1 
// FileReader�� �̿��Ͽ� c:\windows\system.ini ������ �о� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�.
// system.ini�� �ؽ�Ʈ �����̴�.

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null; 
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //����  �Է� ��Ʈ�� ����. ��Ʈ���� ���ϰ� ����
			int c;
			while((c= fin.read())!= -1) { //���� �б�. ������ ���� ������ -1 ���� 
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("����� ���� ");
		}
	}
}
