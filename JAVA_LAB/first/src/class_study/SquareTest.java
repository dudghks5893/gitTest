package class_study;

class Square{
	int length; //����
	
	//static int length; //����, ����ƽ�� Ŭ���� �̸��� ������ �޸𸮿� �ö�
	
	int area() { //���簢�� ���̴� ����*����
		return length * length;
		
	/* static int area(int X) { //���簢�� ���̴� ����*����
			 return X * X; */
	}
}

public class SquareTest {

	public static void main(String[] args) {
			// 0. ����ƽ�� ��ü ����� ���� ���
		
		//Square.lenght = 10;
		
			// 1. ��ü ����
		Square s = new Square();
		Square q = new Square();		
			// 2. �ʵ� �ʱ�ȭ(�� ����)
		s.length = 4;
		q.length = 9;
			// 3. ��� ���
		System.out.printf("�� ���� ���̰� %d�� ���簢���� ����: %d \n",s.length,s.area());
		System.out.printf("�� ���� ���̰� %d�� ���簢���� ����: %d \n",q.length,q.area());
	}

}
