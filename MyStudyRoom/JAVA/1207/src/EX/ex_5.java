//6-5 Wrapper Ŭ���� Ȱ�� 

package EX;

public class ex_5 {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); //a
		
		char c1='4', c2='F';
		if(Character.isDigit(c1)) //���� c1�� ���ڸ� true
			System.out.println(c1+"�� ����");
		if(Character.isAlphabetic(c2)) //����c2�� ���ڸ� true
			System.out.println(c2+"�� ������");
		
		System.out.println(Integer.parseInt("-222")); //���ڿ�-222�� 10������ ����
		System.out.println(Integer.toHexString(28)); //����28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28));//����28�� 16���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28)); //28�� ���� 2������ 1�� ���� 
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());//���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14")); //���ڿ�"3.14"�� �Ǽ�3.14�� ��ȯ
		
		boolean b = (4>3); //b�� true
		System.out.println(Boolean.toString(b)); //true�� ���ڿ�"true"�� ��ȯ
		System.out.println(Boolean.parseBoolean("false")); //���ڿ��� "false"�� ��ȯ

	}

}
