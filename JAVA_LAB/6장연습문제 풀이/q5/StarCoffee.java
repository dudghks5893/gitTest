package chapter6.q5;
	// �� �ٹ� ����
public class StarCoffee {

	int money;
	
	//�޼ҵ� : ������ ���ݿ� �´� Ŀ�Ǹ� ��Դ�
	public String brewing(int money) {
		
		String msg = "";
		if(money == Menu.S_AMERICANO) {
			msg = "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.S_LATTE) {
			msg = "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else { return "�޴��� ���׿�!"; }
		
		this.money += money;
	
		return msg;
	}
}
