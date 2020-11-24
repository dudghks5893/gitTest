package chapter8;

public class Customer {
	//필드  (힙 메모리)
	protected int customerID; 		//아이디
	protected String customerName; 	//이름
	protected String customerGrade; 	//등급
	int bonusPoint; 				//보너스포인트
	double bonusRatio; 				//적립비율(보너스)
	
	//get , set 메소드를 자동
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
	//생성자 (디폴트 생성자)
	public Customer() {
		customerGrade = "SILVER";	//기본등급
		bonusRatio = 0.01;			//1%
		System.out.println("Customer() 생성자 호출");
	}
	//새로운 생성자 추가
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}	
	//보너스 포인트 적립시켜주는 메소드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//포인트계산
		return price;
	}
	//	정보 출력
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
}
