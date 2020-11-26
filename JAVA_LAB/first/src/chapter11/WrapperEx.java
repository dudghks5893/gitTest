package chapter11;

public class WrapperEx {

	public static void main(String[] args) {
		int x = Integer.parseInt("10"); //문자열을 정수형으로 변환
		double y = Double.parseDouble("10.123"); //문자열을 실수형으로 변환
		
		System.out.println(x);
		System.out.println(y);
		
		Integer num1 = new Integer(100); //객체 형식
		int num2 = 200;
		int sum = num1 + num2; //num1의 값이 자동으로 int로 변환됨 => 언박싱
		System.out.println(sum);
		Integer num3 = num2;	//num2가 객체 형식으로 변환=>오토박싱(num2 가 Integer.valueOf(num2)로 변환)
		
	}

}
