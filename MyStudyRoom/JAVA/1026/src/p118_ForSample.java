
public class p118_ForSample {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) { //1.i=�ʱⰪ, 2.i�� 10���� ���� ������ �ݺ�, 4. i�� 1�� ����, �ٽ� 2������ ���ư� �ݺ�
			sum +=i; //3. sum=sum+i
			System.out.print(i); //i�� 10�� �Ǹ� �ߴ��ϰ� i������ ����Ʈ 
			if(i<=9) //���� i�� 9���� �۰ų� ������ 
				System.out.print("+"); //+�� ����Ʈ 
			else { //�׷��� ������ , i�� 10�̻��̸� 
				System.out.print("="); //=  �� ����Ʈ�ϰ� 
				System.out.print(sum); //sum�� ����Ʈ 
			}
		}

	}

}
