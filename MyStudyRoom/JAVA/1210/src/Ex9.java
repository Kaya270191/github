//p.387 9. 
//ö���� ��ǻ���� ���������� ������ ������. ����,����,���� 1,2,3zldlek
//ö���� Ű�� �Է��ϸ� ���ÿ� ���α׷��� Math.Random()�� �̿��Ͽ� 1,2,3 �߿� �� ���� �߻���Ű�� �̰��� ��ǻ�Ͱ� �� ������ �Ѵ�
//�׷� ���� ö���� ��ǻ�� �� ���� �̰���� �Ǻ��Ͽ� ���ڸ� ����϶�

import java.util.Scanner;

public class Ex9 {
	public static String hand(int com) { //���ڿ� Ÿ���� hand�Լ�(��Ʈ�� �Ű�����) 
		String hand; //
		if(com==1) {
			hand = "����";
			return hand;
		}
		else if(com==2) {
			hand = "����";
			return hand;
		}
		else if(com==3) {
			hand = "��";
			return hand;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		int cheol; //ö���� ������ ���� ���� ������ ���� cheol
		Scanner S = new Scanner(System.in);
		while(true) { 
			System.out.print("ö��[����(1),����(2),��(3),������(4)]>>");
			cheol = S.nextInt(); //ö���� ����
							
			int com = (int)(Math.random()*1)+3; //��ǻ�� ������������ �������� ���� 
			//System.out.println(com);
			//toString(com);
			
			//ö���� ��ǻ�Ͱ� ������ ���ڸ� hand()�Լ� ȣ��
			System.out.println("ö��("+ hand(cheol) + ") : ��ǻ��(" + hand(com) +")");
			
			if(cheol == 1) { 
				if(com == 3) {
					System.out.println("ö���� �̰���ϴ�");
				}
				else if (com == 2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
				else if(com ==3) {
					System.out.println("�����ϴ�");
				}
			}
			else if(cheol ==2) {
				if(com == 3) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
				else if(com == 2) {
					System.out.println("�����ϴ�");
				}
				else if(com ==1) {
					System.out.println("ö���� �̰���ϴ�");
				}
			}
			else if(cheol ==3) {
				if(com == 3) {
					System.out.println("�����ϴ�");
				}
				else if(com == 2) {
					System.out.println("ö���� �̰���ϴ�");
				}
				else if(com ==1) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
			}if(cheol==4) { //4�� �Է��ϸ� ��
				break;}
		}
	}
}
