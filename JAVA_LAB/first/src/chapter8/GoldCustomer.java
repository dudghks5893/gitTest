package chapter8;

public class GoldCustomer extends Customer{
	//�ʵ�  (�� �޸�)
		double saleRatio;		 	//������
		

		//������
		public GoldCustomer(int id, String name) {
			super(id, name); // Customer�� �ִ� id�� name�� ���
			customerGrade = "Gold";
			bonusRatio = 0.02;
			saleRatio = 0.1;
		}

		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price*saleRatio); //���ε� ������ ����Ͽ� ��ȯ
		}
	}
