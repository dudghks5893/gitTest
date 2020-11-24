package inheritance_extends;

public class ex6 {
public static void main(String[] args) {
	
	
	Taxi taxi = new Taxi();
	
	taxi.start();
	taxi.stop(2500);
	
	}
	
}


interface Meter {
	public int BASE_FARE = 3000; //기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없음)
	public abstract void start();
	public abstract void stop(int distance);
}

class Taxi implements Meter{
	
	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}
	@Override
	public void stop(int distance) {
		System.out.println("운행을 종료합니다."+"요금은"+(distance*2+BASE_FARE)+"원 입니다.");
	}
}