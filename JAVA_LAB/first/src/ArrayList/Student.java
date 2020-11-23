package ArrayList;

import java.util.ArrayList;

public class Student {

		int studentID;
		String studentName;
		ArrayList<Subject> su; // ArrayList 선언하기
		
		//생성자
		public Student(int studentID, String studentName ) {
			this.studentID = studentID;
			this.studentName = studentName;
			su = new ArrayList<Subject>(); // ArrayList 생성하기
		}
		public void addSubject(String name, int score) {
			Subject sub = new Subject(); //Subject 생성하기
			sub.setName(name);	//과목 이름 추가하기
			sub.setScorePoint(score); //점수 추가하기
			su.add(sub); //배열에 저장하기
			
		}
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : su) {
				total += s.getScorePoint(); //총점 더하기
					System.out.println("학생"+studentName+"의"+s.getName()+"과목 성적은"
						+s.getScorePoint()+"입니다.");
			}
			System.out.println("학생"+ studentName+"의 총점은"+total+"입니다.");
		}
		
		
		
	
}
