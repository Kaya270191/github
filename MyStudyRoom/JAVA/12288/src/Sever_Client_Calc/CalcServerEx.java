package Sever_Client_Calc;

import java.io.*;
import java.net.*;
import java.util.*;


public class CalcServerEx {

	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() !=3) 
			return "error";
		
		String res="";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken(); 
		int op2 = Integer.parseInt(st.nextToken());
		
		switch(opcode) {
			case "+": res = Integer.toString(op1 + op2);
				break;
			case "-": res = Integer.toString(op1 - op2);
				break; 
			case "*": res = Integer.toString(op1 * op2);
				break;
			default : res = "error";
		}
		return res;
		
	}

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine(); //Ŭ���̾�Ʈ�� �� �� �б�
				if(inputMessage.equalsIgnoreCase("bye")) { //bye �Է¹����� ���� 
					System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ���");
					break;
				}
				System.out.println(inputMessage);
				String res = calc(inputMessage); //���. ��� ����� res
				out.write(res + "\n"); //��� ��� ���ڿ� ���� 
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(socket != null) socket.close(); //��ſ� ���� �ݱ�
				if(listener != null) listener.close(); //���� ���� �ݱ� 
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
