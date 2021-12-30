//pdf7-18
//�޼����: action
//�־��� ��ü �޼��� ȣ��
//DanceRobot�� ���, dance()ȣ�� . SingRobot�� ��� Sing()ȣ��. DrawRobot�� ��� draw()ȣ��
//��ȯŸ��: ����
//Robot r - Robot�ν��Ͻ� �Ǵ� Robot�� �ڼ� �ν��Ͻ� 

class Robot{}

class DanceRobot extends Robot{ //Robot�� ��ӹ��� DanceRobot
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot{ //Robot�� ��ӹ��� SingRobot
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot{  //Robot�� ��ӹ��� DrawRobot
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}


public class pdf7_18 {
	static void action(Robot r){ //instanceof �� �κ�r�� Ÿ���� �������� Ȯ�� 
		if(r instanceof DanceRobot) { //r �� DanceRobot�̸�  
			((DanceRobot) r).dance(); // ���۷��� r �� DanceRobot Ÿ���� dance() �Լ� ȣ�� 
		}
		else if (r instanceof SingRobot) { //r �� SingRobot�̸�  
			((SingRobot) r).sing(); // ���۷��� r �� SingRobot Ÿ���� sing() �Լ� ȣ�� 
		}
		else if (r instanceof DrawRobot) { //r �� DrawRobot�̸�  
			((DrawRobot) r).draw(); //���۷��� r�� DrawRobot Ÿ���� draw()�Լ� ȣ�� 
		}
	}

	public static void main(String[] args) {
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		//Robot Ŭ������ ���۷���arr �迭 ����.
		for(int i =0; i<arr.length; i++) 
			action(arr[i]);
	}
}
