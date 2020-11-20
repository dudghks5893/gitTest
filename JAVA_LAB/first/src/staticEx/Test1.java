package staticEx;

public class Test1 {
	public static void main(String[] args) {
		//학생 객체들을 만들어서 static 변수 테스트
		Student s1 = new Student("이지원");
		Student s2 = new Student("손경수");
		
		s1.showInfo();
		s2.showInfo();

	}
}
