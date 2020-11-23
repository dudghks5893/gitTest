package chapter7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList<Integer> num = new ArrayList<Integer>
		ArrayList<Book> library = new ArrayList<>();
		
		//�Է� �޼ҵ� add
		library.add (new Book("�¹���","������"));
		library.add (new Book("���̾�","�츣�� �켼"));
		library.add (new Book("��� �� ���ΰ�","���ù�"));
		library.add (new Book("����","�ڰ渮"));
		library.add (new Book("�����","�����㺣��"));
		
		System.out.println(library.size());
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i); //get(�ε�����ȣ)�� �ϳ��� ������.
			book.showBookInfo();
			//library[i].showInfo();
		}
		System.out.println("=== ���� for�� ===");
		for(Book x  : library) {
			x.showBookInfo();
		}
	}

}