package class_study;

public class PointTest {

	public static void main(String[] args) {
		//�� �� ������ �Ÿ� ����
		//�� ���� ��ü ����
		point p1 = new point(0, 0);
		point p2 = new point(3, 4);

		//�Ÿ� ��� : ����ƽ �޼ҵ�� ��ü�� �ƴ� Ŭ�����̸�.�޼ҵ�
		double distance = point.distance(p1, p2);
		//���
		System.out.printf("���� A%s, B%s ������ �Ÿ�: %.2f",p1.tostr(),p2.tostr(),distance);
	}

}

class point {
	int x;
	int y;
	//������
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//��ǥ ���
	public String tostr() {
		// �ֿܼ� ����Ҷ��� printf, ���ڿ��� ���鶧�� String.format("%d %s",1,"���ڿ�")
		return String.format("(%d,%d)",x,y);
	}
	static double distance(point p, point q) {
		double dx = p.x - q.x; //x��ǥ ����
		double dy = p.y - q.y; //y��ǥ ����
		return Math.sqrt((dx * dx) + (dy * dy)); //�Ÿ� ���� ����
	}
}