package method;

public class ex8 {

	public static void main(String[] args) {
		//º¯¼ö »ý¼º
		int a= 13;
		int b= 7;
		int c= 10;

		//°á°ú Ãâ·Â
		System.out.printf("%dÃþ -> %s ¿¤·¹º£ÀÌÅÍ\n",a,guide(a));
		System.out.printf("%dÃþ -> %s ¿¤·¹º£ÀÌÅÍ\n",b,guide(b));
		System.out.printf("%dÃþ -> %s ¿¤·¹º£ÀÌÅÍ\n",c,guide(c));
	}

	private static String guide(int floor) {
		//1~10Ãþ±îÁö ÀúÃþ 11~20Ãþ±îÁö °íÃþ
		String result = "";
		if(floor >= 1 && floor <= 10) {
			result = "ÀúÃþ";
		}
		else if(floor >= 1 && floor <= 20 ) {
			result = "°íÃþ";
		}
		else {// 1~20»çÀÌ ÃþÀÌ ¾Æ´Ò°æ¿ì
			result = "¾ø´ÂÃþ";
		}
		return result;
	}
}
