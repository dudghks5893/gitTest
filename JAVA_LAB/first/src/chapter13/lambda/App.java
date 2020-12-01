package chapter13.lambda;

public class App {
	
	public static void main(String[] args) {
		Human tom = new Human();
		tom.walk();
		walking(tom);
		
		Robot sam = new Robot();
		sam.walk();
		walking(sam);
		
		// �ڹ� 7����
		walking(new Walkable() {// �͸� Ŭ���� ��ü
			
			@Override
			public void walk() {
				System.out.println("�̸� ���� Ŭ���� ��ü�� �ȴ´�.");
			}
		});
		
		//	���ٽ�
	walking(()-> {// �͸� Ŭ���� ��ü
			
				System.out.println("�̸� ���� Ŭ���� ��ü�� �ȴ´�.");
		});
		
		//	���ٽ�
		walking(() -> System.out.println("�̸����� Ŭ���� ��ü�� �ȴ´�"));
		
		RamdaClass ramda = () -> System.out.println("���� ǥ��");
		ramda.test();
		
		RamdaClass hi = () -> System.out.println("��ο�!");
		hi.test();
		
		Sumable plus = (a,b) -> a+b;
	System.out.println(plus.work(10, 5));	
	
	
	
	Sumable div = (a,b) -> {
		if(b==0)
			return 0; //������ �� b�� 0�̸� �׳� 0����
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
			return 0; //������ �� b�� 0�̸� �׳� 0����
		return a/b;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public void sayHello() {
		System.out.println("��ο�!");
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

//���׸� �������̽�
interface JenericRamda<E>{
	public E work(E t);
}