package chapter4;

public class ifExample2 {

	public static void main(String[] args) {
		// if 문
		int age = 7;
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		
		else {
			System.out.println("8세 미만은 학교에 못갑니다.");
		}
		//1분복슴
		
		char gender='F'; //문자형 변수 gender 선언과 초기화
		if (gender=='F') 
			System.out.println("여성입니다");
		
		else 
			System.out.println("남성입니다.");
		//제어문의 코드가 한줄일 경우에 중괄호{} 생략 가능
		
		
	}

}
