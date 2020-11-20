package method;

public class ex5 {

	public static void main(String[] args) {
		wear(2400, 2000);
		wear(3800, 1200);

	}

	private static void wear (int hp, int mp) {
		//체력 마력 2000 이상일때 아이템을 장착가능
		if(hp>=2000 && mp>=2000) {
			System.out.println("아이템 장착 완료!");
		}
		else {
			System.out.println("아이템을 장착할 수 없습니다.");
		}
	}
}
