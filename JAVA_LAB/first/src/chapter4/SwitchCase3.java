package chapter4;

public class SwitchCase3 {
	public static void main(String[] args) {
		
		int ranking=1;
		char medalcolor;
		
		switch(ranking) {
		case 1: medalcolor = 'G';
			break; //스위치 문을 빠져나감
		case 2: medalcolor = 'S';
			break;
		case 3: medalcolor = 'B';
			break;
		default: medalcolor = 'A';
		}
		System.out.println(ranking+"등 메달의 색깔은"+medalcolor+"입니다.");
	}
}
