package chapter6.q6;

public class CardCompany {
	//카드 회사 객체는 싱글턴 패턴으로 유일한 1개
	private static CardCompany instance = new CardCompany();
	private CardCompany() {} //생성자 private으로 차단
	
	// 외부에서 유일한 회사객체를 얻는 getInstance 메소드
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	
	// 카드 생성 메소드
	public Card createCard() {
		Card card = new Card();
		return card;
	}
	
	
}
