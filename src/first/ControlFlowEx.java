package first;

public class ControlFlowEx {

	public static void main(String[] args) {		
		// �����ܿ��� ¦�� �ܸ� ����ϱ�
		int times;
		
		for(int i = 1; i <= 9; i++) {
			if(i % 2 != 0) continue;
			for (times = 1; times <= 9; times++) {
				System.out.println(i + "X" + times + "=" + i * times);
			}
			System.out.println();
		}
		
		// �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ������ �����
		for (int i = 1; i <= 9; i++) {
			for (times = 1; times <= i; times++) {
				System.out.println(i + "X" + times + "=" + i * times);
			}
			System.out.println();
		}
		
		// for������ ũ�������� Ʈ�� ����� (4��)
		
		int line1 = 4;
		
		for(int i = 1; i <= line1; i++) {
			for(int j = 1; j <= line1 - i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i*2 - 1; j++) {
				System.out.print('*');
			}
			for(int j = 1; j <= line1; j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}

}
