import java.util.Scanner;
public class p164_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("������ �Է��Ͻÿ�"); //���� �Է� 
		
		int number = s.nextInt(); //����� �Է� ���� 
		int a = number; //�ι�° for ��
		
		for(int i=0; i<number; i++) { //�ʱⰪ i=0, �Է��� ���� ��ŭ �ݺ�, �ݺ��� ������ i�� 1�� ���� 
			for(int j=0; j<a; j++) { //�ʱⰪ j=0, j�� ����� �Է� ���ں��� ���� ������ �ݺ�,  
				System.out.print('*'); //�ѹ� �ݺ��� ������ * ����Ʈ 
			}
			System.out.println();	
			a--; //�ι�° for���� ����� �� a-1 �� �ϰ� �ٽ� ù��° for ������ ���ư� 
		}
		
		s.close();		
		}					
		}
		

	


