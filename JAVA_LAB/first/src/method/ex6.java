package method;

public class ex6 {

	public static void main(String[] args) {
		//변수 생성
		int score1=96;
		int score2=85;
		int score3=76;
		// 결과 출력
		System.out.printf("%d점 -> %s\n", score1, grade (score1));
		System.out.printf("%d점 -> %s\n", score2, grade (score2));
		System.out.printf("%d점 -> %s\n", score3, grade (score3));
	}

	private static String grade(int score) {
		//A+:95이상 A0:90이상 B+:80이상 B0:70이상 그외 C+
		String result =""; //공백
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
