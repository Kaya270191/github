//�޼��� �ۼ��ϰ� �׽�Ʈ 
//�迭�� ��� ���� ��ġ�� �ٲٴ� �۾� �ݺ� 


public class pdf6_20 {
	
	public static int [] shuffle (int [] arr) { //int �� �迭 arr �迭�� ��� ���� ��ġ�� �ٲٴ� �۾� �ݺ�.		
		
		for(int i = 0; i < arr.length; i++ ) {
			int ri = (int)(Math.random()*arr.length);
			
			int temp= arr[i]; //�迭�� �ִ� ���� temp�� �ֱ� 
			arr[i]= arr[ri];
			arr[ri]= temp;
			}
		return arr;
		}		
	

public static void main(String[] args) { //���� �޼ҵ�
	int[] original = {1,2,3,4,5,6,7,8,9}; // �迭
	System.out.println(java.util.Arrays.toString(original));
		
	int[] result = shuffle (original);
	System.out.println(java.util.Arrays.toString(result));
		}
	}


