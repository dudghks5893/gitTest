package class_study;

class cube{
	//필드
	int length;
	
	//생성자
	public cube(int i) {
		 length = i;
	}
	//메소드(인스턴스 메소드) - 정육면체의 부피 반환
	public int volume() {
		//부피를 반환하세요
		return length*length*length;
	}
	//메소드(인스턴스 메소드) - 정육면체의 겉넓이 반환
	public int surfaceArea() {
		//메소드를 완성하세요
		return 6*length*length;
	}
}

public class ex4 {

	public static void main(String[] args) {
		//두 정육면체 객체 생성
		cube a = new cube(3);
		cube b = new cube(5);
		
		//두 정육면체의 부피와 겉넓이 출력
		System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
		System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());

	}

}
