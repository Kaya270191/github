//n���� �����ϴ� �����ձ� ���� 
//������ �����ϴ� WordGameApp Ŭ������ Player Ŭ���� �ۼ�, 
//WordGameApp��ü �ϳ��� ���� ���ڸ�ŭ Player ��ü ����. 

import java.util.Scanner;

class player{ //�迭�� ����� �÷��̾� �̸�,,,
	Scanner S = new Scanner(System.in);
	String name;
	
	public player(String name){
		this.name = name; 
		
		}
	public void getWordFromUser(String arr[]) {
		Scanner S = new Scanner(System.in);
		this.name=name;
		String word = S.next();
		
		System.out.println(arr[i]+">>"+ word);
		
		
		}
	public void checkSuccess() {
		

		}

}


class WorldGameApp{
	//������ 
	
	public static void run(int num){ //���� ���� ��ŭ player ��ü �迭 ����
		Scanner S = new Scanner(System.in);
		String arr [] = new String[num]; //���� ����(num)��ŭ �迭�� ���� ����
		
		for(int i = 0; i < arr.length; i++) { //���� ���ڸ�ŭ �������� �̸��� �Է�-for�� 
			System.out.println("�������� �̸��� �Է��ϼ���:");
			String name = S.nextLine();
			arr[i] = name;			
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		
		System.out.println(java.util.Arrays.toString(arr));
		}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?>>"); //�����ο� ���� �Է� 
		int num = S.nextInt(); //�迭�� ����
		run(num); 
		}
	}

	
