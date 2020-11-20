package chapter4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		//사용자 입력을 받는 스캐너 클래스

 
		//오류 클릭 후 자바 유틸 더블클릭히고, 코드로 자동추가 (컨트롤 스페이스)

		Scanner scanner = new Scanner(System.in);

		System.out.println("층을 입력해 주세요 : ");		



		String floor;

 

		floor = scanner.next(); //사용자가 입력한 값을 저장한다.

 

		switch(floor) {


		case "5층" : 


			System.out.println("헬스클럽 입니다."); 


			break; //스위치문을 빠져나간다

		case "4층" : 

			System.out.println("치과입니다."); 

			break; //스위치문을 빠져나간다

		case "3층" : 

		System.out.println("피부과입니다."); 

			break; //스위치문을 빠져나간다
		
 		case "2층" : 

			System.out.println("정형외과 입니다."); 

			break; //스위치문을 빠져나간다

		case "1층" : 

			System.out.println("약국입니다."); 

			break; //스위치문을 빠져나간다

		default : 
		System.out.println("");

		}

	}

}