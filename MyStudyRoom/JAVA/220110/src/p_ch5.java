//p.208
//4-8

public class p_ch5 {
	
	static void replaceSpace(char a[]) {//���ڿ� �迭[]�� �Ű������� �޴� �Լ� replaceSpace
		for(int i =0; i<a.length; i++) {
			if(a[i] == ' ')//�迭�� ��Ұ� ��ĭ�̸� 
				a[i]=',';  //,�� �ٲ� 
		}
	}
	
	static void printCharArray(char a[]) { //���ڿ� �迭[]�� �Ű������� �޴� �Լ� printCharArray
		for(int i=0; i<a.length; i++) {//����Ʈ 
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		char c[] = {'t','h','i','s',' ', 'p','e','n','c','i','l','.'};
		replaceSpace(c);
		printCharArray(c);
	}
}
