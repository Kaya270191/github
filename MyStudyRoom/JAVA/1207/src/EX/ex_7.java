//6-7 String Ŭ���� �޼ҵ� Ȱ��

package EX;

public class ex_7 {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+"�� ���̴�"+a.length()); //���ڿ��� ����(���� ����-��ĭ����)
		System.out.println(a.contains("#"));//a�� #�����ϰ� �ִ���? ->true
		
		a =a.concat(b); //a�� b�� �����ؼ� �Ű����� a�� ���� 
		System.out.println(a);
		
		a =a.trim();//a ��,�� ���� ���� 
		System.out.println(a);
		
		a =a.replace("C#", "Java");//a�� ������C#,C++ ->  Java,C++ �� �ٲ�
		System.out.println(a);
		
		String s[] = a.split(",");// , �� ���ڿ� �и� 
		for(int i =0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�"+i + ":" +s[i]);
		
		a= a.substring(5); //5 �ε������� �����ϴ� ���� ��Ʈ�� ����
		System.out.println(a);
		
		char c  = a.charAt(2); //�ε���2�� ���� ����
		System.out.println(c);
	}
}
