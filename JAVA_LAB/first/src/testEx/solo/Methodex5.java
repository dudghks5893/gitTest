package testEx.solo;

public class Methodex5 {

	public static void main(String[] args) {
		wear(3000,2000);
		wear(1000,2000);
	}
	public static void wear(int hp, int mp) {
		if(hp>=2000 && mp>=2000) {
			System.out.println("������ ���� �Ϸ�!");
		}
		else {
			System.out.println("�������� ������ �� �����ϴ�.");
		}
	}
}

