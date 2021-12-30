
public class p118_ForSample {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) { //1.i=초기값, 2.i가 10보다 작을 때까지 반복, 4. i를 1씩 증가, 다시 2번으로 돌아가 반복
			sum +=i; //3. sum=sum+i
			System.out.print(i); //i가 10이 되면 중단하고 i값들을 프린트 
			if(i<=9) //만약 i가 9보다 작거나 같으면 
				System.out.print("+"); //+를 프린트 
			else { //그렇지 않으면 , i가 10이상이면 
				System.out.print("="); //=  을 프린트하고 
				System.out.print(sum); //sum을 프린트 
			}
		}

	}

}
