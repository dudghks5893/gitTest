package chapter9.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	// 템플릿 메소드 run이 Car 클래스를 상속받아서
	//추상 메소드를 구현하고 템플릿 메소드로 자동차의 전체 기능을 정의
	//final은 오버라이딩 불가
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
