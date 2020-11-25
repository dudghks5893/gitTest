package chapter10.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 선택");
		System.out.println("R: 한명씩");
		System.out.println("L: 쉬고있는 사람");
		System.out.println("P: 우선순위 ");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch=='R'|| ch=='r') {
			scheduler = new RoundRobin();
		}
		else if(ch=='P'|| ch=='p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch=='L'|| ch=='l') {
			scheduler = new LeastJob();
		}
		else {
			System.out.println("오류");
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
