package chapter10.Bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf(); // �������̽� ť�� ����ȯ
		shelfQ.enQueue("�¹���1");
		shelfQ.enQueue("�¹���2");
		shelfQ.enQueue("�¹���3");
		
		BookShelf bs = (BookShelf)shelfQ; //�Ͻ����� ����ȯ
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