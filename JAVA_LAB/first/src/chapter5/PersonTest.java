package chapter5;

//�ϳ��� ���Ͽ��� Ŭ������ ������ ����� �ִ�.
//������ �̸��� �׻� public Ŭ������ �̸��� ����. public class�� ���� �ϳ���.
class Person{ //public�� ���� �ȵ�
	String name; //�̸�
	double height; //Ű
	double weight; //������
	
	
	public Person() {} //����Ʈ ������ (��������)
	//������ ����� (����Ÿ���� ����, Ŭ���� �̸��� ����)
	public Person(String pname) {
		name = pname; //�����ɶ� ����Ǵ� �ڵ�
	}
	public Person (String pname, double ph, double pw) {
		name = pname; //�����ɶ� ����Ǵ� �ڵ�
		height = ph;
		weight = pw;
	}
	public void showInfo() {
		System.out.printf("Person %s Ű: %.1f ������:%.1f\n",name,height,weight);
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("������", 180,77); //�̸�����, Ű , ������ ����
		Person p2 = new Person("�̼���",170,65.5); //�̸��ְ�, Ű , ������ ����
		Person p3 = new Person();
		Person p4 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p4.name);
			p1.showInfo();
			p2.showInfo();
			p3.showInfo();
			p4.showInfo();
	}

}