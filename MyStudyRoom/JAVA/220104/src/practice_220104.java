

public class practice_220104 {
	//������ ���� �ݵ�� String 
	public static String numbering(int a, int b) { //numbering()
		int i =a;
		String output="";
		while(i<b) {
			output +=i;
			i++;
		}
		return output; // �޼ҵ��� ��°��� ��ȯ 
	}
	
	public static void main(String[] args) {
		String result = numbering(1,5); //numbering()�� ������ ���� ����result�� ����
		System.out.println(result);// result ����Ʈ 
	}
}
