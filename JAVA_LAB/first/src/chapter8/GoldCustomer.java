package chapter8;

public class GoldCustomer extends Customer{
	//필드  (힙 메모리)
		double saleRatio;		 	//할인율
		

		//생성자
		public GoldCustomer(int id, String name) {
			super(id, name); // Customer에 있는 id와 name을 사용
			customerGrade = "Gold";
			bonusRatio = 0.02;
			saleRatio = 0.1;
		}

		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price*saleRatio); //할인된 가격을 계산하여 반환
		}
	}
