package chapter7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList<Integer> num = new ArrayList<Integer>
		ArrayList<Book> library = new ArrayList<>();
		
		//입력 메소드 add
		library.add (new Book("태백산맥","조정래"));
		library.add (new Book("데미안","헤르만 헤세"));
		library.add (new Book("어떻게 살 것인가","오시민"));
		library.add (new Book("토지","박경리"));
		library.add (new Book("어린왕자","생텍쥐베리"));
		
		System.out.println(library.size());
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i); //get(인덱스번호)로 하나씩 꺼낸다.
			book.showBookInfo();
			//library[i].showInfo();
		}
		System.out.println("=== 향상된 for문 ===");
		for(Book x  : library) {
			x.showBookInfo();
		}
	}

}
