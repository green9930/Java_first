package interfaceEx;

// �������̽� ����� �� implements
// �߻� �޼��带 �������� ������ ���� ǥ�� ����
// �� Ŭ�������� ��� �������� ���� �Ŷ�� abstract ǥ�� �ʿ� (�߻� Ŭ����)
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
