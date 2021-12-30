package Ex;

import java.io.*;
import java.net.*;
import java.util.*;

public class p829_1Server { //���� Ŭ���� - �޴� �ؽ�Ʈ�� ��¸� ��
	public static void main(String[] args) {
		BufferedReader in = null; 
		ServerSocket listener = null;
		Socket socket = null;
		Scanner s = new Scanner(System.in);
		
		try {listener = new ServerSocket(7777); //���� ���� ����
			System.out.println("�����Դϴ�. Ŭ���̾�Ʈ�� ��ٸ��ϴ�.");
			socket = listener.accept(); //Ŭ���̾�Ʈ�κ��� ���� ��û ��� 
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //���� �Է� ��Ʈ��
			while(true) {
				String inputMessage = in.readLine(); //Ŭ���̾�Ʈ�� ���� �� �б�
				if(inputMessage.equals("��")) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				System.out.println("..." + inputMessage); //Ŭ���̾�Ʈ�� ���� �޽��� ��� 
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
			socket.close(); //��ſ� ���� �ݱ�
			listener.close(); //���� ���� �ݱ� 
			}catch (IOException e) {
				System.out.println("������ �߻� ");
			}
		}	
	}
}
