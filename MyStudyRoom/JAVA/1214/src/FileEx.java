//p. 473 ����8-8
// File Ŭ������ �̿��Ͽ� ������ Ÿ���� �˾Ƴ��� , ���͸��� �ִ� ���ϵ��� �����ϸ�, 
// ���͸� �̸��� �����ϴ� ���α׷� �ۼ� 

import java.io.File;

public class FileEx { 
	
	//���丮�� ���Ե� ���ϰ� ���� ���丮�� �̸�, ũ��, �����ð��� ����ϴ� �޼ҵ� 
	public static void listDirectory(File dir) { //getPath() ���� ��θ� 
		System.out.println("-----" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�.-----");
		
		File[] subFiles = dir.listFiles(); //���丮�� ���Ե� ���ϰ� ���丮 �̸��� ����Ʈ ���
		
		for(int i=0; i<subFiles.length; i++) { //subFiles �迭�� �� File�� ���� ����
			File f = subFiles[i];
			long t = f.lastModified(); //���������� ������ �ð�
			System.out.println(f.getName()); //���ϸ� 
			System.out.println("\t���� ũ��: " + f.length()); 
			System.out.printf("\t ������ �ð�: %tb %td %ta %tT\n" , t,t,t,t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		//getPath()���  getParent() �θ� ���͸�  getName()���ϸ� 
		System.out.println(f1.getPath() + "," + f1.getParent() + "," + f1.getName());
		
		
		String res=""; // isFile() isDirectory() �� ��θ��� �������� ���丮������ ����true/false����
		if(f1.isFile()) res = "����"; //���� Ÿ���̸�
		else if(f1.isDirectory()) res = " ���丮"; //Ƽ���丮 Ÿ���̸� 
		System.out.println(f1.getPath() + "��" + res + "�Դϴ�");
		
		File f2 = new File("c:\\Temp\\java_sample"); //���� ������� �ϴ� ���͸�
		if(!f2.exists()) { //f2 ���͸��� �����ϴ��� �˻� 
			f2.mkdir(); //���� ���ϸ� ���丮 ���� 
		}
		
		listDirectory(new File("c:\\Temp")); // c:\Temp �� �ִ� ���� ����Ʈ ��� 
		f2.renameTo(new File("c:\\Temp\\javasample")); //java_sample-> javasample�� �̸����� 
		
		listDirectory(new File("c:\\Temp")); //����Ʈ ��� 
	}
}
