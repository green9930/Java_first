package first;

public class Constant {

	public static void main(String[] args) {

		// 상수는 final 예약어를 사용해 선언한다.
		// 관용적으로 상수는 대문자로 선언한다.
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
