package Ex;

import java.io.*;
import java.net.*;
import java.util.*;

public class p829_1Client { //���پ� �Է¹޾� ������ ���� 

	public static void main(String[] args) {
		BufferedWriter out = null;
		Socket socket = null;
		Scanner s = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 7777); //Ŭ���̾�Ʈ ���� ����, ������ ����
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //���� ��� ��Ʈ��
			while(true) {
				System.out.print("�ؽ�Ʈ�Է�>>"); //������Ʈ
				String outputMessage = s.nextLine(); //Ű���忡 �Է��� ���ڿ�
				if(outputMessage.equals("��")) { //�� �̶�� �Է��ϸ� ���� 
					out.write(outputMessage+"\n");
					out.flush();
					System.out.println("������ �����մϴ�.");
					break;
				}
				out.write(outputMessage + "\n"); //Ű����� �Է��� ���ڿ� ���� 
				out.flush();
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
				if(socket != null) socket.close(); //Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				System.out.println("�����߻� ");
			}
		}
	}
}
