import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
//		System.out.println();
//		System.in
//		Scanner input = new Scanner(System.in);
		
//		for(int i=0; i<3; i++) {
//		System.out.println("아무 내용이나 입력:");
//		String enteredText = input.nextLine(); //입력 내용을 한줄 즉 엔터를 칠때까지
//		System.out.println(enteredText);
//		}
		
		File file = null; // try안에서 입력한거는 밖에서 쓸수 없기에 밖에서 쓸려면 밖에서 선언해줘야함.
		try { // 트라이 안에서 에러 발생시 catch로 넘어감 에러가 없으면 트라이에서 실행하고 케치는 넘어감
			File file1 = new File("myfile.txt");
			Scanner input1 = new Scanner(file1); //파일을 여는 객체
			while(input1.hasNextLine()) { //다음 라인이 있을경우
				String line = input1.nextLine();
				System.out.println(line);
			}
			input1.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾음:"+file.getName());
//			e.printStackTrace();// (e=에러 찾는 이벤트?) 에러내용 출력
		}
		
		MyFileUtils myutil = new MyFileUtils();
		
		try {
			myutil.sub10FromLargerNumber(15);
			myutil.sub10FromLargerNumber(5);
			myutil.sub10FromLargerNumber(25);
		} catch (Exception e) {
			System.out.println("이것은 입력숫자가 10보다 작은 에러");
//			e.printStackTrace();
		}
		
	}
}
