package staticEx;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public int address;
	
	//생성자 학생을 생성할때마다 시리얼 번호는 증가한다.
	public Student(String name) {
		this.studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	//메소드 정보 출력
	public void showInfo() {
		System.out.printf("%s 학생 ID: %d \n",studentName, studentID);
	}
	//메소드 겟, 셋
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
