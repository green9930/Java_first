package abstractEx;

// �߻� �޼��尡 ������ Ŭ������ abstract ����
public abstract class Computer {
	// display �޼��带 �������� �ʰ� ����
	// �����ڵ�{}�� ������ �߻� �޼���
//	public void display();
	public abstract void display();
	// ������ ��� �����ڵ尡 ������ �߻��ڵ尡 �ƴϴ�.
//	public void typing() {};
	public abstract void typing();
	 
	public int add(int x, int y) {
		return x + y;
	}
	
	public void turnOn() {
		System.out.println("õ���� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
