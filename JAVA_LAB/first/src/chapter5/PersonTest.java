package chapter5;

//하나의 파일에서 클래스는 여러개 만들수 있다.
//파일의 이름은 항상 public 클래스의 이름과 같다. public class는 오직 하나다.
class Person{ //public을 쓰면 안됨
	String name; //이름
	double height; //키
	double weight; //몸무게
	
	
	public Person() {} //디폴트 생성자 (생략가능)
	//생성자 만들기 (리턴타입이 없음, 클래스 이름과 같음)
	public Person(String pname) {
		name = pname; //생성될때 실행되는 코드
	}
	public Person (String pname, double ph, double pw) {
		name = pname; //생성될때 실행되는 코드
		height = ph;
		weight = pw;
	}
	public void showInfo() {
		System.out.printf("Person %s 키: %.1f 몸무게:%.1f\n",name,height,weight);
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("강감찬", 180,77); //이름없고, 키 , 몸무게 없음
		Person p2 = new Person("이순신",170,65.5); //이름있고, 키 , 몸무게 없음
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
