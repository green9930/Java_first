package innerclass;


class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass; // InClass의 자료형으로 변수 선언
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 멤버 변수와 동일한 위치에 내부 클래스 생성
	// 인스턴스 내부 클래스
	class InClass {
		int inNum = 200;
		// 내부 클래스는 외부 클래스가 먼저 생성된 뒤에 만들어진다.
		// 따라서 static으로 선언된 sInNum은 사용할 수 없다.
//		static int sInNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		// static 메서드도 사용 불가
//		static void sTest() {
//		 }
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스
	// outclass의 생성과 관계 없이 생성해서 사용 가능
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		// 외부 클래스의 num이 생성되지 않은 상태에서도 inTest()가 호출될 수 있다.
		// => 그래서 외부 클래스의 인스턴스 변수는 사용할 수 없다.
		void inTest() {
//			num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.inClass.inTest();
		
		// outclass 내부에 있는 inclass 생성
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}
}












