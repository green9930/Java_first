package first;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		// for���� while������ ������ �����
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); // ���� �뵵
		}
		
		dan = 2;
//		times = 1;
		
		while(dan <= 9) {
			times = 1; // ���� �ݺ����� �����ϱ� ���� ���ο��� �ʱ�ȭ�� �ؾ� �Ѵ�.
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();

			
		}
	}

}
