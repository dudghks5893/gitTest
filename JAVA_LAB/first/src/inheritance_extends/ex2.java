package inheritance_extends;

public class ex2 {

	public static void main(String[] args) {
		//��ü ����
		Car c = new Car("Ƽ��");
		Car t = new Truck("����",1.5);
		
		//���� ���
		System.out.println(c.toString());
		System.out.println(t.toString());
					
	}

}

class Car {
	protected String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("[�ڵ���] {name:%s}",name );
	}
	
}

class Truck extends Car{
	protected double ton; //���緮

	public Truck(String name, double ton) {
		super(name);
		this.ton = ton;
	}

	@Override
	public String toString() {
		return String.format("[Ʈ��] {name:%s, ton:%.1f}",name,ton );
	}
	
	
}

