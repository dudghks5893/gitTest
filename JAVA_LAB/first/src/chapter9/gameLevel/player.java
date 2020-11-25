package chapter9.gameLevel;

public class player {
	private PlayerLevel level; //�÷��̾ ������ level ����
	
	//�÷��̾� ������: ó�� ���鶧 ���ʷ� ����
	public player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	// ���� ������ ����
	public PlayerLevel getLevel() {
		return level;
	}
	// �� ������ ���׷��̵�
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	// ���ø� �޼ҵ� go ���� ( ���� �������� �ٸ�)
	public void play(int count) {
		level.go(count);
	}
}
