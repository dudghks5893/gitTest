package class_study;

class Food2{
	String name;
	int price;
	
	Food2(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String A() {
		String str = "Food{name: " + this.name + ", price: " + this.price + "원}";
		return str;
	}
}

public class ex123 {

	public static void main(String[] args) {
		// 음식 객체 생성
		Food2 chicken = new Food2("치킨",18000);
		Food2 pizza = new Food2("피자",28000);
		Food2 sushi = new Food2("초밥세트",22000);
		
		//객체 배열에 음식 담기
		Food2[] foods = {chicken, pizza, sushi};
		
		//모든 음식 정보 출력
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].A());
		}

	}

}
