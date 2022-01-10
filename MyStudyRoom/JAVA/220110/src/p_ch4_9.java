//4-9
//가비지의 발생 

public class p_ch4_9 {

	public static void main(String[] args) {
		String a = new String("good"); //객체 생성
		String b = new String("bad"); //객체 생성
		String c = new String("normal"); //객체 생성 
		String d,e;
		a = null; //레퍼런스 a 가 가리키는 게 없음 - good이 가비지가 됨! 데이터만 가비지가 됨
		d =c; //d는 c를 가리킴
		c= null; //c는 가리키는 게 없음 
	}
}
