package ArrayList;

public class ex2 {

	public static void main(String[] args) {
		char[] ab= new char[26];
		char ch= 'a';
		
		for(int i=0; i<ab.length; i++,ch++) {
			ab[i] = ch; //�ƽ�Ű ������ �� ��ҿ� ����
			ab[i] -= 32;
		}
		for(int i=0; i<ab.length; i++ ) {
			System.out.println(ab[i]+","+(int)ab[i]);
		}

	}

}