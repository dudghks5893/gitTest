package chapter4;

public class doWhileExample {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		do {
			sum=sum+num;
			num=num+1;
		}while(num<=10);

		System.out.println("1부터 10까지 합은"+sum+"입니다.");
		
	}

}
