package class_study;

class Food{
	//�ʵ�
	String name;
	int price;
	//�ʵ� �ʱ�ȭ�ϴ� ������
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
}

public class ex2 {

	public static void main(String[] args) {
		// ���� ��ü ����
		Food chicken = new Food("ġŲ",18000);
		Food pizza = new Food("����",28000);
		Food sushi = new Food("�ʹ似Ʈ",22000);
		
		//��ü �迭�� ���� ���
		Food[] foods = {chicken, pizza, sushi};
		
		//��� ���� ���� ���
		for (int i = 0; i < foods.length; i++) {
			System.out.printf("Food{name:%s, price:%d�� }\n",foods[i].name,foods[i].price);
		}

	}

}
