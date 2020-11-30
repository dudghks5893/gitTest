package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		IntStream //정수 스트림
		.range(1, 10) //숫자 1부터 10까지(정수)
		.skip(5) //처음부터 5개 요소를 넘김
		.forEach(x-> System.out.println(x));
		
		System.out.println();
		
		int val = IntStream
				.range(1, 5)	//1~5까지
				.sum();			//합계
		System.out.println(val);
		
		Stream.of("Hello", "bottole", "Africa")
		.sorted()  //정렬:알파벳순
		.findFirst()   //첫번째
		.ifPresent((x) -> System.out.println(x));
		
		String[] items = {"치킨","원숭이","고릴라","치약","고라니","치과","고양이"};
		Stream.of(items)
			.filter((x) -> x.startsWith("치"))	//필터로 치로 시작하는 요소만 꺼냄
			.sorted()							//정렬:알파벳순
			.forEach(x -> System.out.print(x + ","));
	
		System.out.println(); //칸 뛰우기용
		
		Arrays.stream(new int[] {2,4,6,8,10})
		.map( x -> x*x)  //전체 요소에 실행 x에 제곱
		.average()		 //평균
		.ifPresent(n -> System.out.print(n)); //출력
		
		
	}

}
