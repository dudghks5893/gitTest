package Java_start;

public class Ex3 {

	public static void main(String[] args) {
	/* 멀티주석 : CTRL+SHIFT+/
	 * 입력 문자열을 실수로 형변환 
	 **/
	double f = Double.parseDouble(args[0]);	
	
	System.out.println(f);
//	화씨 온도를 섭씨로 계산
	double c = (f-32.0)/1.8;
	
	System.out.println("한줄뛰움");
	System.out.println("한줄뛰움");
	System.out.printf("%.1f도=> %.1f도 입니다!\n",f, c);
	
	System.out.println(6*(5-3)+"7");
	
	}

}
