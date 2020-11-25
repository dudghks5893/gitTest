package chapter9;

//추상 클래스
public abstract class Computer {  //추상 메소드가 있으면 추상클래스가 되어야한다.
	public abstract void display();	//추상메소드 abstract 예약어 붙음
	public abstract void typing();
	public void turnOn() {
	System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		}
}