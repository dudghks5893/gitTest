package method;

public class ex7 {

	public static void main(String[] args) {
		//변수 생성
		double tomVocal = 8.8; 
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		//결과 출력
		System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과: %s\n", test(kateVocal, kateDance));
	}

	private static String test (double vocal, double dance) {
		// 보컬 점수와 댄스 점수를 곱해서 70.0 이상이면 합격, 아니면 불합격
		return (vocal* dance >=70)? "합격":"불합격";
	}
}
