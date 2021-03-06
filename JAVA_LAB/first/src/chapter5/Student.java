package chapter5;

public class Student {

		//멤버변수 (클래스 안에 있는 변수)
		int studentID;	//학번
		private String studentName;	//이름
		int grade;	//학년
		String address;	//주소
		//메서드 : 멤버변수들을 사용할수 있다.
		
		//자동 get과 set생성 Source-> Generate Getters and Setters 들어감.
		
		//get 과 set 메소드를 만든다.
		public String getStudentName() { 
			return studentName; //위에 선언된 학생이름을 리턴, 가져오다 get
		}
		public void setstudentName(String name) {
			studentName = name;//다른 클레스로 보내다 set 
		}
		public int getGrade() {
			return grade;//자동 get과 set생성 Source-> Generate Getters and Setters 들어감.
		}
		public void setGrade(int grade) {
			this.grade = grade;//자동 get과 set생성 Source-> Generate Getters and Setters 들어감.
		}
		public void showStudentInfo() {
			System.out.println(studentName +","+ address);
			//콘솔창에 학생이름과, 주소를 출력한다.
		}

		public static void main(String[] args) {
			int num1 = 10;
			Student st1 = new Student();// 학생 객체를 생성
			st1.studentName = "김유신";
			st1.address = "부산진구";
			Student st2 = new Student();//두번째 학생 객체를 생성
			st2.studentName = "이순신";
			st2.address = "통영";
			
			System.out.println(num1);
			System.out.println(st1.getStudentName());
			System.out.println(st2.getStudentName());
			st1.showStudentInfo();
			st2.showStudentInfo();
			
		}

}
