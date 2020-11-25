package chapter9;

//추상 클래스를 상속받은 추상클래스
public abstract class NoteBook extends Computer {
	
	public void display() {
		System.out.println("노트북 디스플레이");
	}
}

//NoteBook 추상클래스를 상속받아 아직도 구현되지 않은 메소드가 있으면 구현
class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("노트북 타이핑!");
	}
	
}