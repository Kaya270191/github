//p.418 ����7-7. HashMap�� ��ü ����, �л� ���� ���� 
//id�� tel�� �����Ǵ� Student Ŭ������ ����� �̸��� 'Ű', Student ��ü�� '��'���� �ϴ� �ؽø� �ۼ� 

import java.util.*;

class Student1{
	private int id; 
	private String tel;
	public Student1(int id, String tel) {//������
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		//�л� �̸�, Student ��ü�� �����ϴ� �ؽø� ����
		HashMap<String, Student1> map = new HashMap<String, Student1>();
		map.put("������", new Student1(1, "010-2222-2222")); //3���� �л� ���� (�̸�, ��ü)
		map.put("�Ʒ���", new Student1(2, "010-3333-3333"));
		map.put("�ط���", new Student1(3, "010-4444-4444"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻��� �̸�??");
			String name = scanner.nextLine(); //�Է��� �̸��� ����name �� ����
			if(name.equals("exit"))  //exit �Է��ϸ� ����
				System.out.println("����");
				break; 			
			Student1 student1 = map.get(name); // ���۷���map���� get() name �˻��� ���� StudentŸ���� ���� student �� ����  
			if(student1 == null) 
				System.out.println(name + "�� ���� ����Դϴ�");
			else
				System.out.println("id" + student1.getId() + ",��ȭ:" + student1.getTel());
		}scanner.close();
	}
}
