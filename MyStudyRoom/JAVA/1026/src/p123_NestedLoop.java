//2�� ��ø for�� ����� ������ ��� ���α׷� ����� 
public class p123_NestedLoop {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) { //��: i�� 1�ܺ��� �����ؼ� 10���� ���� ������ �ݺ��ϸ� �ݺ��� ������ i�� 1�� ���� 
			for(int j=1; j<10; j++) { //i�� 1�϶�, j�� 10���� ���� ������ �ݺ��ϸ� �ݺ��� ������ j�� 1�� ���� 
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print('\t');
				
			}
			System.out.println();
		}

	}

}
