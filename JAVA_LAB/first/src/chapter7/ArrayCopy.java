package chapter7;

public class ArrayCopy {

	public static void main(String[] args) {
		// �迭�� �����Ѵ�.
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		//���1�� 0��°���� �����ؼ� ���2�� 1��°���� 4��°���� �ִ´�
		System.arraycopy(array1, 0 ,array2, 1, 4); 
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
