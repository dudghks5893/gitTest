package chapter7;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열을 복사한다.
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		//어레이1에 0번째부터 복사해서 어레이2에 1번째부터 4번째까지 넣는다
		System.arraycopy(array1, 0 ,array2, 1, 4); 
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
