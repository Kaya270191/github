//p.475 ���� 8-10
// FileInputStream �� FileOutputStream�� �̿��Ͽ� �̹��� ������ �����϶�
import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg"); //���� ���� ��θ�
		
		File dest = new File("c:\\Temp\\copyimg2.jpg"); //���� ���� ��θ� 
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); //���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); //���� ��� ����Ʈ ��Ʈ�� ���� 
			
			while((c = fi.read()) != -1) { //fi.read() �� ���� ���� ������ -1 ���� 
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "��" + dest.getPath() + "�� �����߽��ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ���� ���� ");
		}
	}
}
