
import java.util.Scanner;
public class Rectangle0104 {//Rectangle0104 Ŭ����
	
	int width; //������ ��� width
	int height; //������ ��� height
	public int getArea() { //������ ���ϰ����� ������ getArea()�Լ� 
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle0104 Rec = new Rectangle0104();//���۷��� ���� �� �ν��Ͻ� ����
		Scanner S = new Scanner(System.in); //��ĳ�� ����
		System.out.println(">>");
		Rec.width =S.nextInt(); //��ĳ�ʷ� �Է¹��� ���� ��ü�� ��� width�� ����
		Rec.height = S.nextInt(); //��ĳ�ʷ� �Է¹��� ���� ��ü�� ��� height�� ����
		System.out.println("�簢���� ������" + Rec.getArea()); //��ü�� getArea()�Լ� ȣ���ؼ� ���� ���� ���� ����
		S.close();
		

	}

}
