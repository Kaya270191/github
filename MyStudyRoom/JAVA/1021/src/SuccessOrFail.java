import java.util.Scanner; //��ĳ�� ��ü �ҷ����� 
public class SuccessOrFail { //Ŭ���� �̸� 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		
		if (score >= 80) {	//80�� �̻��̸� 
			System.out.println("�����մϴ�! �հ��Դϴ�."); //����
		}
		else if (score >= 60) { //if ���� �����̸� else if �� �ͼ� Ȯ��
			System.out.println("�����հ��Դϴ�.");
		}
		
		else if (score >=40) { //if, else if ���� �����̸� ���ο� else if ������ Ȯ��
			System.out.println("����2�հ��Դϴ�.");
		}
			
		else {	//���� ���ǽĵ��� ��� �����̸� else 
			System.out.println("��");	//����
		} */
		
		
		char grade;
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		
		switch(score/10) { //������ 10���� ������ 
			case 10 :	//�� ���� 10�̸� 
			case 9 :	//�� ���� 9�̸�
				grade = 'A';	//����
				break;
			case 8 :
				grade = 'B';
				break;
			default:	//case �ܴ̿� ����Ʈ�� 
				grade = 'F';
		}
		System.out.println("������" + grade + "�Դϴ�");
		
		scanner.close(); //��ĳ�� ��ä �ݱ�
		
		
	}

}
