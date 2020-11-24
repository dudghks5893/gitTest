package inheritance_extends;

class Novice{
	//�ʵ�
	protected String name;
	protected int hp;
	
	//������
public Novice(String name, int hp) {
	this.name = name;
	this.hp = hp;	
	}
// ��� �޼ҵ�
@Override
public String toString() {
	return String.format("[Novice] %s(HP: %d)",this.name,this.hp);
	}
}

class Wizard extends Novice{
	//�ʵ�
	protected int mp;
	//������
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	
	//��������Ʈ
	public void energeVolt(int damage) {
		System.out.printf("%s�� ��������Ʈ!(�븶���� ������ ������+%d�߰�)\n",this.name,damage);
	}
}

class GreatWizard extends Wizard{
	//�ʵ�
	protected int shleld;
	//������
	public GreatWizard(String name, int hp, int mp, int shleld) {
		super(name, hp, mp);
		this.shleld = shleld;
	}
	@Override
	public String toString() {
		return String.format("[�븶����] %s(HP: %d, MP:%d, SHiELD:%d)",this.name,this.hp,this.mp,this.shleld);
	}
	@Override
	public void energeVolt(int damage) {
		super.energeVolt(damage);
	}

	
}

public class ex4 {

	public static void main(String[] args) {
		//��ü ����
		GreatWizard gandalf = new GreatWizard("������",100,100,100);
		//���� ���
		System.out.println(gandalf.toString());
		//��������Ʈ
		gandalf.energeVolt(30);
	}

}
