package chapter6.q5;
	//��ٹ�ī��
public class BeanCoffee {

	int money;
	
	//�޼ҵ� : ������ ���ݿ� �´� Ŀ�Ǹ� ��Դ´�.
	public String brewing(int money) {
	
		String msg = "";
		if(money == Menu.B_AMERICANO) {
			msg = "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.B_LATTE) {
			msg = "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else { return "�޴��� ���׿�!"; }
		
		this.money += money;
	
		return msg;
	}
}
