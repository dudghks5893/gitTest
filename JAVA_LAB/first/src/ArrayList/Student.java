package ArrayList;

import java.util.ArrayList;

public class Student {

		int studentID;
		String studentName;
		ArrayList<Subject> su; // ArrayList �����ϱ�
		
		//������
		public Student(int studentID, String studentName ) {
			this.studentID = studentID;
			this.studentName = studentName;
			su = new ArrayList<Subject>(); // ArrayList �����ϱ�
		}
		public void addSubject(String name, int score) {
			Subject sub = new Subject(); //Subject �����ϱ�
			sub.setName(name);	//���� �̸� �߰��ϱ�
			sub.setScorePoint(score); //���� �߰��ϱ�
			su.add(sub); //�迭�� �����ϱ�
			
		}
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : su) {
				total += s.getScorePoint(); //���� ���ϱ�
					System.out.println("�л�"+studentName+"��"+s.getName()+"���� ������"
						+s.getScorePoint()+"�Դϴ�.");
			}
			System.out.println("�л�"+ studentName+"�� ������"+total+"�Դϴ�.");
		}
		
		
		
	
}
