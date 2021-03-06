package inheritance_extends;

public class ex5 {

	public static void main(String[] args) {
		// 객체 생성
		Artist kim = new Artist("뮤지션 김씨");
		Architect lee = new Architect("건축가 이씨");
		Developer park = new Developer("개발자 박씨");
		Lawyer choi = new Lawyer("변호사 최씨");
		
		// 그룹화: 인터페이스 기준
		Friend[] friends = { kim, lee, park, choi};
		for (Friend f : friends) {
			f.dearFriend();
		}
	}

}

// 1. 해당 인터페이스를 완성하시오. dearFriend를 추상 메소드로
interface Friend { //구현
	void dearFriend(); //자식들이 메소드를 무조건 작성
}

// 2. 아래 모든 클래스를 Artist를 참고하여 완성하시오.
class Artist implements Friend{
	//필드
	private String name;
	
	//생성자
	public Artist(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->칭구 아이가!");
	}
	
}
class Architect implements Friend{
	//필드
	private String name;
	
	//생성자
	public Architect(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->칭구 아이가!");
	}
}

class Developer implements Friend{
	//필드
	private String name;
	
	//생성자
	public Developer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->칭구 아이가!");
	}
	
}

class Lawyer implements Friend{
	//필드
	private String name;
	
	//생성자
	public Lawyer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name+"->칭구 아이가!");
	}
	
}

//abstract class aaaaaa { //상속관계
//	abstract void abc(); // 자식들이 메소드를 무조건 구현
//	void abcd() { //자식들이 구현 안해도됨
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