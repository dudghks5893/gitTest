package chapter6.q6;

public class Card {

	private int cardNumber;
	//static �ø����ȣ
	private static int serialNum = 10000;
	
	public Card(){
		serialNum++; 			//ī�� ������ 1����
		cardNumber = serialNum; //������ �ø����ȣ�� ī���ȣ�� �Է�
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
