package chapter8;

public class Customer {
	//�ʵ�  (�� �޸�)
	protected int customerID; 		//���̵�
	protected String customerName; 	//�̸�
	protected String customerGrade; 	//���
	int bonusPoint; 				//���ʽ�����Ʈ
	double bonusRatio; 				//��������(���ʽ�)
	
	//get , set �޼ҵ带 �ڵ�
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	//������ (����Ʈ ������)
	public Customer() {
		customerGrade = "SILVER";	//�⺻���
		bonusRatio = 0.01;			//1%
		System.out.println("Customer() ������ ȣ��");
	}
	//���ο� ������ �߰�
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) ������ ȣ��");
	}	
	//���ʽ� ����Ʈ ���������ִ� �޼ҵ�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//����Ʈ���
		return price;
	}
	//	���� ���
	public String showCustomerInfo() {
		return customerName+"���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
	}
}
