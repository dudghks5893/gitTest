package ArrayList;

public class ex2 {

	public static void main(String[] args) {
		char[] ab= new char[26];
		char ch= 'a';
		
		for(int i=0; i<ab.length; i++,ch++) {
			ab[i] = ch; //아스키 값으로 각 요소에 저장
			ab[i] -= 32;
		}
		for(int i=0; i<ab.length; i++ ) {
			System.out.println(ab[i]+","+(int)ab[i]);
		}

	}

}
