package chapter10.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cs = new Customer();
		
		Buy bu = cs;
		bu.buy();
		bu.order();
		
		Sell sl = cs;
		sl.sell();
		sl.order();
		
		if(sl instanceof Customer) {
			Customer cs2 = (Customer)sl;
			cs2.buy();
			cs2.sell();
		}
		cs.order();
		
	}

}
