package chapter12.collection.hashmap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//사전이라고 생각 key값 문자열, value값 문자열
		HashMap<String, String> map = new HashMap<>();
		
		map.put("학생", "공부하는 사람이다.");
		map.put("지우개", "깨끗이 지웁니다.");
		map.put("에어컨", "온도를 낮춥니다.");
		map.put("손소독제", "코로나를 방지합니다.");
		
//		System.out.println(map);
//		System.out.println(map.get("지우개"));
		
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key));
			System.out.println();
		}
	}

}
