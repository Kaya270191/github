// p.435 
// Vector �÷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷��� �ۼ��϶�
// �������� �Է��ϸ� ���Ϳ� �߰��ϰ� ���� �Էµ� ��� �������� ����� ���

import java.util.*;

public class p435_4 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();//�������� �ٷ�� ���� ����
		
		while(true) {
			Scanner S = new Scanner(System.in);
			System.out.println("������ �Է�(0 �Է½� ����)>> ");
			int num = S.nextInt(); //������ �Է¹ޱ� 
			
			if(num == 0) { // 0 �Է��ϸ� ���� 
				System.out.println("����");
				break;
			}
			v.add(num); //���� ���� 
			
			int sum = 0; //����� ���� sum
			for(int i =0; i<v.size(); i++) { //��� 
				int n = v.get(i); //����� ���� n 
				int ave = v.elementAt(i); //����� ���� ���� 
				sum += ave;
				System.out.print(n + " ");								
			}
			System.out.println("���� ���:"+ sum / v.size());
		}
	}
}
