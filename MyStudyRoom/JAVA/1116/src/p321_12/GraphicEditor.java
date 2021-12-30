package p321_12;
//p.321
//12.
import java.util.Scanner;

public class GraphicEditor{
	private String name;
	private Shape start=null, last=null; //Shape Ÿ������ ��ĳ���õǾ�� �ؼ�  
	private Scanner sc = new Scanner(System.in);
	
	public GraphicEditor(String name) { //������ 
		this.name=name;
	}
	
	public void run() {
		System.out.println("�׷��� ������ "+ name + "�� �����մϴ�.");
		int choice=0;
		
		while(choice !=4) { //choice�� 4�� �ƴϸ� ��� �ݺ� 
			System.out.println("����(1), ����(2), ��κ���(3), ����(4)>>");
			choice = sc.nextInt(); //choice���� ��ĳ�ʷ� �ޱ� 
			int num = 0; //����-������ ��ȣ 
			
			switch(choice) {
			case 1: 
				//insert()
				System.out.println("Line(1), Rect(2), Circle(3)>>");
				num =sc.nextInt(); //�Է¹��� ���ڸ� ���� num�� ���� 
				if(num<1 || num>3) {
					System.out.println("�߸��Է�"); //�Է��� ���ڰ� 1���� �۰ų�3���� ũ�� if�� Ż���ؼ� �ٽ� ������ �� �ְ�..
					break;
				}
				insert(num);
				break;
				
			case 2:
				//delete()
				System.out.println("������ ���� ��ġ�Է�");
				num = sc.nextInt(); 
				if(!delete(num)) {//���� �� �� �����ٸ� 
					System.out.println("������ �� ����.");
				}
				break;
				
			case 3:
				//show()
				Shape t = start; //ShapeŸ���� ���۷��� t�� start���� ����
				while( t != null) { //t���� null �� �ƴҶ����� �ݺ� 
					t.draw();
					t = t.getNext();
				}
				break;
				
			case 4:
				System.out.println(name + "�� �����մϴ�.");
				break;
			default: //����ڰ� 1~4�� ��� ���� �Է��Ѵٸ�
				System.out.println("1~4���� �Է°���");
			}
		}
	}
		private void insert(int num) {
			Shape obj = null; 
			switch(num) { //num ���� ���� ��ü ����
			case 1: //Line ��ü
				obj = new Line();
				break;
			case 2: // Rect ��ü
				obj = new Rect();
				break;
			case 3: //Circle��ü
				obj = new Circle();
				break;
			}
			if(start ==null) { //ó���� start,last ���� ����. obj�� ����Ŵ
				start = last = obj; 
			}
			else {
				last.setNext(obj); //last ���۷����� ���ؼ� setNext�Լ� ȣ��(ȣ�� �� �Ű������� obj)
				last = obj; //last ���۷����� obj�� ����Ŵ.
			}
		}
		
		private boolean delete (int num) { //true �� �����. false�� �� ���� �� 
			Shape cur = start; //����
			Shape pre = start; //����
			if(start == null) //start ���� ������ ������ ���� ��� false
				return false;
			for(int i = 0; i < num; i++) { //start�� null �� �ƴ� ��� . 
				pre = cur;
				cur = cur.getNext();
				if(cur==null) //cur�� �� �̻� �̵��� ���� ������(=null ���̸�) / ���� ���� ���� ��� 
					return false;
			}
		
			if(start == last) { //�����ϴ� ��� - ��ü ��ü�� 1���� �� 
				start = last = null; // start .last ��  null�� �����.
				return true;
			}
			if(cur == start) { //����� ���� ��ü�� 0��°�϶� 
				start = start.getNext();
			}
			else if(cur == last) {
				last = pre;
				last.setNext(null);
			}
			else {
				pre.setNext(cur.getNext());
			}
			return true;	
}
		
		
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
