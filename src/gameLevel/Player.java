package gameLevel;

public class Player {
	private PlayerLevel level;

	public Player() {
		// 레벨 초기화
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level; 
	}

	// 매개변수로 AdvancedLevel이나 SuperLevel이 들어와야 하므로 싱위클래스를 매개변수로 받는다
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int Count)	{
		level.go(Count);
	}
	
}
