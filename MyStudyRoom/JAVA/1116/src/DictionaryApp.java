//p.319
//10. PairMap을 상속받는 Dictionary 클래스를 구현하고 이를 활용하는 메인 메소드를가진 클래스DictionaryApp작성
import java.util.Scanner;
import java.util.Arrays;

abstract class PairMap{
	protected String keyArray[]; //key들을 저장하는 배열
	protected String valueArray[]; //value들을 저장하는 배열
	abstract String get(String key); //key 값을 가진 value 리턴, 없으면 null
	abstract void put(String key, String value); //key,value를 쌍으로 저장, 기존에 key있으면  값을 value로 수정
	abstract String delete(String Key); //key값을 가진 아이템(value와 함께)삭제, 삭제된 value 값 리턴
	abstract int length();//현재 저장된 아이템의 개수 리턴
}


abstract class Dictionary extends PairMap{
	Scanner S = new Scanner(System.in);
	String name;
	String subject;
	private int set =0;	//set을 왜 설정?
	
	public Dictionary(int num) { //배열의 크기ㄹ를 설정 
		
		keyArray = new String[num];
		valueArray = new String[num];
		this.set=0; //why?
		}	

	abstract String get(String key); {
		//key 값을 가진 value 리턴, 없으면 null
		for(int i =0; i < keyArray.length; i++){
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
				
	abstract void put(String key, String value); {
		
		//key,value를 쌍으로 저장, 기존에 key있으면  값을 value로 수정
		for(int i =0; i < keyArray.length; i++) {
			String key = S.next();
			String value = S.next();
			if(key.equals(keyArray[i])) {
				keyArray[i]= key;
				valueArray[i]= value;
			return; //왜 리턴을 할까?
			}
		}
		keyArray[set]=key; //이부분은 무슨 뜻일까?
		valueArray[set]=value;
		set++;
		
	}
	abstract String delete(String Key); {
		//key값을 가진 아이템(value와 함께)삭제, 삭제된 value 값 리턴
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은" + dic.get("이재문"));
		System.out.println("황기태의 값은" + dic.get("황기태"));
		dic.delete("황기태"); //황기태의 값 삭제

	}

}