package chapter6.q5;

public class CoffeeTest {

	public static void main(String[] args) {
		//김씨와 이씨 객체 생성 money는 만원 초기화
		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 10000);
		// 별다방, 콩다방 객체 생성
		StarCoffee s = new StarCoffee();
		BeanCoffee b = new BeanCoffee();
		
		// 김씨는 별다방 4000원 메뉴
		kim.buyStarCoffee(s, 4000);
		// 이씨는 별다방 4500원 메뉴
		lee.buyBeanCoffee(b, 4500);

	}
}
