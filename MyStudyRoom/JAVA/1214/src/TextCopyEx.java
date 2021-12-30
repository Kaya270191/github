//p.475 ���� 8-9
//���� ��Ʈ�� FileReader �� FileWriter �� �̿��Ͽ� c:\window\system.ini��
//c:\Temp\system.txt �� �����ϴ� ���α׷� �ۼ��ϱ�

import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\system.ini"); //���� ���� ��θ�
		File dest = new File("c:\\Temp\\system.txt"); //���� ���� ��θ�
		
		int c; 
		try {
			FileReader fr = new FileReader(src); //���� �Է� ���� ��Ʈ�� ���� FileReader
			FileWriter fw = new FileWriter(dest); //���� ��� ���� ��Ʈ�� ���� FileWriter
			
			while((c = fr.read())!= -1){ //���� �ϳ� �а�
				fw.write((char)c); //���� �ϳ� ���� 
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+ "��" + dest.getPath()+ "�� �����߽��ϴ�");
		} catch(IOException e ) {
			System.out.println("���� ���� ���� ");
		}
	}
}
