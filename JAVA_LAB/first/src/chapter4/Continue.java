package chapter4;

public class Continue {

	public static void main(String[] args) {
		int total =0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num%2==0) continue;
			total += num;
			if(num==51) break;
		}
		System.out.println("1부터 51까지 합은"+total+"입니다.");

	}

}
