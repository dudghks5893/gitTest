package method;

public class ex5 {

	public static void main(String[] args) {
		wear(2400, 2000);
		wear(3800, 1200);

	}

	private static void wear (int hp, int mp) {
		//ü�� ���� 2000 �̻��϶� �������� ��������
		if(hp>=2000 && mp>=2000) {
			System.out.println("������ ���� �Ϸ�!");
		}
		else {
			System.out.println("�������� ������ �� �����ϴ�.");
		}
	}
}
