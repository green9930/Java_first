package interfaceEx;

// 인터페이스 상속할 땐 implements
// 추상 메서드를 구현하지 않으면 오휴 표시 있음
// 이 클래스에서 모두 구현하지 않을 거라면 abstract 표시 필요 (추상 클래스)
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
