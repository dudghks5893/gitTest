package chapter10.scheduler;

public interface Scheduler {
	public void getNextCall();			//추상메소드
	public void sendCallToAgent();		//추상메소드
}

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("안녕하세요");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("반가워요");
	}
	
}

class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 가장 적은 상담원에게 할당합니다.");
	}
	
}
// 등급
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("귀찮아");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("손아파");
	}
	
}