package testEx.solo;

public class Classex1 {

	public static void main(String[] args) {
		echae A = new echae(123-45,10000);
		echae B = new echae(597-89,10000);

	
			A.transfer(B, 3000);
			A.info();
	}

}

class echae{
	int name;
	int won;
	
	public echae(int name, int won) {
		this.name = name;
		this.won = won;
	}
	public int transfer(echae a, int b) {
		for(int i=0; i<3000; i++) {
			this.won -= b;
			a.won += b;
		}
		return b;
		
	}
	public void info() {
		System.out.printf("�̸�:%d,����:%d",name,won);
	}
	
}