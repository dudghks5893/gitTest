package inheritance_extends;

public class ex3 {

	public static void main(String[] args) {
		//��ü ����
		KRW krw = new KRW(1500, "��");
		USD usd = new USD(100.50,"�޷�");
		EUR eur = new EUR(260.87,"����");
		JPY jpy = new JPY(1400,"��");
		
		//�θ� Ŭ������ ���� �׷�ȭ
		Currency[]  currencies = { krw, usd, eur, jpy};
		
		//��� ȭ�������� ���
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}

	}

}

// 1. �θ� Ŭ���� Currency�� ����ÿ�.
// 2. ����� ���� �ߺ� �ڵ带 ���� ��
// 3. �����ڸ� �ùٸ��� �����Ͻÿ�.
// 4. toString() �޼ҵ带 �������̵� �Ͻÿ�.
class Currency{
	private double amount;
	private String notation;
	
	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}

	@Override
	public String toString() {
		return amount + notation;
	}
	
	
}

	class KRW extends Currency{
	public KRW (double amount, String notation) {
		super(amount,notation);
		
	}

	@Override
	public String toString() {
		return "KRW:" + super.toString();
	}
	
	
}
	class USD extends Currency{
	public USD(double amount, String notation) {
		super(amount,notation);
	}

	@Override
	public String toString() {
		return "USD:" + super.toString();
	}
	
	
}
	
	class EUR extends Currency{
		public EUR(double amount, String notation) {
			super(amount,notation);
		}

		@Override
		public String toString() {
			return "EUR:"+ super.toString();
		}
		
		
	}
		
		class JPY extends Currency{
			public JPY(double amount, String notation) {
				super(amount,notation);
			}

			@Override
			public String toString() {
				return "JPY:" + super.toString();
			}
			
	}