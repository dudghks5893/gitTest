package chapter11;

public class StringBuilderTest {

	public static void main(String[] args) {
		String A = new String("java");		//ó�� "java"��ü �ּ�
		System.out.println("A���ڿ� �ּ�:"+System.identityHashCode(A));
		
		StringBuilder B = new StringBuilder(A);  //B ��ü �ּ�
		System.out.println("���� �� �޸� �ּ�:"+System.identityHashCode(B));
		
		B.append(" and");
		B.append(" android");
		B.append(" ��´�..");
		System.out.println("������ B�޸��ּ�:"+System.identityHashCode(B));
		System.out.println(B);
		A = B.toString(); // StringŬ������ ��ȯ (����Ʈ������ ���ڵ��� �������)
		System.out.println(A);
		System.out.println("����� A���ڿ� �ּ�:"+System.identityHashCode(A));
		
		int x = Integer.parseInt("10");
		double y = Double.parseDouble("10.123");
		
		System.out.println(x);
		System.out.println(y);
	}

}