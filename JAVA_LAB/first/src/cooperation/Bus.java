package cooperation;

public class Bus {
	//�ʵ�
	int busNumber;
	int passengerCount;
	int money;
	
	//������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	//�޼ҵ� : �°��� ������ ���� ��������, �°��� ����
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//�޼ҵ� ������ ��Ÿ��
	public void showInfo() {
		System.out.println("����"+ busNumber + "���� �°���" + passengerCount + 
				"���̰�,������" +money+"�Դϴ�.");
	}
	
	
}
