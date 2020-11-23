package chapter7;

public class BookArray {

	public static void main(String[] args) {
		//��ü Ÿ�� �迭
		Book[] libray = new Book[5]; //5ĭ�� book ��ü �迭�� ����
		
		Book b1 = new Book("���̽�","��");
		Book b2 = new Book("�ڹ�","������");
		Book b3 = new Book("CSS","��ȯ");
		Book b4 = new Book("SQL","����Ŭ");
		Book b5 = new Book("HTML","���");
		
		libray[0] = b1;
		libray[1] = b2;
		libray[2] = b3;
		libray[3] = b4;
		libray[4] = b5;
		
		System.out.println(libray[1].getBookName());
		System.out.println(b2.getBookName());
		
		for(int i=0; i< libray.length; i++) {
			libray[i].showBookInfo();
		}
		for(int i=0; i< libray.length; i++) {
			System.out.println(libray[i]);
		}
	}

}

class Book{
	private String bookName;
	private String author;
	
	//������ 2��
	public Book() {} // ����Ʈ ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//�� �� �ڵ�����
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	} 
	public void showBookInfo() {
	    System.out.println(bookName +"," + author);
	}
}