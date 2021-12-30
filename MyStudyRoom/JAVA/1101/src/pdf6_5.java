class Student1 { //student 클래스 선언 
	String name;
	int ban, no, kor, eng, math;

	public Student1(){ //student 클래스 생성자1
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
	
	Student1(String name, int ban, int no, int kor, int eng, int math){ //student 클래스 생성자2
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}
			
	int getTotal() { //국어 영어 수학 합계 함수 
		int total=0;
		total= kor+eng+math;
			return total; 
	}

	float getAverage() { //평균 함수 
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
		Student1 s = new Student1("홍길동",1,1,100,60,76); //객체 생성
		
		System.out.println(s.info());
			
		}

}