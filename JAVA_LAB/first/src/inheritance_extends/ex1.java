package inheritance_extends;

public class ex1 {

	public static void main(String[] args) {
		// ���� �ٸ� ��ü ����
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		//�θ� Ŭ���� Ÿ���� �迭 ����
		Drink[] drinks = {j, c, b, w ,t};
		
		//��� ���Ḧ �ֹ�
		for(Drink d : drinks) {
			
			d.ordered();
		}
		
	}

}
class Drink{
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}

class Juice extends Drink{
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}

class Coffee extends Drink {
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}

class Beer extends Drink{
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}

class Water extends Drink{
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}

class Tea extends Drink{
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�");
	}
}