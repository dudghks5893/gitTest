package cooperation;

public class Taxi {
	//�ʵ�
	int taxiNumber;
	int passengerCount;
	int money;
	int fare;
	
	//������
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	//�޼ҵ� : �°��� ������ ���� ��������, �°��� ����
	public void take(int fare) {
		this.money += fare;
		passengerCount++;
	}
	//�޼ҵ� ������ ��Ÿ��
	public void showInfo() {
		System.out.printf("�ý�%s���� �°��� %d���̰�, ����� %d�� �Դϴ�. \n",taxiNumber,passengerCount,money);
	}
}

