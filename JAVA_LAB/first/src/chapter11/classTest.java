package chapter11;

public class classTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p1 = new Person();
		//Person ��ü���� ������ ����
		Class pC = p1.getClass();
		System.out.println(pC.getName());
		
		// ���� Ŭ���� ������ ����
		Class pC2 =Person.class;
		System.out.println(pC.getName());
		
		//Ŭ������ �̸����� �Է�(��Ű������)
		Class pC3 = Class.forName("chapter11.classTest");
		System.out.println(pC3.getName());
	}

}

class Person{
	private String name;
	private int age;
	
	
	public Person(){} //����Ʈ ������
	
	public Person(String name) { //�̸� �ʱ�ȭ ������
		this.name = name;
	}
	public Person(String name, int age) {//�̸�,���� �ʱ�ȭ ������
		this.name = name;
		this.age =age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}