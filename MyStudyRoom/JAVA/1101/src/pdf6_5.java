class Student1 { //student Ŭ���� ���� 
	String name;
	int ban, no, kor, eng, math;

	public Student1(){ //student Ŭ���� ������1
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
	
	Student1(String name, int ban, int no, int kor, int eng, int math){ //student Ŭ���� ������2
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
			
	int getTotal() { //���� ���� ���� �հ� �Լ� 
		int total=0;
		total= kor+eng+math;
			return total; 
	}

	float getAverage() { //��� �Լ� 
		float Average = 0;
		Average = (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		return Average;		
	}
	String info(){
		return name+','+ban+','+ no +','+ kor +','+ eng +','+ math + ',' + getTotal()+','+getAverage();				 
	}	
}

public class pdf6_5 {
	public static void main(String[] args) {
		Student1 s = new Student1("ȫ�浿",1,1,100,60,76); //��ü ����
		
		System.out.println(s.info());
			
		}

}