package method;

//import hello.Ex1;헬로 패키지의 Ex1클레스 불러오기

public class ex11 {

	public static void main(String[] args) {
	// 변수 생성
		double w = 81.6;
		double t = 1.76;
		
//		Ex1 a = new Ex1();헬로 패키지의 Ex1클레스를 메모리에 올린다. (동적으로 객체를 생성한다.)
//		Ex1 b = new Ex1();객체가 두개
//		int b = a.a; a객체를 b라는 데이터에 넣었다.
//		a.main(args);메인 퍼블릭 불러오기 가능
	// BMI 계산
		double bmi = calculate(w, t);
		
	//결과 출력
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi,w,t);
		System.out.printf("결과: %s입니다.\n", result(bmi));
		
	}
	//몸무게와 키를 입력받아, bmi 지수를 반환
	public static double calculate (double weight, double tall) {
		return weight/(tall*tall);
	}
	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "비만";
		}
		else if (bmi >=25) {
			result = "과체중";
		}
		else if (bmi >=18.5) {
			result = "정상";
		}
		else {
			result = "저체중";
		}
		return result;
	}
}
