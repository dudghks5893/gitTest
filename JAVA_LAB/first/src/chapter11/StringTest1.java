package chapter11;

public class StringTest1 {

	public static void main(String[] args) {
		String A =new String("java");
		String B =new String("android");
		System.out.println(A);
		System.out.println("ó�� ���ڿ� �ּ� ��:"+System.identityHashCode(A)); //�ּҰ� ��ȯ
		
		A= A.concat(B);
		
		System.out.println(A);
		System.out.println("ó�� ���ڿ� �ּ� ��:"+System.identityHashCode(A));
		
		
		
	}

}