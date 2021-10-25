package gameLevel;

// MainBoard의 AdvancedLevel() 생성자에서 바로 클래스를 만들었기 때문에 명시적으로 extends가 붙지 않는다. 
// BeginnerLevel과 비교
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn할 수 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자 레벨입니다.");
	}
	
}
