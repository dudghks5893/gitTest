package chapter11;

public class EqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student(100,"�̻��");
		Student s2 = s1; //�ּ� ����
		Student s3 = new Student(100,"�̻��");
		
		//s1��s2��
		if(s1 == s2) 
			System.out.println("s1��s2�ּҴ� �����ϴ�.");
		else
			System.out.println("s1��s2�ּҴ� Ʋ���ϴ�.");
		
		if(s1.equals(s2)) 
			System.out.println("s1��s2�ּҴ� �����մϴ�.");
		else
			System.out.println("s1��s2�ּҴ� �������� �ʽ��ϴ�.");
		
		System.out.println("==========================");
		
		//s1�� s3��
		if(s1 == s3) 
			System.out.println("s1��s3�ּҴ� �����ϴ�.");
		else
			System.out.println("s1��s3�ּҴ� Ʋ���ϴ�.");
		
		if(s1.equals(s3)) 
			System.out.println("s1��s3�ּҴ� �����մϴ�.");
		else
			System.out.println("s1��s3�ּҴ� �������� �ʽ��ϴ�.");
		
	}

}


class Student{
	int studentId;
	String studentName;
	
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //�񱳴���� ��ü�� �л�Ŭ�����ΰ�?
			Student std = (Student)obj; //Student�� ĳ���� (����ȯ)
			if(this.studentId==std.studentId) { //���̵� ������ ���� �л��̴�(����)
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
/*equals ���� �ڵ�*/	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + studentId;
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studentId != other.studentId)
//			return false;
//		return true;
//	}

	
	
	
}