package class_study;

class Square{
	int length; //길이
	
	//static int length; //길이, 스테틱은 클래스 이름만 있으면 메모리에 올라감
	
	int area() { //정사각형 넓이는 가로*세로
		return length * length;
		
	/* static int area(int X) { //정사각형 넓이는 가로*세로
			 return X * X; */
	}
}

public class SquareTest {

	public static void main(String[] args) {
			// 0. 스테틱은 객체 만들기 전에 사용
		
		//Square.lenght = 10;
		
			// 1. 객체 생성
		Square s = new Square();
		Square q = new Square();		
			// 2. 필드 초기화(값 변경)
		s.length = 4;
		q.length = 9;
			// 3. 결과 출력
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d \n",s.length,s.area());
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d \n",q.length,q.area());
	}

}
