package chapter6.q5;

public class Person {
	//�ʵ�
	String name;
	int money;
	//������
	Person(String name, int money ){
		this.name = name;
		this.money = money;
	}
	
	// ���ٹ� Ŀ�Ǹ� ��Դ´�. ( ���ٹ� ��ü , money )
	public void buyStarCoffee(StarCoffee s, int money) {
		String msg = s.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + " ���� " + money +"���� "  + msg);
		}
	}
	// ��ٹ� Ŀ�Ǹ� ��Դ´�.
	public void buyBeanCoffee(BeanCoffee b, int money) {
		String msg = b.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + " ���� " + money +"���� "  + msg);
		}
	}
}
