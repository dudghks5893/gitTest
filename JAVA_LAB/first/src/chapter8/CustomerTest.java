package chapter8;

public class CustomerTest {

	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerID(10010);
		lee.setCustomerName("�̼���");
		lee.bonusPoint = 1000;
		System.out.println(lee.showCustomerInfo());
		
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerID(10020);
		kim.setCustomerName("������");
		kim.bonusPoint = 1000;
		System.out.println(kim.showCustomerInfo());
	}

}
