package method;

public class ex9 {

	public static void main(String[] args) {
		printAnimaL (1986);
		printAnimaL (1990);
		printAnimaL (2000);

	}

	private static void printAnimaL(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0:
			animal = "������";
			break;
		case 1:
			animal = "��";
			break;
		case 2:
			animal = "��";
			break;
		case 3:
			animal = "����";
			break;
		case 4:
			animal = "��";
			break;
		case 5:
			animal = "��";
			break;
		case 6:
			animal = "ȣ����";
			break;
		case 7:
			animal = "�䳢";
			break;
		case 8:
			animal = "��";
			break;
		case 9:
			animal = "��";
			break;
		case 10:
			animal = "��";
			break;
		case 11:
			animal = "��";
			break;
			
		default:
			animal= "ERROR!";
			break;
		}
		System.out.printf("%d�� => %s��\n", birthYear, animal);
	}
}
