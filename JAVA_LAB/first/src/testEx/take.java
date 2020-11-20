package testEx;

public class take {
	public String name;
	public int mony;
	
	public take (String name,int mony) {
		this.name = name;
		this.mony = mony;
	}
	//star 다방 아메리카노 주문
	public void AA(star star) {
		star.take(4000);
		this.mony -= 4000;
	}
	//star 다방 카라멜마끼아또 주문
	public void karamall(star star) {
		star.take(5000);
		this.mony -= 5000;
	}
	//kong 다방 라떼 주문
	public void rata(kong kong) {
		kong.take(4500);
		this.mony -= 4500;
	}
	public void show() {
		System.out.printf("%s님 남은 잔고는 %d원 입니다.\n",name,mony);
	}
}
