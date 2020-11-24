package chapter8;

import java.util.ArrayList;

public class AnlmalTest1 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		// ������ �׽�Ʈ
		AnlmalTest1 aTest = new AnlmalTest1();
		aTest.addAnimal();
		System.out.println("====���������� �ٿ� ĳ����=====");
		aTest.testCasting();
	}

	
	//�ٿ� ĳ����
	private void testCasting() {
		for(int i=0; i <aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h= (Human)ani; //ĳ����
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t= (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e= (Eagle)ani;
				e.flying();
		}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
	}
}
	private void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	public void moveAnimal(Animal ani) {
		ani.move();
	}
}

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}