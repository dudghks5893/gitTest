package chapter8;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer lee = new Customer(10010,"�̼���");
		lee.bonusPoint = 1000;
		
		VIPCustomer kim = new VIPCustomer(10020,"������",12345);
		kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(lee.getCustomerName()+"�� ���ұݾ�:"+lee.calcPrice(price));
		System.out.println(kim.getCustomerName()+"�� ���ұݾ�:"+kim.calcPrice(price));
	}

}
