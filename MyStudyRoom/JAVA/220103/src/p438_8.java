import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Arrays; //�ؽø��� ����Ʈ�ϱ� ���� ����Ʈ 

public class p438_8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		//�ؽø� ���� 
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		
		System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");
		while(true) {
			System.out.println("�̸��� ����Ʈ �Է�>>");
			String  name = S.next(); //�̸� �Է�
			int score = S.nextInt(); //���� �Է� 
			if(name.equals("�׸�")){//�׸� �Է��ϸ� while�� Ż�� 
				break;
			}
			if(scoreMap.get(name)==null) {  //���� �ؽøʿ� �̸��� ������
				scoreMap.put(name, score); //�ؽøʿ� ���Ӱ� �߰� 
			}
			else {// ���� �ؽøʿ� �̸��� ������ 
				scoreMap.put(name, scoreMap.get(name)+score);//���� ������ �Է¹��� ������ ���ϱ� 
			}
			// �ؽø� ����Ʈ 
			Set<String>findName  = scoreMap.keySet();
			Iterator<String>it = findName.iterator();
			
			while(it.hasNext()) {
				String name2 = it.next(); 
				int sum =  scoreMap.get(name2);
				System.out.print("("+name2 +","+sum+")");	
			}System.out.println(" ");
		}
	}
}