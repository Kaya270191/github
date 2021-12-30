//p.427 ���� 7-10. 
//����7-9�� GStack�� �̿��Ͽ� �Ű������� �־��� ������ ������ �ݴ�� ����� ���׸� �޼ҵ�reverse()�ۼ�

public class GenericMethodEx {
	//T�� �Ű������� ���׸� �޼ҵ� 
	public static <T> GStack<T> reverse(GStack<T> a){
		
		GStack<T> s = new GStack<T>(); //���� a�� �ݴ�� ������ ���� GStack ���� 
		while(true) {
			T tmp;
			tmp = a.pop(); //���� ���ÿ��� ��� �ϳ��� ���� 
			if(tmp == null) //������ �����
				break; //�Ųٷ� ����� �۾� ����
			else
				s.push(tmp);	//�� ���ÿ� ��� ����
		}return s; //�� ���� ����
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>(); //Double Ÿ���� GStack ����
		
		for(int i =0; i<5; i++) { //5�� ��Ҹ� ���ÿ� push
			gs.push(new Double(i));
		}
		
		gs = reverse(gs);
		for(int i =0; i<5; i++) {
			System.out.println(gs.pop());
		}		
	}
}
