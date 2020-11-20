package singleton;

public class Company {
	// 이름 인스턴스로 하나의 Company 객체를 만들어서 static으로 공유
	private static Company instance = new Company();
	private Company(){}; //생성자가 private이면 다른 클래스에서 생성불가
	
	//외부에서 instance 객체를 공유할수 있도록
	public static Company getInstance() {
		if(instance==null) {//만약에 객체가 없으면 다시 만들어준다.
			instance = new Company();
		}
		return instance; //하나뿐인 Company객체를 반환한다.
	}
}
