package class_study;

public class PointTest {

	public static void main(String[] args) {
		//두 점 사이의 거리 측정
		//두 점의 객체 생성
		point p1 = new point(0, 0);
		point p2 = new point(3, 4);

		//거리 계산 : 스테틱 메소드로 객체가 아닌 클래스이름.메소드
		double distance = point.distance(p1, p2);
		//결과
		System.out.printf("두점 A%s, B%s 사이의 거리: %.2f",p1.tostr(),p2.tostr(),distance);
	}

}

class point {
	int x;
	int y;
	//생성자
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//좌표 출력
	public String tostr() {
		// 콘솔에 출력할때는 printf, 문자열을 만들때는 String.format("%d %s",1,"문자열")
		return String.format("(%d,%d)",x,y);
	}
	static double distance(point p, point q) {
		double dx = p.x - q.x; //x좌표 차이
		double dy = p.y - q.y; //y좌표 차이
		return Math.sqrt((dx * dx) + (dy * dy)); //거리 측정 공식
	}
}