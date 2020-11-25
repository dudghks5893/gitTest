package chapter9.gameLevel;
//�÷��̾�� �߻� Ŭ������ ��ӹ޴� ���� Ŭ����(�ʱ�,�߱�,���)���� 4���� �߻� �޼ҵ带 �����ؾߵȴ�. 
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {	//���ø� �޼ҵ�
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
//�ʱ� Ŭ����
class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump���� ������");
	}

	@Override
	public void turn() {
		System.out.println("Tunr�� �� ������");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====�ʺ��� �����Դϴ�.=====");
	}
	
}
//�߱� Ŭ����
class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump�մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("Tunr�� �� ������");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====�߱��� �����Դϴ�.=====");
	}
	
}
//��� Ŭ����
class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("��û���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� Jump�մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====����� �����Դϴ�.=====");
	}
	
}