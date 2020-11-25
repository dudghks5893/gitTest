package chapter9.finalEx;

public class Constant {
	int ume =10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.ume = 50;
//		cons.NUM = 200; // 상수는 다시 대입할 수 없다.
		
		System.out.println(cons.ume);
		System.out.println(cons.NUM);
	}
}
