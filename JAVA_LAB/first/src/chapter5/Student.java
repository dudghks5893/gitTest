package chapter5;

public class Student {

		//������� (Ŭ���� �ȿ� �ִ� ����)
		int studentID;	//�й�
		private String studentName;	//�̸�
		int grade;	//�г�
		String address;	//�ּ�
		//�޼��� : ����������� ����Ҽ� �ִ�.
		
		//�ڵ� get�� set���� Source-> Generate Getters and Setters ��.
		
		//get �� set �޼ҵ带 �����.
		public String getStudentName() { 
			return studentName; //���� ����� �л��̸��� ����, �������� get
		}
		public void setstudentName(String name) {
			studentName = name;//�ٸ� Ŭ������ ������ set 
		}
		public int getGrade() {
			return grade;//�ڵ� get�� set���� Source-> Generate Getters and Setters ��.
		}
		public void setGrade(int grade) {
			this.grade = grade;//�ڵ� get�� set���� Source-> Generate Getters and Setters ��.
		}
		public void showStudentInfo() {
			System.out.println(studentName +","+ address);
			//�ܼ�â�� �л��̸���, �ּҸ� ����Ѵ�.
		}

		public static void main(String[] args) {
			int num1 = 10;
			Student st1 = new Student();// �л� ��ü�� ����
			st1.studentName = "������";
			st1.address = "�λ�����";
			Student st2 = new Student();//�ι�° �л� ��ü�� ����
			st2.studentName = "�̼���";
			st2.address = "�뿵";
			
			System.out.println(num1);
			System.out.println(st1.getStudentName());
			System.out.println(st2.getStudentName());
			st1.showStudentInfo();
			st2.showStudentInfo();
			
		}

}