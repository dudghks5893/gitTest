package inheritance_extends;

public class ElvesTest {

	public static void main(String[] args) {
		//��ü ����
		Elf elf = new Elf("Ƽ����",100);
		HighElf high = new HighElf("��ǻ����",160,100);
		ElfLord lord = new ElfLord("���̿���",230,140,100);
		//��ü �迭 ����
		Elf[] elves = {elf, high, lord };
		//��� ��ü ���� ���
		for(int i=0 ; i< elves.length; i++) {
			System.out.println(elves[i].toString());
		}
	}

}

class Elf {
	protected String name; 
	protected int hp;
	
	public Elf(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Elf [name=" + name + ", hp=" + hp + "]";
	}
	
}

class HighElf extends Elf{
	protected int mp;

	public HighElf(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "HighElf [mp=" + mp + ", name=" + name + ", hp=" + hp + "]";
	}
	
}
class ElfLord extends HighElf{
	protected int shield;

	public ElfLord(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "ElfLord [shield=" + shield + ", mp=" + mp + ", name=" + name + ", hp=" + hp + "]";
	}
	
}