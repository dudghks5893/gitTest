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
		System.out.printf("[��ٹ�]%s %d��:%d��\n",name,count,mony);
	}
}
