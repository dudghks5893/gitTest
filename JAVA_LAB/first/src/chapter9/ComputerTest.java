package chapter9;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();	//추상클래스 객체생성 안딤
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();	//추상클래스 객체생성 안됨
		Computer c4 = new MyNoteBook();
	}

}
