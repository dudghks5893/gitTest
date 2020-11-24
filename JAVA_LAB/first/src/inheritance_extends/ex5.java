package inheritance_extends;

public class ex5 {

	public static void main(String[] args) {
		// ��ü ����
		Artist kim = new Artist("������ �达");
		Architect lee = new Architect("���డ �̾�");
		Developer park = new Developer("������ �ھ�");
		Lawyer choi = new Lawyer("��ȣ�� �־�");
		
		// �׷�ȭ: �������̽� ����
		Friend[] friends = { kim, lee, park, choi};
		for (Friend f : friends) {
			f.dearFriend();
		}
	}

}

// 1. �ش� �������̽��� �ϼ��Ͻÿ�. dearFriend�� �߻� �޼ҵ��
interface Friend { //����
	void dearFriend(); //�ڽĵ��� �޼ҵ带 ������ �ۼ�
}

// 2. �Ʒ� ��� Ŭ������ Artist�� �����Ͽ� �ϼ��Ͻÿ�.
class Artist implements Friend{
	//�ʵ�
	private String name;
	
	//������
	public Artist(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->Ī�� ���̰�!");
	}
	
}
class Architect implements Friend{
	//�ʵ�
	private String name;
	
	//������
	public Architect(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->Ī�� ���̰�!");
	}
}

class Developer implements Friend{
	//�ʵ�
	private String name;
	
	//������
	public Developer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->Ī�� ���̰�!");
	}
	
}

class Lawyer implements Friend{
	//�ʵ�
	private String name;
	
	//������
	public Lawyer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->Ī�� ���̰�!");
	}
	
}

//abstract class aaaaaa { //��Ӱ���
//	abstract void abc(); // �ڽĵ��� �޼ҵ带 ������ ����
//	void abcd() { //�ڽĵ��� ���� ���ص���
//		int a;
//		int b;
//		int c;
//		int d;
//	}
//}
//
//class bbbb extends aaaaaa {
//	void abc() {
//		int a;
//		int b;
//	}
//}