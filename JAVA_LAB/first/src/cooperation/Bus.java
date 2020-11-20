package cooperation;

public class Bus {
	//필드
	int busNumber;
	int passengerCount;
	int money;
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	//메소드 : 승객이 버스를 탔음 수입증가, 승객수 증가
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//메소드 정보를 나타냄
	public void showInfo() {
		System.out.println("버스"+ busNumber + "번의 승객은" + passengerCount + 
				"명이고,수입은" +money+"입니다.");
	}
	
	
}
