//���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�ϱ� 

public class pdf6_22 {
	
	public static boolean isNumber (String str) {
		if(str == null || str.equals(""))  //���ڿ��� null �̰ų� ���ڿ��̸� 
			return false; //false

		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); 
				
			if (c < '0' || c >'9') 
					return false;
				}
			return true;
			}

	
public static void main(String[] args) { //���� �޼ҵ�
		String str = "123";
		System.out.println(str+"�� �����Դϱ�?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�?" + isNumber(str));
	}
}
