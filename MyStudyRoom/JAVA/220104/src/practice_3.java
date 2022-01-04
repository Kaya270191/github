
public class practice_3 {
	//getMember()메소드의 리턴값은 문자열을 담을 수 있는 배열이다
	public static String[]  getMembers() {
		String[] members = {"kaya", "yuri","amy"};
		return members;
	}
	//
	public static void main(String[] args) {
		//getMembers()메소드 호출하고 리턴받은 값을 문자열담을 수 있는 배열로 저장.
		String[] members = getMembers();
	}
}
