package class_study;


class Order{
	//�ʵ�(�ν��Ͻ� �ʵ�)
	int orderNum;
	Menu[] menus;
	
	//������
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	//�޼ҵ�
	public int totalprice() {
		// ��� �ֹ� �޴��� ������ ��ȯ�ϼ���.
		int A = 0;
		
		for (int i =0; i <menus.length; i++) {
			A += menus[i].price;				
		}
		return A;
	}
}

class Menu{
	//�ʵ�
	String name;
	int price;
	//������
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}

public class ex6 {
	public static void main(String[] args) {
		// �ֹ��� ���� �޴� ����
		Menu jjajang = new Menu("¥��", 4900);
		Menu jjambbong = new Menu("«��", 5900);
		Menu teagsook = new Menu("������", 13900);
		
		// �޴��� �����Ͽ� �ֹ��� ����
		Menu[]  menuArr = {jjajang, jjambbong, teagsook};
		Order order = new Order(123,menuArr);
		
		// �ֹ� ��� ���
		System.out.printf("�ֹ� �հ�: %d��\n", order.totalprice());
		
	}
}
