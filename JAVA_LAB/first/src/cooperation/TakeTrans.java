package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
	// 학생이 버스와 지하철 타기
		//학생 생성 (이름,money) 초기화
		Student s1 = new Student("제임스", 5000);
		Student s2 = new Student("토마스", 10000);
		Student s3 = new Student("영환", 10000000);
		
		Bus bus100 = new Bus(100);  //100번 버스 생성
		s1.takeBus(bus100); //제임스가 100번버스 탑승
		s1.showInfo();	//제임스 정보
		bus100.showInfo();	//100번 버스 정보
		
		Subway subwayGreen = new Subway("2호선"); //2호선 지하철 생성
		s2.takeSubway(subwayGreen);	//토마스가 2호선 탑승
		s2.showInfo();	//토마스 정보 출력
		subwayGreen.showInfo(); //지하철 정보 출력
		
		Taxi taxi= new Taxi(3000);
		s3.takeTaxi(taxi,5000); //영환이 텍시 탑승
		s3.showInfo(); // 영환 정보
		taxi.showInfo(); // 택시 정보
	}

}
