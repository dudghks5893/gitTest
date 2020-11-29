package testEx.solo;

public class Methodex4 {

	public static void main(String[] args) {
		
		double A = dice();
		
		double C = dar(A);
		System.out.printf("È¹µæ ±Ý¾×: $%.2f(%.0f¿ø)",A,C);
	}
	
	public static double dar(double D) {
		return D*1082.25108;
	}
	
	public static int dice() {
		int B= 0;
		for(int i=0; i<3; i++){
			B += (int)(Math.random()*6)+1;
		}
		return B;
	}

}


