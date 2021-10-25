package first;

public class ByteVariable {

	public static void main(String[] args) {
		byte bData = -128;
		System.out.println(bData); // -128
		
		byte bData2 = 127;
		System.out.println(bData2); // 127
		
		long num = 12345678900L; // long을 쓸 때 할당한 숫자 뒤에 L을 붙여준다. 컴파일러에게 long형을 쓰라고 알려주는 것 
		System.out.println(num); // 12345678900
		
		char ch = 'A';
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		char ch2 = 66;
		System.out.println((char)ch2); // B
		
		char ch3 = '한';
		System.out.println((int)ch3); // 54620
		
		char test = 97;
		System.out.println((char)test);
		
		// 실수 표기 방식 - 자바는 기본적으로 double형 사용
		// double형 : 총 64비트(8byte) 사용, float형 : 총 32비트(4byte) 사용
		double dnum = 3.14;
		float fnum = 3.14F; // double형이 아닌 float형으로 할당되면 식별자 F(또는 f)를 불여야 한다. (에러 : Type mismatch: cannot convert from double to float)
		System.out.println(dnum); // 3.14
		System.out.println(fnum); // 3.14
		
		double newNum = 10;
		System.out.println(newNum); // 10.0
		
		// 논리 자료형 -  boolean : 변수를 1byte로 저장 (true / false)
		boolean isMarried = true;
		System.out.println(isMarried); // true
		
		// Java10부터 var 사용
		var a = 10;
		var b = 10.4;
		var c = "Hello!";
		
		System.out.println(a); // 10
		System.out.println(b); // 10.4
		System.out.println(c); // Hello! 

		c = "Good Morning";
		System.out.println(c); // Good Morning
		
//		c = 12; // 에러 발생 : Type mismatch: cannot convert from int to String		
	}

}
