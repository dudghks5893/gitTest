package chapter11;

public class WrapperEx {

	public static void main(String[] args) {
		int x = Integer.parseInt("10"); //���ڿ��� ���������� ��ȯ
		double y = Double.parseDouble("10.123"); //���ڿ��� �Ǽ������� ��ȯ
		
		System.out.println(x);
		System.out.println(y);
		
		Integer num1 = new Integer(100); //��ü ����
		int num2 = 200;
		int sum = num1 + num2; //num1�� ���� �ڵ����� int�� ��ȯ�� => ��ڽ�
		System.out.println(sum);
		Integer num3 = num2;	//num2�� ��ü �������� ��ȯ=>����ڽ�(num2 �� Integer.valueOf(num2)�� ��ȯ)
		
	}

}