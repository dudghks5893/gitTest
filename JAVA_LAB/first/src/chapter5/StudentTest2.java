package chapter5;

public class StudentTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(); //�� �л� ��ü ����
		st1.setstudentName("�ȿ���");
		Student st2 = new Student(); //�� �л� ��ü ����
		st2.setstudentName("�Ƚ¿�");
		
		System.out.println(st1.getStudentName());
		System.out.println(st2.getStudentName());

	}

}
