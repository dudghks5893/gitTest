package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer lee = new TravelCustomer("이순신",40,100);
		TravelCustomer kim = new TravelCustomer("김유신",20,100);
		TravelCustomer hong = new TravelCustomer("홍길동",13,50);
		
		List<TravelCustomer> cList = new ArrayList<TravelCustomer>();
		
		cList.add(lee);
		cList.add(kim);
		cList.add(hong);
		
		System.out.println("=== 고객 명단 추가된 순서대로 출력===");
		cList.stream()	//리스트에 스트림 만들기
				.map(c -> c.getName()) //이름값만 리스트
				.forEach(s -> System.out.println(s));
		
		int total = cList.stream()
							.mapToInt(c -> c.getPrice()) // 맵 타입을 투 인트로 숫자형으로 변환
							.sum(); 	//더하기
		System.out.println("총 여행 경비는:"+total+"입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력==");
		cList.stream()
				.filter(c -> c.getAge() >= 20)
				.map(c -> c.getName())
				.sorted()
				.forEach(s -> System.out.println(s));
	}

}
