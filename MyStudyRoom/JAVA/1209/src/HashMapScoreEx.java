//p.417 7-6
//�ؽø��� �̿��Ͽ� �ڹ� ������ �̸��� ���� ����
//�ؽø��� �̿��Ͽ� �л��� �̸��� ���ڹ� ������ ��� �����ϴ� ���α׷��� �ۼ��϶�

import java.util.*;
public class HashMapScoreEx {
	public static void main(String[] args) {
		//�̸��� String, ������Integer�� ������ �ؽø�
		//var scoreMap = new HashMap<String, Integer>();
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		//5���� ���� ���� 
		scoreMap.put("kaya", 90);
		scoreMap.put("jay", 70);
		scoreMap.put("nana", 30);
		scoreMap.put("julia", 75);
		scoreMap.put("alvin",55); 
		
		//�ؽø� ����� ���� ��� 
		System.out.println("�ؽø� ����� ���� = "+scoreMap.size());
		
		//��� ����� ���� ��� 
		Set<String> keys = scoreMap.keySet(); //�ؽø��� ��� Ű�� ���� keySet()�� Set<String>Ÿ���� ����key�� ���  
		Iterator<String> it = keys.iterator(); //Set�� �ִ� ��� Ű�� ������� �˻��ϴ� Iterator����
		
		while(it.hasNext()) { //��� ���� ���
			String name = it.next(); //����Ű, �л� �̸�
			int score = scoreMap.get(name); //���� �˾Ƴ��� 
			System.out.println(name + ":" +score);
		}		
	}	
}
