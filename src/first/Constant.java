package first;

public class Constant {

	public static void main(String[] args) {

		// ����� final ���� ����� �����Ѵ�.
		// ���������� ����� �빮�ڷ� �����Ѵ�.
		final int MAX_NUM = 100;
		final double PI = 3.14;
		final var TEXT = "Hello";
		
//		TEXT = "blabla"; // The final local variable TEXT cannot be assigned. It must be blank and not using a compound assignment
		
		final int STUDENT_NUM = 30;
		int num = 30;
		if (num == STUDENT_NUM) {
			System.out.println(num + 1); // 31
		}
	}

}
