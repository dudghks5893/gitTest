package testEx;

public class kong {
	String name;
	int count;
	int mony;
	
	public kong(String name) {
		this.name = name;
	}
	public void take(int mony) {
		this.mony += mony;
		count++;
		
	}
	public void show() {
		System.out.printf("[Äá´Ù¹æ]%s %d°³:%d¿ø\n",name,count,mony);
	}
}
