package method;

public class ex7 {

	public static void main(String[] args) {
		//���� ����
		double tomVocal = 8.8; 
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		//��� ���
		System.out.printf("Tom�� ����� ���: %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate�� ����� ���: %s\n", test(kateVocal, kateDance));
	}

	private static String test (double vocal, double dance) {
		// ���� ������ �� ������ ���ؼ� 70.0 �̻��̸� �հ�, �ƴϸ� ���հ�
		return (vocal* dance >=70)? "�հ�":"���հ�";
	}
}
