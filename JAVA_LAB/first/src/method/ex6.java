package method;

public class ex6 {

	public static void main(String[] args) {
		//���� ����
		int score1=96;
		int score2=85;
		int score3=76;
		// ��� ���
		System.out.printf("%d�� -> %s\n", score1, grade (score1));
		System.out.printf("%d�� -> %s\n", score2, grade (score2));
		System.out.printf("%d�� -> %s\n", score3, grade (score3));
	}

	private static String grade(int score) {
		//A+:95�̻� A0:90�̻� B+:80�̻� B0:70�̻� �׿� C+
		String result =""; //����
		if(score >= 95) {
			result = "A+";
		}
		else if (score >= 90) {
			result = "A0";
		}
		else if (score >= 80) {
			result = "B+";
		}
		else if (score >= 70) {
			result = "B0";
		}
		else{
			result = "C+";
		}
		return result;
	}
}