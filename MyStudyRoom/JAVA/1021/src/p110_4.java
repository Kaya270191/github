import java.util.Scanner;
public class p110_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int max, mid, min;
		int temp;
		
		max=s.nextInt();
		mid=s.nextInt();
		min=s.nextInt();
		
		if(max < mid) {
			temp = max;
			max = mid;
			mid = temp;
			
		}
		
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
			
		}
		
		if (mid < min) {
			temp= mid;
			mid = min;
			min = temp;
		}
		
		System.out.println(max+ " " + mid + " " + min);

	}

}
