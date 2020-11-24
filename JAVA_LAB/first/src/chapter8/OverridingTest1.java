package chapter8;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer lee = new Customer(10010,"이순신");
		lee.bonusPoint = 1000;
		
		VIPCustomer kim = new VIPCustomer(10020,"김유신",12345);
		kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(lee.getCustomerName()+"님 지불금액:"+lee.calcPrice(price));
		System.out.println(kim.getCustomerName()+"님 지불금액:"+kim.calcPrice(price));
	}

}
