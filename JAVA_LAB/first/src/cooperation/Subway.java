package cooperation;

public class Subway {
	//�ʵ�
	String linNumber;
	int passengerCount;
	int money;
	
	//������
	public Subway(String linNumber) {
		this.linNumber = linNumber;
	}
	//�޼ҵ� : �°��� ������ ���� ��������, �°��� ����
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//�޼ҵ� ������ ��Ÿ��
	public void showInfo() {
		System.out.printf("����ö%s�� �°��� %d���̰�, ������ %d�� �Դϴ�. \n",linNumber,passengerCount,money);
	}
}
