//p434
//1.  Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾� ���Ϳ� �����ϰ� 
// ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�

import java.util.Scanner;
import java.util.Vector; 

public class p434_1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>(); //�������� �ٷ�� ���� ���� 		
	
		while(true) {
			System.out.println("���� -1 �� �Էµ� ������");
			int num =S.nextInt(); 
			if(num==-1) { 
				break; 
			}
			else { //�����ϰ� ���� �˻��ؼ� ���� ū �� ��� 
				v.add(num); //�Է¹��� ���ڸ� ���Ϳ� ��� ����	
			}
		} //while �� Ż���ϸ� ����Ʈ�ϱ�- ���ڸ� ���ϱ� 
		int v_max=0; // �ִ밪�� 0���� �ʱ�ȭ 
		for(int i =0; i<v.size(); i++) {
			int n = v.get(i);// ������ i ���� ���� 
			if(v_max==0) { //�ִ밪�� 0�̸�  ù��° n���� v_max�� �ֱ� 
				v_max=n;
			}
			else if(v_max < n) { //n ���� v_max���� �� ũ�� �� ���� v_max�� �ֱ� 
				v_max=n;
				}System.out.print(n + ",");
			}
			System.out.println("");
			System.out.println(v_max);
		}
	}

