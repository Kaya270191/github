//p.464 ���� 8-6
// FileInputStream�� �̿��Ͽ� c:\Temp\test.out ����(���� 8-5���� ������ ����)�� �о� 
//byte[] �迭 �ӿ� �����ϰ� ȭ�鿡 ����϶� 

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6]; //����ִ� byte �迭 
		
		try {
			// c:\\Temp\\test.out ������ �о� �迭 b �� ���� 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			fin.read(b);
		//�迭 b[] �� ����Ʈ ���� ��� ȭ�鿡 ���  
		System.out.println("c:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
		for(int i =0; i<b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		
		fin.close();

		}catch(IOException e) {
			System.out.println("c:\\Temp\\test.out ���� ���� ���߽��ϴ�. ��θ��� Ȯ���� ������.");
		}	
	}
}
