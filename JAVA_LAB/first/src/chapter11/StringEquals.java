package chapter11;

public class StringEquals {

	public static void main(String[] args) {
		//문자열String 에는 이미 equals 메소드가 재정의 되어 있다.
		//String a = "문자열";
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		System.out.println("====================");
		
		Integer i1 = new Integer(100); //int i1 = 100;
		Integer i2 = new Integer(100); //int i2 = 100;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		
	}

}
