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
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����߽��ϴ�.");
	}

	@Override
	public int square(int num) {
		return num * num;
	}
	
}
