package gameLevel;

public class SuperLevel extends PlayerLevel	{
	@Override
	public void run() {
		System.out.println("���� ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump�� �� �ֽ��ϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� turn�� �� �ֽ��ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("����� �����Դϴ�.");
	}
}
