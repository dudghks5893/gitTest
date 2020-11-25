package chapter9.gameLevel;

public class player {
	private PlayerLevel level; //플레이어가 가지는 level 변수
	
	//플레이어 생성자: 처음 만들때 비기너로 시작
	public player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	// 현재 레벨을 리턴
	public PlayerLevel getLevel() {
		return level;
	}
	// 내 레벨을 업그레이드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	// 템플릿 메소드 go 실행 ( 현재 레벨별로 다름)
	public void play(int count) {
		level.go(count);
	}
}
