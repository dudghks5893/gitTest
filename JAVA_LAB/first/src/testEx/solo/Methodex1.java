package testEx.solo;

public class Methodex1 {

	public static void main(String[] args) {
		
		kc A = new kc(0.02,5000);
		
		System.out.println("�Ҹ� Į�θ�:"+A.info()+"Kcal");
	}

}


class kc{
	double k;
	int km;
	
	public kc(double k, int km) {
		this.k = k;
		this.km= km;		
	}

	
	public double info() {
		return  k*km;
	}
	

	
	
}