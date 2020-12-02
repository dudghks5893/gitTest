
public class MyFileUtils {
	
	//이 메소드에서 우리가 원하는 예외처리를 하기위해 이름옆에 throws Exception
	public int sub10FromLargerNumber(int number) throws Exception{
		if(number < 10){
			throw new Exception("숫자가 10보다 작음");
		}
		
		return number - 10;
	}
}
