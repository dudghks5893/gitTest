package chapter4;

public class ForExample {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for (i=1,sum=0; i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("1부터 10까지 합은"+sum+"입니다.");
	}

}
