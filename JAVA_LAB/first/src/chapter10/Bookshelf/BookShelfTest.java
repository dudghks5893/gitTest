package chapter10.Bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf(); // 인터페이스 큐로 형변환
		shelfQ.enQueue("태백산맥1");
		shelfQ.enQueue("태백산맥2");
		shelfQ.enQueue("태백산맥3");
		
		BookShelf bs = (BookShelf)shelfQ; //북쉘프로 형변환
//		1-3
		bs.showQueue();

		System.out.println(shelfQ.deQueue());
		//4-6
 		bs.showQueue();
 		
 		System.out.println(shelfQ.deQueue());
 		//7-8
 		bs.showQueue();
 		
 		
 		System.out.println(shelfQ.deQueue());
 		bs.showQueue(); //9
 		
	}

}
