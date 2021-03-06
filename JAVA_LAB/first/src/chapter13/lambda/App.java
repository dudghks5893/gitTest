package chapter13.lambda;

public class App {
	
	public static void main(String[] args) {
		Human tom = new Human();
		tom.walk();
		walking(tom);
		
		Robot sam = new Robot();
		sam.walk();
		walking(sam);
		
		// 자바 7버전
		walking(new Walkable() {// 익명 클래스 객체
			
			@Override
			public void walk() {
				System.out.println("이름 없는 클래스 객체가 걷는다.");
			}
		});
		
		//	람다식
	walking(()-> {// 익명 클래스 객체
			
				System.out.println("이름 없는 클래스 객체가 걷는다.");
		});
		
		//	람다식
		walking(() -> System.out.println("이름없는 클래스 객체가 걷는다"));
		
		RamdaClass ramda = () -> System.out.println("람다 표현");
		ramda.test();
		
		RamdaClass hi = () -> System.out.println("헬로우!");
		hi.test();
		
		Sumable plus = (a,b) -> a+b;
	System.out.println(plus.work(10, 5));	
	
	
	
	Sumable div = (a,b) -> {
		if(b==0)
			return 0; //나누는 값 b가 0이면 그냥 0리턴
		return a/b;
	};
		JenericRamda<String> reverser = (s) -> {
			String result = "";
			for(int i= s.length()-1; i>=0; i--) {
				result = result+ s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("hahahoho"));
		
//		JenericRamda<Interger>facto = n -> {
//			int result = 1;
//			for(int i=1; i<=n; i++) {
//				result = i*result;
//			}
//			return result;
//		};
	
	System.out.println(div.work(10, 2));
	}
	
	public int factorial(int num) {
		int result = 1;
		for(int i=1; i<=num; i++) {
			result = i*result;
		}
		return result;
	}
	
	
	public String reverse(String str) {
		String result = "";
		for(int i= str.length()-1; i>=0; i--) {
			result = result+ str.charAt(i);
		}
		return result;
	}
	
	public int divide(int a, int b) {
		if(b==0)
			return 0; //나누는 값 b가 0이면 그냥 0리턴
		return a/b;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public void sayHello() {
		System.out.println("헬로우!");
	}
	
	public static void walking(Walkable any) {
		any.walk();
	}

}


interface Sumable {
	public int work(int a, int b);
}

interface StrReverse{
	public String revers(String s);
}

//제네릭 인터페이스
interface JenericRamda<E>{
	public E work(E t);
}
