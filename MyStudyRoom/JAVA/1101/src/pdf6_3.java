//6-3

class Student { //student class ���� 
	String name;
	int ban, no, kor, eng, math;

	Student(){ //student Ŭ���� 
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
	
	int getTotal() { //���� ���� ���� �հ� �Լ� 
		int total=0; //==return kor+eng+math;
		total=kor+eng+math;
			return total; 
		}

	float getAverage() { //��� �Լ� 
		float Average = 0;  //= ==return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		Average = (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		return Average;		
		}
}


public class pdf6_3 {
	public static void main(String[] args) {
		Student s = new Student(); //��ü ����
		s.name ="ȫ�浿";
		s.ban = 1;
		s.kor = 100;
		s.eng = 60;
		s.math =76;
		
		System.out.println("�̸�:" + s.name);
		System.out.println("����:" + s.getTotal());
		System.out.println("���:" + s.getAverage());

		}

}

