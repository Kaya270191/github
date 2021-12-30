import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü ���� 
		try {
			socket = new Socket("localhost", 9999); //Ŭ���̾�Ʈ ���� ����, ������ ���� 
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//�����Է� ��Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//���� ��� ��Ʈ��
			while(true) {
				System.out.println("������>>");//������Ʈ
				String outputMessage = scanner.nextLine(); //Ű���忡�� �� �� �б�
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+ "\n");//bye ���ڿ� ����
					out.flush();
					break;//bye �Է��ϸ� ������ ���� �� ���� ���� 
				}
				out.write(outputMessage + "\n");//Ű���忡�� ���� ���ڿ� ����
				out.flush();//out ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ���� 
				String inputMessage = in.readLine(); //�����κ��� �� �� ����
				System.out.println("����: " + inputMessage);//�����κ��� ���� �޽��� ȭ�鿡 ��� 
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			}catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�. ");
			}
		}
	}
}
