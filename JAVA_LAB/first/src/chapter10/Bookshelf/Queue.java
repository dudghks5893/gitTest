package chapter10.Bookshelf;

//인터페이스 큐
public interface Queue {
	//주상 메소드 3개
	void enQueue(String title);	//배열의 맨 마지막에 추가
	String deQueue();	//배열의 맨 처음 항목에 추가
	int getSize();		//현제 Queue에 있는 개수 반환
}


class BookShelf extends Shelf implements Queue {

	@Override // 리스트 shelf에 타이틀을 입력 => 아이템 입력
	public void enQueue(String title) {
		shelf.add(title); //상속 받은 Shelf 클래스의 shelf 어레이리스트
	}
	@Override // 리스트 shelf에 첫번째 인덱스요소를 삭제 => 아이템 삭제
	public String deQueue() {
		return shelf.remove(0); 
	}
	@Override //리스트 shelf의 현재 요소의 갯수 => 현재 개수 리턴
	public int getSize() {
		return getCount();
	}
//	 shelf 리스트에 모든 요소를 인덱스 번호와 같이 출력
	public void showQueue() {
		for (int i = 0; i<shelf.size();i++) {
			System.out.printf("인덱스 %d는 %s \n", i, shelf.get(i));
		}
		
	}
	
}