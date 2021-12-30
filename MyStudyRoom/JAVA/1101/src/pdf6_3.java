//6-3

class Student { //student class 선언 
	String name;
	int ban, no, kor, eng, math;

	Student(){ //student 클래스 
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
	
	int getTotal() { //국어 영어 수학 합계 함수 
		int total=0; //==return kor+eng+math;
		total=kor+eng+math;
			return total; 
		}

	float getAverage() { //평균 함수 
		float Average = 0;  //= ==return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		Average = (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		return Average;		
		}
}


public class pdf6_3 {
	public static void main(String[] args) {
		Student s = new Student(); //객체 생성
		s.name ="홍길동";
		s.ban = 1;
		s.kor = 100;
		s.eng = 60;
		s.math =76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());

		}

}

