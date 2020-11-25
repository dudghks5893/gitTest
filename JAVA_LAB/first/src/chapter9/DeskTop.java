package chapter9;

//추상 클래스를 상속받으면 그 안의 추상메소드가 있으면 꼭 구현해야된다.
public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("디스플레이 구현");
	}

	@Override
	public void typing() {
		System.out.println("타이핑 구현");
	}
	
}
