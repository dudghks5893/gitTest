package chapter3;

public class operationgEx2 {
	public static void main(String[] args) {
		//증가 감소자
		int gameScore=150;
		
		int lastScore1=gameScore++;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int num=1;
		
		int num2=num++;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2);
		
		//관계연산자
		System.out.println(2>1);
		System.out.println(2<1);
		
		int a=10;
		int b=20;
		
		System.out.println(a>b);
		System.out.println(b>a);
		System.out.println(a==b);		
		System.out.println(a!=b);		//두 개 항이 다르면 참, 아니면 거짓

		System.out.println(num2);//그냥한거
		//논리 연산자
		System.out.println((true)&&(true));
		System.out.println((true)&&(false));
		System.out.println((false)&&(true));
		System.out.println((false)&&(false));
		
		System.out.println(num2);//그냥한거
		//논리 연산자 || or
		System.out.println((true)||(true));
		System.out.println((true)||(false));
		System.out.println((false)||(true));
		System.out.println((false)||(false));
		
		//상관없는 경우
		System.out.println((false)&&(a!=b));
		System.out.println((true)||(a>b));
		
		//복합 대입 연산자
		
		int n1 =2;
		n1 =+2;
		System.out.println(n1);
		n1 *=2;
		System.out.println(n1);
		n1 /= 2;
		System.out.println(n1);
	}

}
