package testEx;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carlist = new ArrayList<Car>();
		carlist.add(new Sonata("�ҳ�Ÿ"));
		carlist.add(new Grandeur("�׷���"));
		carlist.add(new Avante("�ƹ���"));
		carlist.add(new Genesis("���׽ý�"));
		
		for(Car car : carlist) {
			car.run();
			System.out.println("=================");
		}
	}

}
