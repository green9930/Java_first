package first;

public class ByteVariable {

	public static void main(String[] args) {
		byte bData = -128;
		System.out.println(bData); // -128
		
		byte bData2 = 127;
		System.out.println(bData2); // 127
		
		long num = 12345678900L; // long�� �� �� �Ҵ��� ���� �ڿ� L�� �ٿ��ش�. �����Ϸ����� long���� ����� �˷��ִ� �� 
		System.out.println(num); // 12345678900
		
		char ch = 'A';
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		char ch2 = 66;
		System.out.println((char)ch2); // B
		
		char ch3 = '��';
		System.out.println((int)ch3); // 54620
		
		char test = 97;
		System.out.println((char)test);
		
		// �Ǽ� ǥ�� ��� - �ڹٴ� �⺻������ double�� ���
		// double�� : �� 64��Ʈ(8byte) ���, float�� : �� 32��Ʈ(4byte) ���
		double dnum = 3.14;
		float fnum = 3.14F; // double���� �ƴ� float������ �Ҵ�Ǹ� �ĺ��� F(�Ǵ� f)�� �ҿ��� �Ѵ�. (���� : Type mismatch: cannot convert from double to float)
		System.out.println(dnum); // 3.14
		System.out.println(fnum); // 3.14
		
		double newNum = 10;
		System.out.println(newNum); // 10.0
		
		// �� �ڷ��� -  boolean : ������ 1byte�� ���� (true / false)
		boolean isMarried = true;
		System.out.println(isMarried); // true
		
		// Java10���� var ���
		var a = 10;
		var b = 10.4;
		var c = "Hello!";
		
		System.out.println(a); // 10
		System.out.println(b); // 10.4
		System.out.println(c); // Hello! 

		c = "Good Morning";
		System.out.println(c); // Good Morning
		
//		c = 12; // ���� �߻� : Type mismatch: cannot convert from int to String		
	}

}
