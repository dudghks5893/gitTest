package chapter8;

public class VIPCustomer extends Customer {
	//필드  (힙 메모리)
	private int agentID;		//전담 상담원 아이디
	double saleRatio;		 	//할인율
	
	//생성자 (디폴트 생성자)
	public VIPCustomer() {
		super(); //상위 클래스의 생성자를 먼저 실행한다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	//새로운 생성자 추가
	public VIPCustomer(int id, String name, int agentID) {
		super(id, name); // Customer에 있는 id와 name을 사용
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio); //할인된 가격을 계산하여 반환
	}
	public int getAgerntID() {
		return agentID;
	}
}
