package Java_start;

public class Ex2 {

	public static void main(String[] args) {
		String  name = "흥팍"; //문자열 변수 새성
		int age = 34; //정수형 변수 생성
		double weight = 74.4; //실수형 변수 생성
		boolean isMale = true; //논리형 변수 생성
		//결과 출력
		String plusName = "김"+name;
		System.out.println(plusName);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"세");
		System.out.println("몸무게: "+weight+"kg");
		System.out.println("남성인가요?"+isMale);
	}

}
