package chapter7;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5]; // 실수 배열 5칸
		int size = 0; // 유효(값이 들어잇는) 칸의 사이즈
		data[0] = 10.0; size++; //값을 하나 입력하고 사이즈 증가
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;

		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}

}
