package class_study;

class Miner {
	// �ʵ� (�ν��Ͻ� ����)
	String name;
	int coins;
	
	//������
	public Miner (String str) {
		name = str;
		coins = 0;
	}
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ��ü�� ������ ���ڿ��� ��ȯ
	public String toString() {
		return String.format("Miner { name: %s, coins: %d}", name,coins);
	}
	
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ���� ä��
	public void mine( ) {
		coins += 1;
	}
}

public class ex3 {

	public static void main(String[] args) {
		// 1. �� ���� ��ü�� �����ϼ���.
		
		Miner malon = new Miner("__"); // ���� �ٷ� �Է��ص� ����
		Miner gloria = new Miner("____"); // �۷θ��� �ٷ� �Է��ص� ����
		
		malon.name = "����";
		gloria.name = "�۷θ���";
		
		// 2. ������ ä���ϼ���.
		for (int i = 0; i < 3; i++) {
			malon.mine();
		}
		for (int i = 0; i < 2; i++) {
			gloria.mine();
		}
				
		// 3. ��ü ������ ����ϼ���.
		Miner[] Coin = {malon,gloria};
		for (int i=0; i < Coin.length; i++) {
			System.out.println(Coin[i].toString());
		}

	}

}