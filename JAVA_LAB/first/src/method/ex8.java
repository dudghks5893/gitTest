package method;

public class ex8 {

	public static void main(String[] args) {
		//���� ����
		int a= 13;
		int b= 7;
		int c= 10;

		//��� ���
		System.out.printf("%d�� -> %s ����������\n",a,guide(a));
		System.out.printf("%d�� -> %s ����������\n",b,guide(b));
		System.out.printf("%d�� -> %s ����������\n",c,guide(c));
	}

	private static String guide(int floor) {
		//1~10������ ���� 11~20������ ����
		String result = "";
		if(floor >= 1 && floor <= 10) {
			result = "����";
		}
		else if(floor >= 1 && floor <= 20 ) {
			result = "����";
		}
		else {// 1~20���� ���� �ƴҰ��
			result = "������";
		}
		return result;
	}
}
