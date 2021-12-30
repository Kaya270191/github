//p.420 7-8. Collections Ŭ������ Ȱ��
//Collections Ŭ������ Ȱ���Ͽ� ���ڿ� ����, �ݴ�� ����, ���� �˻��� �����ϴ� ��ʸ� ���캸��

import java.util.*;

public class CollectionsEx {

	static void printList(LinkedList<String> l) { //����Ʈ�� ��Ҹ� ��� ����ϴ� �޼ҵ�
		Iterator<String> iterator = l.iterator(); //Iterator������StringŸ���� ���۷���iterator ��ü ����
		while(iterator.hasNext()) {//Iterator ��ü�� ��Ұ� ���� ������ �ݺ� 
			String e = iterator.next(); //���� ��� ����
			String seperator; 
			if(iterator.hasNext())
				seperator = "->"; //������ ��Ұ� �ƴϸ� -> ��� 
			else
				seperator = "\n"; //������ ����̸� �ٹٲ�
			System.out.println(e+seperator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>(); //�� ����Ʈ ����
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("�ظ�����");
		myList.add(0,"�͹̳�����"); //0��°�� �͹̳����� �ֱ�
		myList.add(2, "�ƹ�Ÿ"); //2��°�� �ƹ�Ÿ �ֱ�
		
		System.out.println(myList);
		Collections.sort(myList); //��� ����
		System.out.println(myList); 
		
//		Collections.reverse(myList); //��� ������ �ݴ��
//		System.out.println(myList);
		
		int index = Collections.binarySearch(myList, "�ظ�����")+1;
		System.out.println("�ƹ�Ÿ��" + index + "��° ����Դϴ�");
	}
}
