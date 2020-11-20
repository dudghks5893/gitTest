package chapter4;

public class ifExample1 {

	public static void main(String[] args) {
//		변수 선언
		int age=17;
		int charge;
//		제어문
		if(age<8) {
			charge=1000;
			System.out.println("취학전 아동입니다.");
			
		}
		else if(age<14){
			charge=2000;
			System.out.println("초등학생 입니다.");
			
		}
		else if(age<20) {
			charge=2500;
			System.out.println("중,고등학생 입니다.");
			
		}
		else {
			charge=3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는"+charge+"입니다.");
	}

}
