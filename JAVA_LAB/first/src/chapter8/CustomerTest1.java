package chapter8;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		ArrayList<Customer> clist = new ArrayList<Customer>();
		
		clist.add(new Customer(10010,"�̼���"));
		clist.add(new Customer(10020,"�Ż��Ӵ�"));
		clist.add(new GoldCustomer(10030,"ȫ�浿"));
		clist.add(new GoldCustomer(10040,"������"));
		clist.add(new VIPCustomer(10050,"������",12345));
		
		System.out.println("====�������� ���====");
		for(Customer c : clist) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("====�������� ���ʽ� ����Ʈ ���====");
		int price = 10000;
		for(Customer c : clist) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"����"+cost+"�� �����߽��ϴ�.");
			System.out.println(c.getCustomerName()+"�� ����Ʈ��"+c.bonusPoint+"�� �Դϴ�.");
		}
	}

}