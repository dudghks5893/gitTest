package chapter4;

public class SwitchCase3 {
	public static void main(String[] args) {
		
		int ranking=1;
		char medalcolor;
		
		switch(ranking) {
		case 1: medalcolor = 'G';
			break; //����ġ ���� ��������
		case 2: medalcolor = 'S';
			break;
		case 3: medalcolor = 'B';
			break;
		default: medalcolor = 'A';
		}
		System.out.println(ranking+"�� �޴��� ������"+medalcolor+"�Դϴ�.");
	}
}
