package testEx;

public class ex1 {
	public static void main(String[] args) {
		
		take kim = new take("±è¾¾",30000);
		take E = new take("ÀÌ¾¾",20000);
		
		//±è¾¾ ¾ÆÀÌ½º¾Æ¸Þ¸®Ä«³ë ÁÖ¹®
		star AA = new star("¾ÆÀÌ½º¾Æ¸Þ¸®Ä«³ë");
		kim.AA(AA);
		kim.show();
		AA.show();
		//±è¾¾ Ä«¶ó¸á¸¶³¢¾Æ¶Ç ÁÖ¹®
		star ka = new star("Ä«¶ó¸á¸¶³¢¾Æ¶Ç");
		kim.karamall(ka);
		kim.show();
		ka.show();
				
		//ÀÌ¾¾ ¶ó¶¼ ÁÖ¹®
		kong rata = new kong("¹ÐÅ©¶ó¶¼");
		E.rata(rata);
		E.show();
		rata.show();
	}
}
