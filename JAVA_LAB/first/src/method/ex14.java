package method;

public class ex14 {

	public static void main(String[] args) {
		
		
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}

	//�ñް� ���� �ð��� �Է¹޾�, �ֱ��� ���
	public static void printPay(double basePay, int hours) {
		double pay = 0.0; 
		//�ش� �޼ҵ带 �ϼ��ϼ���.
		if (basePay<=8.00) {
			System.out.println("���� �ñ� ����!");
			return;
		}
		if (hours>=60) {
			System.out.println("�ʰ� �ٹ��ð� ����!");
			return;
		}
		if (hours>=40) {
			pay=(hours-40)*basePay*1.5+ 40*basePay;
			
		}
		else {
			pay = hours*basePay;
		}
		
		System.out.printf("$ %.2f\n", pay);
	}
}