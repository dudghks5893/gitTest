package chapter7;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 테스트를 위해서 클래스는 사용 안함
		
//		int[] num= new int[] {12,2,15,4,5,46,7,88,95,30};
//		
//		for(int i=0; i<10; i++) { // 10회 반복
//			System.out.println(num[i]);
//	}		
			int[] num= new int[100];
			
			for(int i=0; i<100; i++) { // 10회 반복
//				num[i]= i*10+1; // 1,11,21,31,41....991
				num[i]= i*10; // 0,10,20,30,40....990
					
		}
			System.out.println(num[0]);
			System.out.println(num[99]);
			for(int j=0; j<num.length; j++) { // 값을 출력
				System.out.println(num[j]);
			}
	}

}
