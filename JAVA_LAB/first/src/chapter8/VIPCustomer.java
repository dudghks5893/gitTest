package chapter8;

public class VIPCustomer extends Customer {
	//�ʵ�  (�� �޸�)
	private int agentID;		//���� ���� ���̵�
	double saleRatio;		 	//������
	
	//������ (����Ʈ ������)
	public VIPCustomer() {
		super(); //���� Ŭ������ �����ڸ� ���� �����Ѵ�.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	//���ο� ������ �߰�
	public VIPCustomer(int id, String name, int agentID) {
		super(id, name); // Customer�� �ִ� id�� name�� ���
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio); //���ε� ������ ����Ͽ� ��ȯ
	}
	public int getAgerntID() {
		return agentID;
	}
}