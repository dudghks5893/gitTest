package class_study;


class Order{
	//필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;
	
	//생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	//메소드
	public int totalprice() {
		// 모든 주문 메뉴의 총합을 반환하세요.
		int A = 0; // A값 초기화
		
		for (int i =0; i <menus.length; i++) {
			A += menus[i].price; //A에 메뉴 하나씩 더해가며 넣는다				
		}
		return A; // A를 반환
	}
}

class Menu{
	//필드
	String name;
	int price;
	//생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}

public class ex6 {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu teagsook = new Menu("탕수육", 13900);
		
		// 메뉴를 조합하여 주문을 생성
		Menu[]  menuArr = {jjajang, jjambbong, teagsook};
		Order order = new Order(123,menuArr);
		
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalprice());
		
	}
}
