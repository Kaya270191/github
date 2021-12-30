//p.411
//���� 7-1�� �ڵ带 Iterator<Integer>�� �̿��Ͽ� �����϶�
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		
		//���� ���� �ٷ�� ���׸� ���� ���� 
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); //5����
		v.add(4); //4����
		v.add(-1); //-1 ����
		v.add(2,100); // 2��° �ڸ��� ���� 100 ���� 
		
		//Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator(); //Iterator ��ü 
		while(it.hasNext()) { //while ���� ���� v�� ��� ���� ��� 
			int n = it.next();
			System.out.println(n);
		}
		
		//Iterator �� �̿��Ͽ� ��� ���� ���ϱ� 
		int sum =0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ������ ��:" +sum);
	}
}
