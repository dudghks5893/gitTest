package method;

//import hello.Ex1;��� ��Ű���� Ex1Ŭ���� �ҷ�����

public class ex11 {

	public static void main(String[] args) {
	// ���� ����
		double w = 81.6;
		double t = 1.76;
		
//		Ex1 a = new Ex1();��� ��Ű���� Ex1Ŭ������ �޸𸮿� �ø���. (�������� ��ü�� �����Ѵ�.)
//		Ex1 b = new Ex1();��ü�� �ΰ�
//		int b = a.a; a��ü�� b��� �����Ϳ� �־���.
//		a.main(args);���� �ۺ� �ҷ����� ����
	// BMI ���
		double bmi = calculate(w, t);
		
	//��� ���
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi,w,t);
		System.out.printf("���: %s�Դϴ�.\n", result(bmi));
		
	}
	//�����Կ� Ű�� �Է¹޾�, bmi ������ ��ȯ
	public static double calculate (double weight, double tall) {
		return weight/(tall*tall);
	}
	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "��";
		}
		else if (bmi >=25) {
			result = "��ü��";
		}
		else if (bmi >=18.5) {
			result = "����";
		}
		else {
			result = "��ü��";
		}
		return result;
	}
}
