//메서드 정의 


public class pdf6_23 {
	
	public static int max (int [] data) {
		
		if(data ==null||data.length==0) {
			return -999999;
		}
			
		int maxvalue = data[0];		
		for (int i =0; i < 5 ; i++) {
			if (data[i] > maxvalue) {
				maxvalue = data[i];			
			}
		}
		return maxvalue;
		
		
			}
		
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {})); //크기가 0인 배열
	}

}
