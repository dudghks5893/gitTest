package chapter6.q5;
	// 별 다방 까페
public class StarCoffee {

	int money;
	
	//메소드 : 돈내고 가격에 맞는 커피를 사먹는
	public String brewing(int money) {
		
		String msg = "";
		if(money == Menu.S_AMERICANO) {
			msg = "별 다방 아메리카노를 구입했습니다";
		}
		else if(money == Menu.S_LATTE) {
			msg = "별 다방 라떼를 구입했습니다";
		}
		else { return "메뉴에 없네요!"; }
		
		this.money += money;
	
		return msg;
	}
}
