package chapter7;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5]; // �Ǽ� �迭 5ĭ
		int size = 0; // ��ȿ(���� ����մ�) ĭ�� ������
		data[0] = 10.0; size++; //���� �ϳ� �Է��ϰ� ������ ����
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;

		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}

}