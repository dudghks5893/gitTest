package testEx.solo;

public class Methodex3 {

	public static void main(String[] args) {
		
		kc2 A = new kc2(182.736,8.86);
		
		System.out.printf("����:%.2f Km/L",A.info());
	}

}


class kc2{
	double k;
	double km;
	
	public kc2(double k, double km) {
		this.k = k;
		this.km = km;		
	}

	
	public double info() {
		return  k/km;
	}
	

	
	
}