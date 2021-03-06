package cooperation;

public class Student {
	//필드
	public String studentName;
	public int grade;
	public int money;
	public int fare;
	//생성자  자동으로 생성-Source->Generate Constructor using FIelds
	public Student(String studentName,int money) {
//		super();  알필요 없는거라 삭제 
		this.studentName = studentName;
//		this.grade = grade; 
		this.money = money;
	}
	
	//메소드: 버스를 타고 1000원을 지급한다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//메소드: 지하철을 타고 1500원을 지급한다.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	//메소드: 텍시를 탄다. 돈은 fare
	public void takeTaxi(Taxi taxi, int fare) {
		taxi.take(fare);
		this.money -= fare;
	}
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은"+ money +"입니다.");
	}
}
