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
		System.out.printf("[스타다방]%s %d개:%d원\n",name,count,mony);
	}
}
