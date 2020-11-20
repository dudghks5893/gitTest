package chapter6.q6;

public class Card {

	private int cardNumber;
	//static 시리얼번호
	private static int serialNum = 10000;
	
	public Card(){
		serialNum++; 			//카드 생성시 1증가
		cardNumber = serialNum; //증가된 시리얼번호를 카드번호에 입력
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
