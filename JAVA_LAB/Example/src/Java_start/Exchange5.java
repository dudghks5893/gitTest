package Java_start;

public class Exchange5 {

	public static void main(String[] args) {
		
		int ur= Integer.parseInt(args[0]);
		int dr= Integer.parseInt(args[1]);
		
		double euroToKwnRate= 1281.62664;
		double dollarToKwnRate= 1091.70306;
		
		double kwn=ur*euroToKwnRate+dr*dollarToKwnRate;
		
		System.out.printf("환전 결과: %.0f원", kwn);
		

	}

}
