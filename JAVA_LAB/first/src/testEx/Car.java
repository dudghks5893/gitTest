package testEx;

public abstract class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	public void washCar() {	//공통적이기 때문에 추상클래스에서 한번만 구현
		System.out.println("세차를 합니다");
	}
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}

class Sonata extends Car{
	
	public Sonata(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" 시동을 끕니다.");
	}
	
}
class Grandeur extends Car{

	public Grandeur(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" 시동을 끕니다.");
	}
	
}
class Avante extends Car{

	public Avante(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" 시동을 끕니다.");
	}
	
}
class Genesis extends Car{

	public Genesis(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" 시동을 끕니다.");
	}
	
}