import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
//		System.out.println();
//		System.in
//		Scanner input = new Scanner(System.in);
		
//		for(int i=0; i<3; i++) {
//		System.out.println("�ƹ� �����̳� �Է�:");
//		String enteredText = input.nextLine(); //�Է� ������ ���� �� ���͸� ĥ������
//		System.out.println(enteredText);
//		}
		
		File file = null; // try�ȿ��� �Է��ѰŴ� �ۿ��� ���� ���⿡ �ۿ��� ������ �ۿ��� �����������.
		try { // Ʈ���� �ȿ��� ���� �߻��� catch�� �Ѿ ������ ������ Ʈ���̿��� �����ϰ� ��ġ�� �Ѿ
			File file1 = new File("myfile.txt");
			Scanner input1 = new Scanner(file1); //������ ���� ��ü
			while(input1.hasNextLine()) { //���� ������ �������
				String line = input1.nextLine();
				System.out.println(line);
			}
			input1.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ��ã��:"+file.getName());
//			e.printStackTrace();// (e=���� ã�� �̺�Ʈ?) �������� ���
		}
		
		MyFileUtils myutil = new MyFileUtils();
		
		try {
			myutil.sub10FromLargerNumber(15);
			myutil.sub10FromLargerNumber(5);
			myutil.sub10FromLargerNumber(25);
		} catch (Exception e) {
			System.out.println("�̰��� �Է¼��ڰ� 10���� ���� ����");
//			e.printStackTrace();
		}
		
	}
}
