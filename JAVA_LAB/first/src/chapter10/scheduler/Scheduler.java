package chapter10.scheduler;

public interface Scheduler {
	public void getNextCall();			//�߻�޼ҵ�
	public void sendCallToAgent();		//�߻�޼ҵ�
}

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�ȳ��ϼ���");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�ݰ�����");
	}
	
}

class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ���� ���� �������� �Ҵ��մϴ�.");
	}
	
}
// ���
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("������");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�վ���");
	}
	
}