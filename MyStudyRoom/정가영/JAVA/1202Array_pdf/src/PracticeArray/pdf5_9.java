//5-9 �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷�

package PracticeArray;

public class pdf5_9 {

	public static void main(String[] args) {
		char[][] star= {
				{'*','*',' ', ' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*',},
				{'*','*','*','*','*',}};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i =0; i<star.length;i++) {
			for(int j=0; j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
				
	
		int y;
		for(int i=0; i<star.length; i++) { //result[] ����� 
			
			for(int j=0; j<(star[i].length); j++) {
				
				//x = j; 
				y = star.length-1-i; //33333,22222,11111,00000
				result[j][y] = star[i][j];
				System.out.print(j);
				System.out.println(y);
			}
		}		
		
		for(int i=0; i< result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}		
	}
}
