package class_study;

class cube{
	//�ʵ�
	int length;
	
	//������
	public cube(int i) {
		 length = i;
	}
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ������ü�� ���� ��ȯ
	public int volume() {
		//���Ǹ� ��ȯ�ϼ���
		return length*length*length;
	}
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ������ü�� �ѳ��� ��ȯ
	public int surfaceArea() {
		//�޼ҵ带 �ϼ��ϼ���
		return 6*length*length;
	}
}

public class ex4 {

	public static void main(String[] args) {
		//�� ������ü ��ü ����
		cube a = new cube(3);
		cube b = new cube(5);
		
		//�� ������ü�� ���ǿ� �ѳ��� ���
		System.out.printf("������ü a�� ����: %d, �ѳ���: %d\n", a.volume(), a.surfaceArea());
		System.out.printf("������ü b�� ����: %d, �ѳ���: %d\n", b.volume(), b.surfaceArea());

	}

}
