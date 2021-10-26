package interfaceEx;

public class CompleteCalc extends Calculator{

	@Override 
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num2 != 0 ? num1 / num2 : ERROR;
	}

	@Override
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기입니다.");
	}

	
}
