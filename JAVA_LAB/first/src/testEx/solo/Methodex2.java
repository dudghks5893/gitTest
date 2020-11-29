package testEx.solo;

public class Methodex2 {

	public static void main(String[] args) {
		
		kc1 A = new kc1(5.179,180*3);
		
		System.out.printf("ªÔ∞„ªÏ 3¿Œ∫–: %.2f Kcal",A.info());
	}

}


class kc1{
	double k;
	int km;
	
	public kc1(double k, int km) {
		this.k = k;
		this.km= km;		
	}

	
	public double info() {
		return  k*km;
	}
	

	
	
}