package staticEx;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public int address;
	
	//������ �л��� �����Ҷ����� �ø��� ��ȣ�� �����Ѵ�.
	public Student(String name) {
		this.studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	//�޼ҵ� ���� ���
	public void showInfo() {
		System.out.printf("%s �л� ID: %d \n",studentName, studentID);
	}
	//�޼ҵ� ��, ��
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
