package testEx;

public class take {
	public String name;
	public int mony;
	
	public take (String name,int mony) {
		this.name = name;
		this.mony = mony;
	}
	//star �ٹ� �Ƹ޸�ī�� �ֹ�
	public void AA(star star) {
		star.take(4000);
		this.mony -= 4000;
	}
	//star �ٹ� ī��Ḷ���ƶ� �ֹ�
	public void karamall(star star) {
		star.take(5000);
		this.mony -= 5000;
	}
	//kong �ٹ� �� �ֹ�
	public void rata(kong kong) {
		kong.take(4500);
		this.mony -= 4500;
	}
	public void show() {
		System.out.printf("%s�� ���� �ܰ�� %d�� �Դϴ�.\n",name,mony);
	}
}
