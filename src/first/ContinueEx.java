package first;

public class ContinueEx {

	public static void main(String[] args) {
	 	int total = 0;
	 	int num;
	 	
	 	for(num = 1; num <= 100; num++) {
	 		if ((num % 2) == 1) {
	 			continue; // num���� Ȧ���� ��� ���� ������ �����ϰ� num++ ����
	 		}
	 		total += num; // num���� ¦���� ��� ����
	 	}
	 	System.out.println(total); // 2550
	}

}
