package testEx;

public abstract class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	public void washCar() {	//�������̱� ������ �߻�Ŭ�������� �ѹ��� ����
		System.out.println("������ �մϴ�");
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
		System.out.println(name+" �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name+" ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" �õ��� ���ϴ�.");
	}
	
}
class Grandeur extends Car{

	public Grandeur(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name+" ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" �õ��� ���ϴ�.");
	}
	
}
class Avante extends Car{

	public Avante(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name+" ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" �õ��� ���ϴ�.");
	}
	
}
class Genesis extends Car{

	public Genesis(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name+" �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name+" ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println(name+" �õ��� ���ϴ�.");
	}
	
}