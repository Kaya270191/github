//p.434
//2. Scanner Ŭ������ ����Ͽ� 5�� ����('A','B','C','D','F')�� ���ڷ� �Է¹޾�
//ArrayList �� �����ϰ� ArrayList�� �˻��Ͽ� ������ ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)
//�� ��ȯ�Ͽ� ����� ����ϴ� ���α׷� �ۼ� 

import java.util.*;

public class p434_2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>(); //���ڿ��� ���԰����� ArrayList ����
		String grade; //�Է¹��� ���� 
		double ave=0;
		System.out.println("5���� ������ �� ĭ���� �и� �Է� (A/B/C/D/F)");
		
		for(int i =0 ; i<5; i++) { //�Է¹��� ������ ArrayList a �� ���� 
			grade = S.next(); 
			a.add(grade); //�Է¹��� grade�� ArrayList�� �߰��ϱ� 
		}
		System.out.println(a); //ArrayList a ����غ��� 
		
		//�Է¹��� grade�� score�� ��ȯ 
		double score =0; 
		for(int i =0; i<a.size(); i++) {	//�ݺ��� ������ a�� ��Ҹ� ���ϱ� 
			String b = a.get(i);//ArrayList a  ��  i�� ���� 
			switch(b) { //
				case "A" : 
					score += 4.0; 
					break;
				case "B" : 
					score += 3.0; 
					break;
				case "C" : 
					score += 2.0; 
					break;
				case "D" : 
					score += 1.0; 
					break;
				case "F" : 
					score += 0;  
					break;
				default: System.out.println("������ �ٽ� �Է����ּ��� ");	
			}
		System.out.println(score); //�ٲ� ������ ��� 
		ave = score/a.size(); //��� ���	
		}System.out.println("�����" + ave);
	}
}
