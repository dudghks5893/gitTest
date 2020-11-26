package chapter11;

public class StringTest1 {

	public static void main(String[] args) {
		String A =new String("java");
		String B =new String("android");
		System.out.println(A);
		System.out.println("처음 문자열 주소 값:"+System.identityHashCode(A)); //주소값 반환
		
		A= A.concat(B);
		
		System.out.println(A);
		System.out.println("처음 문자열 주소 값:"+System.identityHashCode(A));
		
		
		
	}

}
