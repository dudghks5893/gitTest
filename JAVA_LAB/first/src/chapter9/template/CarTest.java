package chapter9.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===자율 주행하는 자동차===");
		Car myCar = new AICar(); //AICar 객체생성
		myCar.run();			//템플릿 메소드 실행
	
	System.out.println("===사람이 운전하는 자동차===");
	Car hisCar = new ManualCar();	//매뉴얼카 객체생성
	hisCar.run();					//템플릿 메소드 실행
	}
}
