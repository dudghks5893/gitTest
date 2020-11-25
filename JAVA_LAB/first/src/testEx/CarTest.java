package testEx;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carlist = new ArrayList<Car>();
		carlist.add(new Sonata("소나타"));
		carlist.add(new Grandeur("그렌저"));
		carlist.add(new Avante("아반테"));
		carlist.add(new Genesis("제네시스"));
		
		for(Car car : carlist) {
			car.run();
			System.out.println("=================");
		}
	}

}

