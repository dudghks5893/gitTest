package class_study;

class Hero {
	// �ʵ�
	String name;
	int hp;
	
	// ������
	public Hero(String str) {
		name = str;
		hp = 30;
	}	
	
	// �޼ҵ�(�ν��Ͻ� �޼ҵ�)
	
	public void punch(Hero enemy) {
		// 1. (1-10)���� ���� �������� ���� ����� hp�� ���δ�.
//		System.out.println(hp-=(int)(Math.random()*10)+1);
		hp -= (int)(Math.random()*10)+1;
			 		 
	}
	
	// �޼ҵ�(Ŭ���� �޼ҵ�)
	public static void battle(Hero a, Hero b) {
		// 2. ������ �����Ѵ�.
		boolean firstAttack = true; // firstAttack�� ���̸� a�� ��ġ�� ������.
		while(a.hp >=0 || b.hp >=0) { // ������ hp�� �����ִ� ����
			if(firstAttack) {
				a.punch(b);
				System.out.printf("[%s]�� ��ġ%n",a.name);
				System.out.printf("%s: %d/30%n",b.name,b.hp);
			}
			else {
				b.punch(a);
				System.out.printf("[%s]�� ��ġ%n",b.name);
				System.out.printf("%s: %d/30%n",a.name,a.hp);
			}
			firstAttack = !firstAttack;
		}
	}
}

public class ex8 {

	public static void main(String[] args) {
		// �� �ο�� ��ü ����
		Hero arthas = new Hero("�Ƽ���");
		Hero leona = new Hero("������");
		
		// ���� ����
		Hero.battle(arthas, leona);

	}

}