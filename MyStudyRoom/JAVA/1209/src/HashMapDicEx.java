//p.416
//7-5 HashMap�� �̿��Ͽ� (����, �ѱ�)�ܾ� ���� ���� �˻�

import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		//�ؽø� ���� var dic = new HashMap<String, String>(); 
		HashMap<String, String> dic = new HashMap<String, String>(); 
		
		//3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//����ڷκ��� ���� �ܾ� �Է¹ް� �ѱ� �ܾ� �˻�. "exit" �Է¹����� ����
		Scanner scanner = new Scanner(System.in); 
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = scanner.next(); //���� �ܾ� �Է� �ޱ�
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			String kor = dic.get(eng); //eng�� �ؽ��±� ��ü dic�� ������� �����ͼ� kor�� ����
			if(kor == null) //�˻��ߴµ� ���� ������ 
				System.out.println(eng + "�� ���� �ܾ��Դϴ�");
			else //���� ������ 
				System.out.println(kor);
		}
	}
}
