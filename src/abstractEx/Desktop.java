package abstractEx;

// Computer ���
// 1. �߻� �޼��带 �����ϰų�
// 2. �ƴϸ� Desktop�� abstract�� �����ؾ� �Ѵ�.
public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
	}
	
	// �̹� ���� Ŭ�������� ���ǵ� �޼��嵵 �ʿ信 ���� ���� Ŭ�������� �������Ͽ� ����� �� �ִ�.
	public void turnOn() {
		System.out.println("Desktop turnOn");
	}
	
}
