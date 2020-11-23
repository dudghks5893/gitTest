package chapter7;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// 객체 배열 복사하기
		Book[] b1 = new Book[3];
		Book[] b2 = new Book[3];
		
		b1[0] = new Book("태백산맥","조정래");
		b1[1] = new Book("데미안","헤르만 헤세");
		b1[2] = new Book("어떻게 살 것인가","오시민");
		
		b2[0] = new Book(); // 디폴트 생성자
		b2[1] = new Book();
		b2[2] = new Book();
		
	// 책의 이름과 저자의 값만 b1 객체에서 b2객체로 복사
		for(int i=0; i < b1.length; i++) {
			b2[i].setBookName(b1[i].getBookName());
			b2[i].setAuthor(b1[i].getAuthor());
			

		}
		b1[0].setBookName("나목");
		b1[0].setAuthor("박완서");
		
		System.out.println("===== bookArray1 =====");
		
		for(int i=0; i<b1.length; i++) {
			b1[i].showBookInfo();
	}
		System.out.println("===== bookArray2 =====");
		
		for(int i=0; i<b2.length; i++) {
			b2[i].showBookInfo();
	}
}
}
