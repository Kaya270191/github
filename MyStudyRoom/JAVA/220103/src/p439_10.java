import java.util.Scanner;
import java.util.Vector;

abstract class Shape{ //�߻� Ŭ����
	private Shape next;
	public Shape() {//������ 
		next =null;
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw(); //�߻�޼��� 
}

class Line extends Shape{ //�߻� Ŭ���� ��ӹ��� Line Ŭ����
	public void draw() {
		System.out.println("Line");
	}
}

class Rect  extends Shape{ //�߻� Ŭ���� ��ӹ��� Rect Ŭ����
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{ //�߻�Ŭ���� ��ӹ��� Circle Ŭ���� 
	public void draw() {
		System.out.println("Circle");
	}
}

public class p439_10 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>(); //���ͻ���
		Shape shape= null; //Shape ���۷��� �ʱ�ȭ
		
		System.out.println("�׷��� ������ beauty �� �����մϴ�.");
		while(true) {
			System.out.println("����(1), ����(2), ��κ���(3), ����(4)>>");
			int num = S.nextInt(); //�Է¹��� ���� 
			
			switch(num){
			case 1 : 
				System.out.println("Line(1), Rect(2), Circle(3)>>");
				int num2 = S.nextInt(); //�߰��� ���� ��ȣ �Է�
				switch(num2) {	
					case 1:
						shape = new Line(); //��ĳ����  Shape shape = new Line();
						break;
					case 2:
						shape = new Rect(); //��ĳ����
						break;
					case 3:
						shape = new Circle(); //��ĳ���� 
						break;
				}
				v.add(shape); //���Ϳ� ������ ShapeŬ������ ��ü�� �߰� 
				break;
			case 2 : //���� 
				System.out.println("������ ������ ��ġ");
				int position = S.nextInt();//�����ϰ��� �ϴ� ��ġ
				if(v.size() == 0 || v.size() <= position) { //������ ũ�Ⱑ 0�̰ų� �Է°����� ������
					System.out.println("������ �� �����ϴ�."); //���� �Ұ� 
				}
				else {
					v.remove(position);	//�Է¹��� ��ġ�� ���Ͱ� ���� 
					break;
				}
			case 3 : //��� ����
				for(int i=0; i<v.size(); i++) //���� �����ŭ �ݺ�
					v.get(i).draw(); //draw�Լ� ȣ��
					break;
			case 4 :
				System.out.println("beauty�� �����մϴ�.");
				S.close();
				return;
			}
		}
	}
}