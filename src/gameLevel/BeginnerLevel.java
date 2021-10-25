package gameLevel;

// Player에서 PlayerLevel 생성자로 생성된 인스턴스에서 파생되어 클래스를 만들었기 때문에 자동으로 extends가 붙는다.
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump할 수 없습니다.");

	}

	@Override
	public void turn() {
		System.out.println("turn할 수 없습니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자 레벨입니다.");

	}

}
