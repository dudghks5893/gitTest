package class_study;

class Item{
	String name;
	int power;
	
	//������
	public Item(String str, int i) {
		name = str;
		power = i;
	}
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ��ü ������ ���ڿ��� ��ȯ
	public String A() {
		return String.format("Item{ name:%s, power: %d}", name, power);
	}
}

public class ex5 {

	public static void main(String[] args) {
		//������ ��ü ����
		Item storm = new Item("���� �극��Ŀ",600);
		Item gauntlet = new Item("���Ǵ�Ƽ ��Ʋ��",999);
		Item bow = new Item("ȣũ������ Ȱ",50);
		Item shield = new Item("ĸƾ�Ƹ޸�ī�� ����",50);

		//��ü �迭�� ������ �Ҵ�
		Item[] items = {storm, gauntlet, bow, shield};
		
		//��� ������ ������ ����ϼ���.
		for (int i=0; i < items.length; i++) {
		System.out.println(items[i].A());
		}
	}

}