package class_study;

class Food2{
	// �ʵ�
	String name;
	int price;
	// �ʵ� �ʱ�ȭ�ϴ� ������
	Food2(String name, int price){
		this.name = name;
		this.price = price;
	}
	//�޼ҵ�
//	�ڵ� �������� ����� �ҽ� ���� ����� ��
	@Override
	public String toString() {
		return "Food2 [name=" + name + ", price=" + price + "]";
	}
	
//	//�޼ҵ�	
//	String A() {
//		String str = "Food{name: " + this.name + ", price: " + this.price + "��}";
//		return str;
//	}
}

public class ex123 {

	public static void main(String[] args) {
		// ���� ��ü ����
		Food2 chicken = new Food2("ġŲ",18000);
		Food2 pizza = new Food2("����",28000);
		Food2 sushi = new Food2("�ʹ似Ʈ",22000);
		
		//��ü �迭�� ���� ���
		Food2[] foods = {chicken, pizza, sushi};
		
		//��� ���� ���� ���
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}

	}

}
