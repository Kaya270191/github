  package Ch5_p321;

import java.util.Scanner;

import p321_12.Shape;
public class GraphicEditor {
	private String name;
	private Shape start=null, last=null; 
	int num;
	
	GraphicEditor(String name){ //������ �Լ� 
		this.name = name;
	}
	
	private void run(){ //run�Լ� 
		Scanner S = new Scanner(System.in);
		
		System.out.println("�׷��� ������" + name + "�� �����մϴ�.");

		
		int choice;
		while(choice > 0 && choice < 5) { //���̽��� 1~4���̰� �ƴѰ�찡 �ƴϸ� while �� �ݺ��ϱ�. 
			System.out.println("����(1), ����(2), ��κ���(3), ����(4)>>");
			choice = S.nextInt(); //���� �� ��ȣ ���� 
			
			int num =0;
			switch(choice) {
			case 1: //insert
				System.out.println("Line(1), Rect(2), Circle(3)");
				num = S.nextInt(); //���� ��ȣ ���� 
				
				if(num>4 ||num<0) { //���ڰ� 1~3�� �����  �ٽ� �Է� 
					System.out.println("�ٽ� �Է����ּ���.");
					break; 
					}
				insert(num); //insert �Լ� ȣ�� 
				break;
			
			case 2: //delete
				System.out.println("������ ������ ��ġ>>");
				
				if(!delete(num)) {
					System.out.println("������ �� �����ϴ�.");
					break;
				}
				delete(num);
				break;
				
			case 3: //show
				Shape t = start; 
				if (t != null) {
					t.draw();
					t.getNext();
				}
				break;
			case 4: //finish
				
				
				System.out.println("�����մϴ�");
			default:
				System.out.println("1~4������ ���ڸ� �ٽ� �Է����ּ���.");
	
		}
		
		
		
		insert(num){ //�Լ� - ��ü ����
			if(num==1) {
				
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor(beauty); //��ü ����-> ������ �Լ�
		ge.run();
		

	}

}
