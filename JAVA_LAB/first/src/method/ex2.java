package method;

public class ex2 {

	public static void main(String[] args) {
		//Į�θ� �Ҹ� ����ϴ� �޼ҵ带 ����� ���ο��� ȣ���Ѵ�.
		//1. Į�θ� ��� �޼ҵ� ȣ��
		double result = caLoryCaLcuLator(5000);
		//3. ��� ���
		System.out.printf("�Ҹ� Į�θ�:%.1f kcal",result);

	}
		//2. �޼ҵ� ����
	private static double caLoryCaLcuLator(int i) {
		
		return i* 0.02;
	}
}
