package chapter6;

//변수
class Birthday{
	int day;
	int	month;
	int year;
	
//메소드
	public void setYear(int year) {
		this.year = year;  //년도를 입력
	}
	public void printThis() {
		System.out.println(this); //this를 출력
	}
}

public class thisExample {

	public static void main(String[] args) {
		Birthday myDay = new Birthday(); //객체 생성
		myDay.setYear(2000); // 년도 입력 (this==myDay)
		System.out.println(myDay);
		myDay.printThis();

		
		Birthday yourDay = new Birthday(); //객체 생성
		myDay.setYear(2000); // 년도 입력 (this==yourDay)
		System.out.println(yourDay);
		myDay.printThis();

	}

}
