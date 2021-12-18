package innerclass;


class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass; // InClass�� �ڷ������� ���� ����
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// ��� ������ ������ ��ġ�� ���� Ŭ���� ����
	// �ν��Ͻ� ���� Ŭ����
	class InClass {
		int inNum = 200;
		// ���� Ŭ������ �ܺ� Ŭ������ ���� ������ �ڿ� ���������.
		// ���� static���� ����� sInNum�� ����� �� ����.
//		static int sInNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		// static �޼��嵵 ��� �Ұ�
//		static void sTest() {
//		 }
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	// ���� ���� Ŭ����
	// outclass�� ������ ���� ���� �����ؼ� ��� ����
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		// �ܺ� Ŭ������ num�� �������� ���� ���¿����� inTest()�� ȣ��� �� �ִ�.
		// => �׷��� �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
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
		
		// outclass ���ο� �ִ� inclass ����
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}
}












