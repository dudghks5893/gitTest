package chapter9.gameLevel;
//플레이어레벨 추상 클래스를 상속받는 하위 클래스(초급,중급,고급)들은 4개의 추상 메소드를 구현해야된다. 
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {	//템플릿 메소드
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
//초급 클래스
class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump할줄 모르지롱");
	}

	@Override
	public void turn() {
		System.out.println("Tunr할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====초보자 레벨입니다.=====");
	}
	
}
//중급 클래스
class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Tunr할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====중급자 레벨입니다.=====");
	}
	
}
//고급 클래스
class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 Jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====고급자 레벨입니다.=====");
	}
	
}