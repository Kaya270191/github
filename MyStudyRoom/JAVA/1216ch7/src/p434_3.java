//p.435
//3. �׸� �� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, �ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� ���α׷�\
//HashMap<String, Integer> nations = new HashMap<String, Integer>();

import java.util.*;
import java.util.Arrays.*; //�ؽø� �迭�� ����ϱ� ���� ����Ʈ 

public class p434_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Hashmap<����, ����>�� ������. ���۷����� nation 
		HashMap<String, Integer> nation = new HashMap<String, Integer>();
		String name;//�����̸�
		int pop; //�α�
				
		while(true) {// �ؽø� �ȿ� ���� �Է� ���� 
			System.out.println("�����̸��� �α��� �Է��ϼ���(��: Korea 5000)"); 
			name = scan.next(); 
			if(name.equals("�׸�")) { //�׸� �Է��ϸ� �Է¹ޱ� ���� 
				System.out.println("�Է� ����");
				System.out.println(nation); //�ؽø� ����Ʈ 
				break;
			}			
			pop = scan.nextInt(); 
			nation.put(name, pop); //�ؽøʿ� �Է¹��� name�� pop �ֱ� 
			System.out.println(nation);
		}
		
		//�ؽø� ã�� 
		while(true) {
			System.out.println("�α� �˻�>>");
			String search_country = scan.next(); //�Է¹޴� ���� 
			if(search_country.equals("�׸�")) { //�׸� �Է��ϸ� ���� 
				System.out.println("���α׷� ���� ");
				break;
			}
			//�ؽøʿ��� �Է��� ���� �˻��ؼ� �α��� ���
			int search_pop = nation.get(search_country); // �ؽø� nation���� �Է¹��� ���� �����ͼ� �α��� ��ȯ 
			if(search_pop == 0) // ���� ���� �̸� 0 ���� ��ȯ 
				System.out.println( search_country+"�� �����ϴ�");
			else
				System.out.println(search_country + "�� �α���"+ search_pop);
		}scan.close();
	}	
}
