package testEx;

public class star {
	String name;
	int count;
	int mony;
	
	public star(String name) {
		this.name = name;
	}
	public void take(int mony) {
		this.mony += mony;
		count++;
		
	}
	public void show() {
		System.out.printf("[��Ÿ�ٹ�]%s %d��:%d��\n",name,count,mony);
	}
}