//p.469 ����8-7
// ���� ũ�⸦ 5�� �ϰ�, ǥ�� ��� ��Ʈ��(System.out)�� ������ ���� ��� ��Ʈ���� �����϶�
// c:\Temp\text2.txt ������ ����� ���� �ؽ�Ʈ�� �о� ���� ��� ��Ʈ���� ���� ����϶� 

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("c:\\Temp\\test2.txt"); //������ �ҷ��� 
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); //5���� ���� ��� 
			
			while((c = fin.read()) != -1) { //���� �����͸� ��� 
				out.write(c);
			}
			//���� ��� ��µ� ���� 
			new Scanner(System.in).nextLine(); // ����Ű �Է�
			out.flush(); // ���ۿ� ���� �ִ� ����(3��) ��� ��� 
			fin.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
