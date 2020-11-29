package chapter12.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("엄준식"));
		
		
		
		System.out.println(hashSet); 	//해시셋은 중복을 허용하지 않는다
										//순서없이 출력되네
	}

}
