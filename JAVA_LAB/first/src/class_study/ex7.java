package class_study;

class Account {
	//필드
	String num; // 계좌번호
	int balance; // 잔액
	
	//생성자
	public Account(String str, int i) {
		num = str;
		balance = i;
	}
	//메소드
	public String toString() {
		return String.format("Account { num: %s, balance: %d }",num, balance );
	}
	public boolean transfer(Account target, int amount) {
		if(balance<3000) {/*1. 잔액이 부족한 경우 false를 반환하세요.*/
			
			return false;
		}
		
		/* 2. 현재 잔액에서 송금액을 이체 대상 계좌로 전달하세요.*/
		 balance -= amount;
		 target.balance += amount;
		return true;
	}
}

public class ex7 {

	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45",10000);
		Account b = new Account("567-89",10000);
		
		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) { //result가 true면 계속 반복, false가 되면 중지
			result = a.transfer(b,3000); //a계좌의 잔금이 3000원 이상이면 b계좌로 송금한다.return true
		}								//반대로 3000원이 안되면 return false
		//결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
