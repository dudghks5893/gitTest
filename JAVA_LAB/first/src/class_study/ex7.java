package class_study;

class Account {
	//�ʵ�
	String num; // ���¹�ȣ
	int balance; // �ܾ�
	
	//������
	public Account(String str, int i) {
		num = str;
		balance = i;
	}
	//�޼ҵ�
	public String toString() {
		return String.format("Account { num: %s, balance: %d }",num, balance );
	}
	public boolean transfer(Account target, int amount) {
		if(balance<3000) {/*1. �ܾ��� ������ ��� false�� ��ȯ�ϼ���.*/
			
			return false;
		}
		
		/* 2. ���� �ܾ׿��� �۱ݾ��� ��ü ��� ���·� �����ϼ���.*/
		 balance -= 3000;
		 target.balance += 3000;
		return true;
	}
}

public class ex7 {

	public static void main(String[] args) {
		// ��ü ����
		Account a = new Account("123-45",10000);
		Account b = new Account("567-89",10000);
		
		// �۱�: 3õ���� a ���¿��� -> b���·�!
		boolean result = true;
		while (result) {
			result = a.transfer(b,3000);
		}
		//��� ���
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}