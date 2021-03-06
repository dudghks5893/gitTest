package chapter9.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void startCar() {
		System.out.println("인공지능이");
		super.startCar();
	}

}
class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
	
}