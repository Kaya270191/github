//�Ž������� �� ���� �������� ������ �� �ִ��� ���. ������ �����ڿ� ������ ������ ��� 

package PracticeArray;

public class pdf5_6 {

	public static void main(String[] args) {
		int [] coinUnit = {500,100,50,10};
		
		int money = 2680;
		int coin; //������ ǥ���� �Ű������� ���� 
	
		for(int i=0; i<coinUnit.length; i++) {
			coin=money/coinUnit[i];	//���� ������ ��
			money= money - (coinUnit[i]*coin); //������ ������ coinUnit[i]��° x ������ ���� ���� �ٽ� ���� �ֱ�
			System.out.println(coinUnit[i]+"��:" + coin); 
		}		
	}
}
