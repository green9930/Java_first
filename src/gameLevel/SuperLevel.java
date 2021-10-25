package gameLevel;

public class SuperLevel extends PlayerLevel	{
	@Override
	public void run() {
		System.out.println("가장 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("가장 높이 jump할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("빨리 turn할 수 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("상급자 레벨입니다.");
	}
}
