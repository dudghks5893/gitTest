package chapter4;

public class GuGudan {

	public static void main(String[] args) {
		//구구단 만들기
		int dan; //구구단의 단의 수
		int n;	//곱하는 수
		for(dan = 2; dan <= 9; dan++) {
			for(n=1; n<=9;n++) {
				System.out.println(dan+"X"+n+"="+dan*n);
				if(n==7) break;//숫자가 8일때 빠져나온다.
			}
			System.out.println();
		}

	}

}
