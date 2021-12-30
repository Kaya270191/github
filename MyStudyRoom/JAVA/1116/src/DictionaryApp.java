//p.319
//10. PairMap�� ��ӹ޴� Dictionary Ŭ������ �����ϰ� �̸� Ȱ���ϴ� ���� �޼ҵ带���� Ŭ����DictionaryApp�ۼ�
import java.util.Scanner;
import java.util.Arrays;

abstract class PairMap{
	protected String keyArray[]; //key���� �����ϴ� �迭
	protected String valueArray[]; //value���� �����ϴ� �迭
	abstract String get(String key); //key ���� ���� value ����, ������ null
	abstract void put(String key, String value); //key,value�� ������ ����, ������ key������  ���� value�� ����
	abstract String delete(String Key); //key���� ���� ������(value�� �Բ�)����, ������ value �� ����
	abstract int length();//���� ����� �������� ���� ����
}


abstract class Dictionary extends PairMap{
	Scanner S = new Scanner(System.in);
	String name;
	String subject;
	private int set =0;	//set�� �� ����?
	
	public Dictionary(int num) { //�迭�� ũ�⤩�� ���� 
		
		keyArray = new String[num];
		valueArray = new String[num];
		this.set=0; //why?
		}	

	abstract String get(String key); {
		//key ���� ���� value ����, ������ null
		for(int i =0; i < keyArray.length; i++){
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
				
	abstract void put(String key, String value); {
		
		//key,value�� ������ ����, ������ key������  ���� value�� ����
		for(int i =0; i < keyArray.length; i++) {
			String key = S.next();
			String value = S.next();
			if(key.equals(keyArray[i])) {
				keyArray[i]= key;
				valueArray[i]= value;
			return; //�� ������ �ұ�?
			}
		}
		keyArray[set]=key; //�̺κ��� ���� ���ϱ�?
		valueArray[set]=value;
		set++;
		
	}
	abstract String delete(String Key); {
		//key���� ���� ������(value�� �Բ�)����, ������ value �� ����
		for(int i =0; i < keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				String s = valueArray[i];
				keyArray[i] = null;
				valueArray[i]=null;
				return s;
			}
		}
		return null;	
	}
	abstract int length();{
		return set;
	}
}


public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ����" + dic.get("���繮"));
		System.out.println("Ȳ������ ����" + dic.get("Ȳ����"));
		dic.delete("Ȳ����"); //Ȳ������ �� ����

	}

}