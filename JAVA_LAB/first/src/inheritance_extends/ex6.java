package inheritance_extends;

public class ex6 {
public static void main(String[] args) {
	
	
	Taxi taxi = new Taxi();
	
	taxi.start();
	taxi.stop(2500);
	
	}
	
}


interface Meter {
	public int BASE_FARE = 3000; //�⺻���(�������̽��� ������ ������ ����� ������ �� ����)
	public abstract void start();
	public abstract void stop(int distance);
}

class Taxi implements Meter{
	
	@Override
	public void start() {
		System.out.println("������ �����մϴ�.");
	}
	@Override
	public void stop(int distance) {
		System.out.println("������ �����մϴ�."+"�����"+(distance*2+BASE_FARE)+"�� �Դϴ�.");
	}
}