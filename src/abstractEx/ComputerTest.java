package abstractEx;

public class ComputerTest {
	public static void main(String[] args) {
		// Computer Ŭ������ �߻� Ŭ�����̱� ������ ���� �߻�
		// �߻� Ŭ������ �ν��Ͻ�ȭ �� �� ����
		Computer c1 = new Computer();
		// ��ĳ�������� ��� ����
		Computer c2 = new Desktop();
		// Notebook Ŭ������ �߻� Ŭ�����̹Ƿ� ���� �߻�
		Computer c3 = new Notebook();
		
		// ���� Ŭ������ Comuter�̱� ������ Computer�̳� Notebook Ÿ������ ���� ����
		// ��, �� ��� Notebook Ŭ������ ����� aaa �޼���� �� �� ����
		Computer c4 = new MyNotebook();
		
		// Computer���� ������ Desktop/Notebook  Ŭ������ display() �޼��尡 �����Ǿ� �ִ�.
		c2.display();
		c4.display();
	}
}
