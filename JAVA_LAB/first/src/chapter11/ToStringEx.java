package chapter11;

public class ToStringEx {

	public static void main(String[] args) {
		
			//book1은 Book클래스의 참조변수라 하고 주소값을 가지고 있다.
		Book book1= new Book(200, "개미");
		Book book2= new Book(201, "거미");
		Book book3= null;
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1);
		System.out.println(book3);
		
	}

}


class Book {
	int bookNum;
	String bookTitle;
	
	
	public Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}


	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookTitle=" + bookTitle + "]";
	}
	

}