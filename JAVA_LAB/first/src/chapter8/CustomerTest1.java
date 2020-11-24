package chapter8;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		ArrayList<Customer> clist = new ArrayList<Customer>();
		
		clist.add(new Customer(10010,"이순신"));
		clist.add(new Customer(10020,"신사임당"));
		clist.add(new GoldCustomer(10030,"홍길동"));
		clist.add(new GoldCustomer(10040,"이율곡"));
		clist.add(new VIPCustomer(10050,"김유신",12345));
		
		System.out.println("====고객정보 출력====");
		for(Customer c : clist) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("====할인율과 보너스 포인트 계산====");
		int price = 10000;
		for(Customer c : clist) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"님이"+cost+"원 지불했습니다.");
			System.out.println(c.getCustomerName()+"님 포인트는"+c.bonusPoint+"점 입니다.");
		}
	}

}
