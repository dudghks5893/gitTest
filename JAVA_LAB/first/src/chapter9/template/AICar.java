package chapter9.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void startCar() {
		System.out.println("�ΰ�������");
		super.startCar();
	}

}
class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}
	
}