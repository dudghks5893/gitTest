package chapter6;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person("이순신", 32);
		Person p2 = new Person();
		
		Person p3 = p1;
		
		System.out.println(p1.name + p1.age);
		System.out.println(p3.name + p3.age);
		
		p3.name = "강감찬";
		p3.age = 64;
		
		System.out.println(p1.name + p1.age);
		System.out.println(p3.name + p3.age);
	}

}
