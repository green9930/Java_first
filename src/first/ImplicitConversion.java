package first;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = bNum + lNum;
		System.out.println(dNum);
		
		// 명시적 형 변환
		// 바이트 크기가 큰 자료형에서 작은 자료형으로 할당하는 경우 자료 손실이 발생할 수 있기 때문에 변환할 자료형을 명시적으로 표기해야 한다.
		int iNum = 10;
		byte byteNum = (byte)iNum;
		
		System.out.println(byteNum); // 10
		
		double dNum2 = 3.14;
		int iNum2 = (int)dNum2;
		
		System.out.println(iNum2); // 3 : 정수형으로 바뀌면서 소수점 생략
		
		// 예제 : 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력하시오.
		int a = 10;
		double b = 2.0;
		
		System.out.println(a+(int)b); // 12
		
		// 예제 : '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하시오
		int c = (int)'글';
		char d = (char)c;
		
		System.out.println(c); // 44544
		System.out.println(d); // 글
	}

}
