package chapter13.lambda.ex;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// CTR + SHIFT + O => 없는 클래스 불러오기
		List<Car> cars = Arrays.asList(
				new Car("현대","쏘나타", "레드", 3200 ),
				new Car("현대","뉴 투싼", "블랙", 3100 ),
				new Car("현대","아반떼", "블루", 2500 ),
				new Car("기아","카니발", "화이트", 5000 ),
				new Car("기아","쏘렌토", "블루", 3800 ),
				new Car("쉐보레","말리부", "블랙", 3000 ),
				new Car("쉐보레","스파크", "레드", 1200 ),
				new Car("르노삼성","QM6", "그레이", 3300 )				
				);
	//		showCarPriceRange(cars, 2700, 3300);
	//		showCarByColor(cars, "블루");
//		showCars(cars, new Condition() {			
//			@Override
//			public boolean test(Car c) {	
//				return 2700 <= c.getPrice() && c.getPrice() <= 3300;
//			}
//		});		// 익명클래스
		showCars(cars, (c) -> 2700 <= c.getPrice() && c.getPrice() <= 3300);
//		
//		showCars(cars, new Condition() {			
//			@Override
//			public boolean test(Car c) {	
//				return c.getColor() == "블루";
//			}
//		});		//	익명 클래스
		showCars(cars, (c) -> c.getColor() == "블루");
	}
	
	public static void showCars(List<Car> cars, Condition con) {
		for(Car c: cars) {
			if(con.test(c)) {
				c.printCar();
			}
		}
	}
	@FunctionalInterface
	interface Condition{
		public boolean test(Car c);
	}
	
//	public static void showCarPriceRange(List<Car> cars, int low, int high) {
//		for(Car c: cars) {
//			if(low <= c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//	
//	public static void showCarByColor(List<Car> cars, String color) {
//		for(Car c: cars) {
//			if(c.getColor() == color) {
//				c.printCar();
//			}
//		}
//	}
	
}
