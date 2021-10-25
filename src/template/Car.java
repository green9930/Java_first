package template;

public abstract class Car {
	
	// ���� �޸��� ���ߴ� ����� ���� ������ ���� �ٸ��� ������ Car Ŭ�������� ������ �� ����
	// �߻� Ŭ����
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();

	// �߻� Ŭ������ �ƴϱ� ������ ManualCar, AICar���� �������� �ʾƵ� ������ �߻����� �ʴ´�.
	// �ʿ信 ���� ������ �� �� ��� (�����Ǵ� �ʼ� �ƴ�) 
	public void washCar() {	};
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	// Car�� �ó������� ������ ������ (�ó������� �ٲ�� �ȵǴϱ� final ����)
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
