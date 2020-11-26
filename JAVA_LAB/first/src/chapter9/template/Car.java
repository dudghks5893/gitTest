package chapter9.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	// ���ø� �޼ҵ� run�� Car Ŭ������ ��ӹ޾Ƽ�
	//�߻� �޼ҵ带 �����ϰ� ���ø� �޼ҵ�� �ڵ����� ��ü ����� ����
	//final�� �������̵� �Ұ�
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}