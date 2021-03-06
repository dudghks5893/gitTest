package inheritance_extends;

class Novice{
	//필드
	protected String name;
	protected int hp;
	
	//생성자
public Novice(String name, int hp) {
	this.name = name;
	this.hp = hp;	
	}
// 출력 메소드
@Override
public String toString() {
	return String.format("[Novice] %s(HP: %d)",this.name,this.hp);
	}
}

class Wizard extends Novice{
	//필드
	protected int mp;
	//생성자
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	
	//에너지볼트
	public void energeVolt(int damage) {
		System.out.printf("%s의 에너지볼트!(대마법사 버프로 데미지+%d추가)\n",this.name,damage);
	}
}

class GreatWizard extends Wizard{
	//필드
	protected int shleld;
	//생성자
	public GreatWizard(String name, int hp, int mp, int shleld) {
		super(name, hp, mp);
		this.shleld = shleld;
	}
	@Override
	public String toString() {
		return String.format("[대마법사] %s(HP: %d, MP:%d, SHiELD:%d)",this.name,this.hp,this.mp,this.shleld);
	}
	@Override
	public void energeVolt(int damage) {
		super.energeVolt(damage);
	}

	
}

public class ex4 {

	public static void main(String[] args) {
		//객체 생성
		GreatWizard gandalf = new GreatWizard("간달프",100,100,100);
		//상태 출력
		System.out.println(gandalf.toString());
		//에너지볼트
		gandalf.energeVolt(30);
	}

}
