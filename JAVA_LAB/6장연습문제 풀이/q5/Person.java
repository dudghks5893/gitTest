package chapter6.q5;

public class Person {
	//필드
	String name;
	int money;
	//생성자
	Person(String name, int money ){
		this.name = name;
		this.money = money;
	}
	
	// 별다방 커피를 사먹는다. ( 별다방 객체 , money )
	public void buyStarCoffee(StarCoffee s, int money) {
		String msg = s.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money +"으로 "  + msg);
		}
	}
	// 콩다방 커피를 사먹는다.
	public void buyBeanCoffee(BeanCoffee b, int money) {
		String msg = b.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money +"으로 "  + msg);
		}
	}
}
