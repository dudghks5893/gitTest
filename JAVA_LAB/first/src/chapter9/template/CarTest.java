package chapter9.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===���� �����ϴ� �ڵ���===");
		Car myCar = new AICar(); //AICar ��ü����
		myCar.run();			//���ø� �޼ҵ� ����
	
	System.out.println("===����� �����ϴ� �ڵ���===");
	Car hisCar = new ManualCar();	//�Ŵ���ī ��ü����
	hisCar.run();					//���ø� �޼ҵ� ����
	}
}
