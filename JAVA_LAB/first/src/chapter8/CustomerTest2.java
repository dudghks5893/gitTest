package chapter8;

public class CustomerTest2 {

	public static void main(String[] args) {	
		VIPCustomer kim = new VIPCustomer(10020,"������",77);
//		kim.setCustomerID(10020);
//		kim.setCustomerName("������");
//		kim.bonusPoint = 1000;
		System.out.println(kim.showCustomerInfo());
	}

}
