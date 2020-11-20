package cooperation;

public class Subway {
	//필드
	String linNumber;
	int passengerCount;
	int money;
	
	//생성자
	public Subway(String linNumber) {
		this.linNumber = linNumber;
	}
	//메소드 : 승객이 버스를 탔음 수입증가, 승객수 증가
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//메소드 정보를 나타냄
	public void showInfo() {
		System.out.printf("지하철%s의 승객은 %d명이고, 수입은 %d원 입니다. \n",linNumber,passengerCount,money);
	}
}
