package chapter9;

//�߻� Ŭ����
public abstract class Computer {  //�߻� �޼ҵ尡 ������ �߻�Ŭ������ �Ǿ���Ѵ�.
	public abstract void display();	//�߻�޼ҵ� abstract ����� ����
	public abstract void typing();
	public void turnOn() {
	System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
		}
}