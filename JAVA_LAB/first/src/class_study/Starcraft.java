package class_study;

class Marine{
	//�ʵ�
	String name;
	int hp;
	//������
	public Marine(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	// �޼ҵ�
	public void stimpack() {
		System.out.printf("[%s]�� ������! HP: %d ->", name, hp);
		hp -= 10;
		System.out.printf("%d\n",hp);
	}
}

// �޵� Ŭ����
class Medic {
	//�ʵ�
	String name;
	int hp;
	
	//������
	public Medic(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	//�޼ҵ�
	public void heal(Marine target) {
		System.out.printf("[%s]�� ġ��! %s HP(%d ->",name, target.name, target.hp);
		target.hp += 10;
		System.out.printf("%d)\n",target.hp);
	}
}

public class Starcraft {

	public static void main(String[] args) {
		//��ü ����
		Marine marine = new Marine("����",80);
		Medic medic = new Medic("�޵�",60);	
		Marine marine1 = new Marine("����1",80);
		
		//���� ������ ����
		marine.stimpack();
		//�޵��� ġ�� -> ����
		medic.heal(marine);
		
		// ����1 ������ ���
		marine1.stimpack();
		//�޵� ��
		medic.heal(marine1);


	}

}

