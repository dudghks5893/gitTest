package chapter6.q5;

public class CoffeeTest {

	public static void main(String[] args) {
		//�达�� �̾� ��ü ���� money�� ���� �ʱ�ȭ
		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 10000);
		// ���ٹ�, ��ٹ� ��ü ����
		StarCoffee s = new StarCoffee();
		BeanCoffee b = new BeanCoffee();
		
		// �达�� ���ٹ� 4000�� �޴�
		kim.buyStarCoffee(s, 4000);
		// �̾��� ���ٹ� 4500�� �޴�
		lee.buyBeanCoffee(b, 4500);

	}
}
