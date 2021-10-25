package first;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011;
		
		int sum = num1 + num2;
		System.out.println(sum); // 0
		System.out.println(num1); // 5
		System.out.println(num2); // -5
	}

}
