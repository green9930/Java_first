package gameLevel;

public class Player {
	private PlayerLevel level;

	public Player() {
		// ���� �ʱ�ȭ
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level; 
	}

	// �Ű������� AdvancedLevel�̳� SuperLevel�� ���;� �ϹǷ� ����Ŭ������ �Ű������� �޴´�
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int Count)	{
		level.go(Count);
	}
	
}
