
public class MyFileUtils {
	
	//�� �޼ҵ忡�� �츮�� ���ϴ� ����ó���� �ϱ����� �̸����� throws Exception
	public int sub10FromLargerNumber(int number) throws Exception{
		if(number < 10){
			throw new Exception("���ڰ� 10���� ����");
		}
		
		return number - 10;
	}
}
