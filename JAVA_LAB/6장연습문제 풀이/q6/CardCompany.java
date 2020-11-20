package chapter6.q6;

public class CardCompany {
	//ī�� ȸ�� ��ü�� �̱��� �������� ������ 1��
	private static CardCompany instance = new CardCompany();
	private CardCompany() {} //������ private���� ����
	
	// �ܺο��� ������ ȸ�簴ü�� ��� getInstance �޼ҵ�
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	
	// ī�� ���� �޼ҵ�
	public Card createCard() {
		Card card = new Card();
		return card;
	}
	
	
}
